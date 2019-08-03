package com.penghuang.blog.controller;

import java.util.Optional;

import javax.servlet.http.Cookie;
import javax.validation.ConstraintViolationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.penghuang.blog.domain.User;
import com.penghuang.blog.domain.Vote;
import com.penghuang.blog.service.BlogService;
import com.penghuang.blog.service.JavaMailServiceImpl;
import com.penghuang.blog.service.VoteService;
import com.penghuang.blog.util.ConstraintViolationExceptionHandler;
import com.penghuang.blog.vo.Response;

/**
 * 点赞控制器.
 * 
 * @since 1.0.0 2019年3月9日
 * @author <a href="https://penghuang1993.com">彭 煌</a>
 */
@Controller
@RequestMapping("/votes")
public class VoteController extends BaseController {

	@Autowired
	private BlogService blogService;

	@Autowired
	private VoteService voteService;
	
	/**
	 * 发表点赞
	 * 
	 * @param blogId
	 * @param VoteContent
	 * @return
	 */
	@PostMapping
	// @PreAuthorize("hasAnyAuthority('ROLE_ADMIN','ROLE_USER')") //
	// 不需指定角色权限，游客也能点赞
	public ResponseEntity<Response> createVote(Long blogId, boolean isLogin, String ip) {

		try {
			// 遍历cookie，查询是否已经点赞
			Cookie[] cookies = request.getCookies();
			if (cookies != null) {
				for (Cookie cookie : cookies) {
					if (("voteIpAddress" + String.valueOf(blogId)).equalsIgnoreCase(cookie.getName())) {
						return ResponseEntity.ok().body(new Response(false, "谢谢,您已经点过赞了!"));
					}
				}
			}

		blogService.createVote(blogId, isLogin, ip);
		Cookie cookie = new Cookie("voteIpAddress" + String.valueOf(blogId), ip);
		// 设置cookie的生命周期为一周,即每周一篇文章只能点赞一次
		cookie.setMaxAge(7 * 24 * 60 * 60);
		response.addCookie(cookie);
				
		} catch (ConstraintViolationException e) {
			return ResponseEntity.ok().body(new Response(false, ConstraintViolationExceptionHandler.getMessage(e)));
		} catch (Exception e) {
			return ResponseEntity.ok().body(new Response(false, e.getMessage()));
		}

		return ResponseEntity.ok().body(new Response(true, "点赞成功", null));
	}

	/**
	 * 删除点赞
	 * 
	 * @return
	 */
	@DeleteMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_ADMIN','ROLE_USER')") // 指定角色权限(登录用户)才能操作方法
	public ResponseEntity<Response> delete(@PathVariable("id") Long id, Long blogId) {

		boolean isOwner = false;
		Optional<Vote> optionalVote = voteService.getVoteById(id);
		User user = null;
		if (optionalVote.isPresent()) {
			user = optionalVote.get().getUser();
		} else {
			return ResponseEntity.ok().body(new Response(false, "不存在该点赞！"));
		}

		// 判断操作用户是否是点赞的所有者
		if (SecurityContextHolder.getContext().getAuthentication() != null
				&& SecurityContextHolder.getContext().getAuthentication().isAuthenticated() && !SecurityContextHolder
						.getContext().getAuthentication().getPrincipal().toString().equals("anonymousUser")) {
			User principal = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			// 在此处加上，若是管理员，则可随意删除(游客评论)
			if ((principal != null && user != null && user.getUsername().equals(principal.getUsername()))
					|| "admin".equals(principal.getUsername())) {
				isOwner = true;
			}
		}

		if (!isOwner) {
			return ResponseEntity.ok().body(new Response(false, "没有操作权限"));
		}

		try {
			blogService.removeVote(blogId, id);
			voteService.removeVote(id);
		} catch (ConstraintViolationException e) {
			return ResponseEntity.ok().body(new Response(false, ConstraintViolationExceptionHandler.getMessage(e)));
		} catch (Exception e) {
			return ResponseEntity.ok().body(new Response(false, e.getMessage()));
		}

		return ResponseEntity.ok().body(new Response(true, "取消点赞成功", null));
	}
}
