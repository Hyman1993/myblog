package com.penghuang.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync(proxyTargetClass=true)   //开启异步注解功能
@SpringBootApplication
public class DemospringbootApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DemospringbootApplication.class, args);
	}

	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	        return builder.sources(DemospringbootApplication.class);
	    }
}

