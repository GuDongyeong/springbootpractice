package com.springboot.starter;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	// 한곳에서 cors 설정 가능
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		
		registry.addMapping("/hello")
			.allowedOrigins("http://localhost:18080");
	}
}
