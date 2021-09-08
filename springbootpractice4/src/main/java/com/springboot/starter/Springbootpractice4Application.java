package com.springboot.starter;

import java.io.PrintStream;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class Springbootpractice4Application {

	public static void main(String[] args) {
		// 기본 제공 커스텀해서 사용하지 못하므로 객체 생성해서 사용하기
//		SpringApplication.run(Springbootpractice4Application.class, args);
		
//		SpringApplication app = new SpringApplication(Springbootpractice4Application.class);
//		app.setBannerMode(Banner.Mode.OFF); // 배너 끄고 싶을 떄
		
		// 배너 설정 - 코딩이 2순위,  txt 파일이 우선순위
//		app.setBanner(new Banner() {
//			@Override
//			public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
//				out.println("===========================");
//				out.println("어떤 배너가 나올까요");
//				out.println("===========================");
//			}
//		});
		
//		new SpringApplicationBuilder().main(Springbootpractice4Application.class).banner(new Banner() {
//			@Override
//			public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
//				out.println("===========================");
//				out.println("어떤 배너가 나올까요");
//				out.println("===========================");
//			}
//		});
//		app.run(args);
		
//		new SpringApplicationBuilder().sources(Springbootpractice4Application.class).run(args);
		
		// run configuration > VM argument > -Ddebug 디버그 로그까지 출력
		
		SpringApplication app = new SpringApplication(Springbootpractice4Application.class);
		
		// ApplicationListener<ApplicationStartingEvent> 동작시키기 위해 리스너 추가
//		app.addListeners(new SampleListener());
		
		app.setWebApplicationType(WebApplicationType.NONE);// SERVLET - 기본 mvc servlet, REACTIVE - 웹 플럭스가 들어있으면
		app.run(args);
	}

}
