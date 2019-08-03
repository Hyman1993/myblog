package com.penghuang.blog.service;

import com.penghuang.blog.domain.Blog;
import com.penghuang.blog.domain.User;

/**
 * 邮件发送服务接口.
 * 
 * @author <a href="https://penghuang1993.com">彭 煌</a>
 */
public interface JavaMailService {

	/**
	 *  发送简单邮件方法
	 * @param user 当前点赞或评论的用户
	 * @param blog 当前被点赞或评论的文章
	 * @param action 点赞还是评论的flag
	 */
	void sendSimpleMail(User user,Blog blog,String action);
}
