package com.springboot.starter;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@WebMvcTest(SampleController.class)
public class SampleControllerTest {
	
	@Autowired
	MockMvc mockMvc;
	
	// json 변환 클래스
	@Autowired
	ObjectMapper objectMapper;
	
	@Test
	public void hello() throws Exception {
		mockMvc.perform(get("/hello"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(jsonPath("$._links.self").exists());
	}

}
