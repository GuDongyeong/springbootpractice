package com.springboot.starter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {
	
	@GetMapping(value = "/hello")
	public String hello(Model model) {
		
		model.addAttribute("name", "dongyeong");
		
		return "hello";
	}


}
