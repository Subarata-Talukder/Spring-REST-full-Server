package com.subarata.springbootandrest.developer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subarata.springbootandrest.model.Developer;

@RestController
public class DeveloperController {

	@RequestMapping("/developer")
	public Developer developerInfo(){	
		Developer developer = new Developer();
		developer.setName("Subarata Chandra Talukder");
		developer.setEducation("M.Sc. in Computer Science & Engineering");
		developer.setDesignation("Software Engineer");
		developer.setWorkingFields("Android, iOS, Sencha Extjs, Java Spring, PHP Codeigniter");
		developer.setMessage("Hi and hello every one this my spring boot application. You may "
				+ "get help from basic idea of the spring boot development");
		
		return developer;
	}
}
