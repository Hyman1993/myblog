package com.penghuang.blog.service;

import com.penghuang.blog.domain.Comment;

/**
 * Comment Service接口
 * @author <a href="https://penghuang1993.com">彭 煌</a>
 *
 */
public interface CommentService {
	/**
    * 根据id获取 Comment
    * @param id
    * @return
    */
	Comment getCommentById(Long id);
   /**
    * 删除评论
    * @param id
    * @return
    */
   void removeComment(Long id);
}
