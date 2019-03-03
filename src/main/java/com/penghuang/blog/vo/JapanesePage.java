package com.penghuang.blog.vo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

/**
 * 读取自定义文件,并将其属性映射到java VO中
 * 
 * @author penghuang
 *
 */
@Configuration
@PropertySource(value={"classpath:pageinfo_ja.properties"},name="pageinfo_ja.properties",encoding="UTF-8")
@ConfigurationProperties(prefix = "japanese")
public class JapanesePage {

	// header页面
	private String title; // 标题
	private String home; // 暴走的五花肉
	private String upToDate; // 最新
	private String hot; // 最热
	private String search;// 站内搜索
	private String personalPage;// 个人主页
	private String personalSet;// 个人设置
	private String writeBlogs;// 写博客
	private String systemManagement;
	private String login;// 登录
	private String logout;// 退出
	private String register;//注册

	// Page页面
	private String totalNums1; // 共
	private String totalNums2; // 条

	// footer页面

	// index 页面(主页)
	private String updateBefore;
	private String updateAfter;
	private String aboutMe;
	private String label;
	private String hotblogs;
	private String newBlogs;
	
	// login登录页面
	private String loginPlease;
	private String account;
	private String typeAccount;
	private String passwd;
	private String typePasswd;
	private String rememberMe;
	
	// register注册画面
	private String registerInfo;
	private String email;
	private String typeEmail;
	private String name;
	private String typeName;
	private String invitationCode;
	private String typeInvitationCode;
	private String submit;
	
	// u.html 用户空间页面
	private String personalInfo;
	private String catalog;
	private String searchInUser;
	
	// blog.html 博客页面
	private String mulu;
	private String tag;
	private String comment;
	private String commentArea;
	private String makeVote;
	private String cancelVote;
	private String makeComment;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUpToDate() {
		return upToDate;
	}

	public void setUpToDate(String upToDate) {
		this.upToDate = upToDate;
	}

	public String getHot() {
		return hot;
	}

	public void setHot(String hot) {
		this.hot = hot;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public String getPersonlPage() {
		return personalPage;
	}

	public void setPersonlPage(String personalPage) {
		this.personalPage = personalPage;
	}

	public String getPersonalSet() {
		return personalSet;
	}

	public void setPersonalSet(String personalSet) {
		this.personalSet = personalSet;
	}

	public String getWriteBlogs() {
		return writeBlogs;
	}

	public void setWriteBlogs(String writeBlogs) {
		this.writeBlogs = writeBlogs;
	}

	public String getSystemManagement() {
		return systemManagement;
	}

	public void setSystemManagement(String systemManagement) {
		this.systemManagement = systemManagement;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getLogout() {
		return logout;
	}

	public void setLogout(String logout) {
		this.logout = logout;
	}

	public String getTotalNums1() {
		return totalNums1;
	}

	public void setTotalNums1(String totalNums1) {
		this.totalNums1 = totalNums1;
	}

	public String getTotalNums2() {
		return totalNums2;
	}

	public void setTotalNums2(String totalNums2) {
		this.totalNums2 = totalNums2;
	}

	/**
	 * @return the home
	 */
	public String getHome() {
		return home;
	}

	/**
	 * @param home the home to set
	 */
	public void setHome(String home) {
		this.home = home;
	}

	/**
	 * @return the register
	 */
	public String getRegister() {
		return register;
	}

	/**
	 * @param register the register to set
	 */
	public void setRegister(String register) {
		this.register = register;
	}

	public String getPersonalPage() {
		return personalPage;
	}

	public void setPersonalPage(String personalPage) {
		this.personalPage = personalPage;
	}

	public String getAboutMe() {
		return aboutMe;
	}

	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getHotblogs() {
		return hotblogs;
	}

	public void setHotblogs(String hotblogs) {
		this.hotblogs = hotblogs;
	}

	public String getNewBlogs() {
		return newBlogs;
	}

	public void setNewBlogs(String newBlogs) {
		this.newBlogs = newBlogs;
	}

	public String getLoginPlease() {
		return loginPlease;
	}

	public void setLoginPlease(String loginPlease) {
		this.loginPlease = loginPlease;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getTypeAccount() {
		return typeAccount;
	}

	public void setTypeAccount(String typeAccount) {
		this.typeAccount = typeAccount;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getTypePasswd() {
		return typePasswd;
	}

	public void setTypePasswd(String typePasswd) {
		this.typePasswd = typePasswd;
	}

	public String getRememberMe() {
		return rememberMe;
	}

	public void setRememberMe(String rememberMe) {
		this.rememberMe = rememberMe;
	}

	public String getRegisterInfo() {
		return registerInfo;
	}

	public void setRegisterInfo(String registerInfo) {
		this.registerInfo = registerInfo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTypeEmail() {
		return typeEmail;
	}

	public void setTypeEmail(String typeEmail) {
		this.typeEmail = typeEmail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getInvitationCode() {
		return invitationCode;
	}

	public void setInvitationCode(String invitationCode) {
		this.invitationCode = invitationCode;
	}

	public String getTypeInvitationCode() {
		return typeInvitationCode;
	}

	public void setTypeInvitationCode(String typeInvitationCode) {
		this.typeInvitationCode = typeInvitationCode;
	}

	public String getSubmit() {
		return submit;
	}

	public void setSubmit(String submit) {
		this.submit = submit;
	}

	public String getUpdateBefore() {
		return updateBefore;
	}

	public void setUpdateBefore(String updateBefore) {
		this.updateBefore = updateBefore;
	}

	public String getUpdateAfter() {
		return updateAfter;
	}

	public void setUpdateAfter(String updateAfter) {
		this.updateAfter = updateAfter;
	}

	@Override
	public String toString() {
		return "JapanesePage [title=" + title + ", home=" + home + ", upToDate=" + upToDate + ", hot=" + hot
				+ ", search=" + search + ", personalPage=" + personalPage + ", personalSet=" + personalSet
				+ ", writeBlogs=" + writeBlogs + ", systemManagement=" + systemManagement + ", login=" + login
				+ ", logout=" + logout + ", register=" + register + ", totalNums1=" + totalNums1 + ", totalNums2="
				+ totalNums2 + ", updateBefore=" + updateBefore + ", updateAfter=" + updateAfter + ", aboutMe="
				+ aboutMe + ", label=" + label + ", hotblogs=" + hotblogs + ", newBlogs=" + newBlogs + ", loginPlease="
				+ loginPlease + ", account=" + account + ", typeAccount=" + typeAccount + ", passwd=" + passwd
				+ ", typePasswd=" + typePasswd + ", rememberMe=" + rememberMe + ", registerInfo=" + registerInfo
				+ ", email=" + email + ", typeEmail=" + typeEmail + ", name=" + name + ", typeName=" + typeName
				+ ", invitationCode=" + invitationCode + ", typeInvitationCode=" + typeInvitationCode + ", submit="
				+ submit + ", personalInfo=" + personalInfo + ", catalog=" + catalog + ", searchInUser=" + searchInUser
				+ ", mulu=" + mulu + ", tag=" + tag + ", comment=" + comment + ", commentArea=" + commentArea
				+ ", makeVote=" + makeVote + ", cancelVote=" + cancelVote + ", makeComment=" + makeComment + "]";
	}

	public String getPersonalInfo() {
		return personalInfo;
	}

	public void setPersonalInfo(String personalInfo) {
		this.personalInfo = personalInfo;
	}

	public String getCatalog() {
		return catalog;
	}

	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}

	public String getSearchInUser() {
		return searchInUser;
	}

	public void setSearchInUser(String searchInUser) {
		this.searchInUser = searchInUser;
	}

	public String getMulu() {
		return mulu;
	}

	public void setMulu(String mulu) {
		this.mulu = mulu;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getCommentArea() {
		return commentArea;
	}

	public void setCommentArea(String commentArea) {
		this.commentArea = commentArea;
	}

	public String getMakeVote() {
		return makeVote;
	}

	public void setMakeVote(String makeVote) {
		this.makeVote = makeVote;
	}

	public String getCancelVote() {
		return cancelVote;
	}

	public void setCancelVote(String cancelVote) {
		this.cancelVote = cancelVote;
	}

	public String getMakeComment() {
		return makeComment;
	}

	public void setMakeComment(String makeComment) {
		this.makeComment = makeComment;
	}

}
