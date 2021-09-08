package com.springboot.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
//@EnableConfigurationProperties(dongyeongProperties.class) // 클래스에 프로퍼티스 등록
public class Springbootpractice5Application {

	public static void main(String[] args) {
		SpringApplication.run(Springbootpractice5Application.class, args);
	}

}
