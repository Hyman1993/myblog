package com.penghuang.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.penghuang.blog.domain.Authority;

/**
 * Authority 仓库.
 *
 * @since 1.0.0 2019年2月11日
 * @author <a href="https://penghuang1993.com">彭 煌</a>
 */
@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long>{
}
