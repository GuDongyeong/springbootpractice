package com.springboot.starter.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// rest가 붙으면 return viewresolver가 아니라 messageconverters를 타게 된다
@RestController
public class UserController {

	@GetMapping("/hello")
	public @ResponseBody String hello() {
		return "hello";
	}
	
	@PostMapping("/user/create")
	public @ResponseBody User create(@RequestBody User user) {
		return user;
	}
}
