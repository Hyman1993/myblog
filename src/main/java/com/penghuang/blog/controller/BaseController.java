package com.penghuang.blog.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
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
	protected HttpServletRequest request;

	@Autowired
	protected HttpServletResponse response;

	@Autowired
	private PageInfoConfig pageInfoConfig;
	
	
	/**
	 * 每次访问权均执行这个方法,以获取客户端的语言环境
	 * @param model
	 * @param loc
	 */
	@ModelAttribute
	public void initPage(Model model){
		
	String language = "";
	
	// 如果请求时带有语言选项，则说明客户端切换了显示语言
	if(!StringUtils.isEmpty(request.getParameter("lang"))){
		// 页面切换了语言
		String lang = request.getParameter("lang");
		// 将页面选择语言存入session
		request.getSession().setAttribute("lang",lang);
	}
	
	// 首先检测session,如果session中不存在，则设置成客户端默认语言
	if (request.getSession().getAttribute("lang") != null) {
		language = (String) request.getSession().getAttribute("lang");
	} else {
		language = request.getLocale().getLanguage().toLowerCase();
	}

	// 最终页面显示语言设定
	// 日文系统环境设定
	if ("ja".equalsIgnoreCase(language)) {
		model.addAttribute("pageInfo", pageInfoConfig.getJapanesePage());
		model.addAttribute("lang", "ja");
	} else if("en".equalsIgnoreCase(language)) {
		// 默认设置成英文环境
		model.addAttribute("pageInfo", pageInfoConfig.getEnglishPage());
		model.addAttribute("lang", "en");
	} else {
		// 默认设置成中文环境
		model.addAttribute("pageInfo", pageInfoConfig.getChinesePage());
		model.addAttribute("lang", "zh");
	}
	
	}

}
