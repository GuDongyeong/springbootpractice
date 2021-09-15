package com.springboot.starter;

import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;


@RestController
public class SampleController {

	@GetMapping(value = "/hello")
	public EntityModel<Hello> hello() {
		Hello hello = new Hello();
		hello.setPerfix("Hey, ");
		hello.setName("dongyeong");
		
		//링크정보추가하는 방법은 다양.. 그중 하나
		EntityModel<Hello> entityModel = EntityModel.of(hello);
		entityModel.add(linkTo(methodOn(SampleController.class).hello()).withSelfRel());
		
		return entityModel;
	}

}
