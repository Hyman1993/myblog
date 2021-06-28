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
@PropertySource(value={"classpath:pageinfo_cn.properties"},name="pageinfo_cn.properties",encoding="UTF-8")
@ConfigurationProperties(prefix = "chinese")
public class ChinesePage extends CommonPage {}
