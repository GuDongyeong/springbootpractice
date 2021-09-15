package com.springboot.starter;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

	@GetMapping(value = "/hello")
	public String hello() {
		throw new SampleException();
	}
	
	// 이 컨트롤러 안에서 발생하는 sampleexception예외가 발생하면 이 핸들러를 사용하겠다
	// 전역적으로 사용하고 싶으면 클래스 생성 controllerAdvice를 붙이고, 그 안에 exceptionHandler를 생성
//	@ExceptionHandler(SampleException.class)
//	public @ResponseBody AppError sampleError(SampleException e) {
//		
//		// 에러 정보가 담긴 클래스 임의로 설정
//		AppError appError = new AppError();
//		
//		appError.setMessage("error.app.key");
//		appError.setReason("idk");
//		return appError;
//	}

}
