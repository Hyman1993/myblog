package com.penghuang.blog.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

import com.penghuang.blog.domain.Blog;
import com.penghuang.blog.domain.User;

/**
 * java邮件服务(异步调用)
 * 
 * @author penghuang
 *
 */
@Service
public class JavaMailServiceImpl implements JavaMailService {

	@Autowired
	private JavaMailSenderImpl mailSender;
	@Value("${sys.from.mail}")
	private String sysMail;

	@Async//关于此注解的疑问(@Async异步的方法不能有返回值？还是说必须要接受返回值处理？)
	@Override
	public void sendSimpleMail(User user, Blog blog, String action) {

		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		String blogTitle = blog.getTitle();
		String blogUserEmail = blog.getUser().getEmail();
		String name = "";
		// 获取当前时间并格式化
		SimpleDateFormat sdf = new SimpleDateFormat();// 格式化时间
		sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");// a为am/pm的标记
		Date date = new Date();// 获取当前时间
		String time = sdf.format(date);
		if (user != null) {
			name = user.getName();
		} else {
			name = "有人";
		}
		// 设置收件人
		simpleMailMessage.setTo(blogUserEmail);
		// 设置发件人
		simpleMailMessage.setFrom(sysMail);
		// 设置发送时间
		simpleMailMessage.setSentDate(date);
		// 设置邮件标题
		simpleMailMessage.setSubject("【五花肉的博客网站】文章" + action + "通知");
		// 设置邮件内容
		// 邮件格式:XX于XX时间点赞或评论了你的文章:文章标题,赶紧去看看吧!
		simpleMailMessage.setText("@"+name + "　于　" + time + action + "了你的文章:【" + blogTitle + "】,赶紧去看看吧!");
		// 发送邮件
		try {
			mailSender.send(simpleMailMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
