package com.d.t.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.d.t.interceptor.SysUserAccessApiInterceptor;

@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {
	
	private final Logger log = LogManager.getLogger(getClass());

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		log.info("init WebConfig");
		registry.addInterceptor(new SysUserAccessApiInterceptor())
				.addPathPatterns("/**").excludePathPatterns("/sys/**");
	}

}
