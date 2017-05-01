package com.subarata.springbootandrest.welcome;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@RequestMapping("/welcome")
	public String welcome()
	{	
		return "Hello I am Subarata Chandra Talukder. In this project I developed "
				+ "Spring REST full web API apication.";
	}
}
