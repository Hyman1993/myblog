package com.penghuang.blog.service;

import com.penghuang.blog.domain.Authority;

/**
 * Authority 服务接口.
 * 
 * @since 1.0.0 2019年2月11日
 * @author <a href="https://penghuang1993.com">彭 煌</a>
 */
public interface AuthorityService {
	 
	
	/**
	 * 根据id获取 Authority
	 * @param Authority
	 * @return
	 */
	Authority getAuthorityById(Long id);
}
