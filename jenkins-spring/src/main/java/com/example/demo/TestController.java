package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/hello")
	public String hello() {
		return "<h1> heklloo in spring boot + jenkins </h1>";
	}
	
}
