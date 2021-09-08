package com.springboot.starter;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;

//@TestPropertySource(properties = "dongyeong.name=dydy2")
@TestPropertySource(locations = "classpath:/test.properties")
@SpringBootTest(properties = "dongyeong.name=dydy2")
class Springbootpractice5ApplicationTests {
	
	@Autowired
	Environment environment;

	@Test
	void contextLoads() {
		assertThat(environment.getProperty("dongyeong.name"))
				.isEqualTo("dydy2");
	}

}
