package com.springboot.starter;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlHeading1;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

@RunWith(SpringRunner.class)
@WebMvcTest(SampleController.class)
public class SampleControllerTest {
	
//	@Autowired
//	MockMvc mockMvc;
//	
//	@Test
//	public void hello() throws Exception {
//		
//		// 요청 "/hello"
//		// 응답
//		//	- 모델 name : dongyeong
//		// 	- 뷰 이름 : hello
//		mockMvc.perform(get("/hello")).andDo(print())
//				.andExpect(status().isOk())
//				.andExpect((ResultMatcher) content().string("dongyeong"))
//				.andExpect(view().name("hello"))
//				.andExpect(model().attribute("name", is("dongyeong")));
//				
//	}

	//-----------------------------------------------------
	//HTMLUnit 을 의존성주입받으면
	
	@Autowired
	WebClient webClient;
	
	// 둘다 사용할 수 있음
	@Autowired
	MockMvc mockMvc;
	
	@Test
	public void hello() throws Exception {
		HtmlPage page = webClient.getPage("/hello");
		HtmlHeading1 h1 = page.getFirstByXPath("//h1");
		assertThat(h1.getTextContent()).isEqualToIgnoringCase("dongyeong");
	}

}
