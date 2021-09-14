package com.springboot.starter.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@EnableWebMvc// 직접 mvc 설정 재정의
@Configuration // mvc 확장
public class WebConfig implements WebMvcConfigurer{
	
	// 스프링부트의 resourceHandler를 유지하면서 기능확장
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		
		registry.addResourceHandler("/m/**")  // 주소
				.addResourceLocations("classpath:/m/") //리소스 위치
				.setCachePeriod(20);
	}

}
