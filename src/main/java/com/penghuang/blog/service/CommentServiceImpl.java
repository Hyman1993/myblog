package com.penghuang.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.penghuang.blog.domain.Comment;
import com.penghuang.blog.repository.CommentRepository;

/**
 * 评论Comment Service接口实现类
 * @author <a href="https://penghuang1993.com">彭 煌</a>
 *
 */
@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentRepository commentRepository;
	
	@Override
	public Comment getCommentById(Long id) {
		return commentRepository.getOne(id);
	}

	@Override
	public void removeComment(Long id) {
		commentRepository.deleteById(id);
	}

}
