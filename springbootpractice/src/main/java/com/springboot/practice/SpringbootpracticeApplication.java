package com.springboot.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootConfiguration
//@Configuration
//@ComponentScan
//@EnableAutoConfiguration 
// 빈을 등록하는 2가지 단계
// componentScan 으로 빈 등록
// @EnableAutoConfiguration 으로 등록
public class SpringbootpracticeApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(SpringbootpracticeApplication.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		application.run(args);
		//SpringApplication.run(SpringbootpracticeApplication.class, args);
	}

}
