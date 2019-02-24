/**
 * 
 */
package com.penghuang.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.penghuang.blog.domain.Authority;
import com.penghuang.blog.repository.AuthorityRepository;

/**
 * Authority 服务.
 * 
 * @since 1.0.0 2019年2月11日
 * @author <a href="https://penghuang1993.com">彭 煌</a>
 */
@Service
public class AuthorityServiceImpl  implements AuthorityService {
	
	@Autowired
	private AuthorityRepository authorityRepository;
	
	@Override
	public Authority getAuthorityById(Long id) {
		return authorityRepository.getOne(id);
	}

}
