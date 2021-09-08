package com.springboot.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleListener implements ApplicationRunner{
	
//	@Value("${dongyeong.fullName}")
//	private String name;
//
//	@Value("${dongyeong.age}")
//	private int age;
	
	@Autowired
	dongyeongProperties dongyeongProperties;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("=======================");
		System.out.println(dongyeongProperties.getName());
		System.out.println(dongyeongProperties.getAge());
		System.out.println("=======================");
	}
	
}	
