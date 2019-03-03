package com.penghuang.blog.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.penghuang.blog.vo.ChinesePage;
import com.penghuang.blog.vo.JapanesePage;

@Configuration
public class PageInfoConfig {

	@Autowired
	public JapanesePage japanesePage;
	
	@Autowired
	private ChinesePage chinesePage;
	
	public JapanesePage getJapanesePage() {
		return japanesePage;
	}

	public void setJapanesePage(JapanesePage japanesePage) {
		this.japanesePage = japanesePage;
	}

	public ChinesePage getChinesePage() {
		return chinesePage;
	}

	public void setChinesePage(ChinesePage chinesePage) {
		this.chinesePage = chinesePage;
	}
}
