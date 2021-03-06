package com.penghuang.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.penghuang.blog.domain.Comment;

/**
 * Comment Repository 接口,由spring jpa自动实现
 * @author <a href="https://penghuang1993.com">彭 煌</a>
 *
 */
public interface CommentRepository extends JpaRepository<Comment, Long> {

}
