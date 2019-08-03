package com.penghuang.blog.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.penghuang.blog.domain.Vote;
import com.penghuang.blog.repository.VoteRepository;

/**
 * 点赞Vote 服务实现.
 * @since 1.0.0 2019年4月9日
 * @author <a href="https://penghuang1993.com">彭 煌</a>
 */
@Service
public class VoteServiceImpl implements VoteService {

    @Autowired
    private VoteRepository voteRepository;
    
	@Override
	public Optional<Vote> getVoteById(Long id) {
		return voteRepository.findById(id);
	}
	
	@Override
	public void removeVote(Long id) {
		voteRepository.deleteById(id);
	}
}
