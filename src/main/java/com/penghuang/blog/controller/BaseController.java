package com.penghuang.blog.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.penghuang.blog.config.PageInfoConfig;


/** 
 *  基础controller
 * @author penghuang
 *
 */
@Controller
public class BaseController {

	@Autowired
    private HttpServletRequest  request;
	
	protected String language;
	
	protected String ipAddress;
	
	@Autowired
	private PageInfoConfig pageInfoConfig;
	
	
	/**
	 * 每次访问权均执行这个方法,以获取客户端的语言环境
	 * @param model
	 * @param loc
	 */
	@ModelAttribute
	public void initPage(Model model){
		// 获取系统语言
		language = request.getLocale().getLanguage().toLowerCase();
		System.out.println("系统语言:" + language);
		// 获取客户端ip
		
		// 日文系统环境
		if("ja".equalsIgnoreCase(language)) {
			model.addAttribute("pageInfo", pageInfoConfig.getJapanesePage());
		}else {
			// 默认设置成中文环境
			model.addAttribute("pageInfo", pageInfoConfig.getChinesePage());
		}
		
	}

}
