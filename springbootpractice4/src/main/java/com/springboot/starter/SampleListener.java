package com.springboot.starter;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

// @Component- 빈등록하는 의미가 없어서 안해도됨 
//public class SampleListener implements ApplicationListener<ApplicationStartingEvent>{
// Application 맨 처음에 발생하는 이벤트, ApplicationContext(빈 객체 생성&관리) 만들어지기 이전에 발생해서 빈등록이 안됨?
// 그래서 직접 등록해줘야함
//	@Override
//	public void onApplicationEvent(ApplicationStartingEvent event) {
//		System.out.println("=======================");
//		System.out.println("Application is starting");
//		System.out.println("=======================");
//	}
//}

//@Component
//public class SampleListener implements ApplicationListener<ApplicationStartedEvent>{
//	@Override
//	public void onApplicationEvent(ApplicationStartedEvent event) {
//		System.out.println("=======================");
//		System.out.println("Application is started");
//		System.out.println("=======================");
//	}
//
//}


//@Component
//public class SampleListener {
//
//	// 빈의 생성자가 한개고 그 생성자의 파라미터가 한개이고 빈일 떄 스프링이 알아서 의존성 주입을 해준다.
//	public SampleListener(ApplicationArguments arguments) {
//		System.out.println("foo: " + arguments.containsOption("foo"));
//		System.out.println("bar: " + arguments.containsOption("bar"));
//	}
//
//}	
@Component
public class SampleListener implements ApplicationRunner{
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("foo: " + args.containsOption("foo")); // jvm option은 받지 못함
		System.out.println("bar: " + args.containsOption("bar")); // application argument 만 받는다
		
	}
	
}	
