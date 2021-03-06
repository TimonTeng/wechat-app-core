package com.d.t.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;



@Configuration  
@ComponentScan(basePackages="com.d.t")  
@EnableAutoConfiguration  
@EntityScan(basePackages="com.d.t.model.db")  
@EnableJpaRepositories(basePackages="com.d.t.repository")  
@EnableRedisRepositories(basePackages="com.d.t.redis")
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
