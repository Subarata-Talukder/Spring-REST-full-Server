package com.subarata.springbootandrest.developer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.subarata.springbootandrest.model.Developer;

@RestController
public class DeveloperController {

	@Autowired
	private DeveloperSevice developerService;

	@RequestMapping("/developers")
	public List<Developer> developersInfo() {

		return developerService.getDevelopers();
	}

	@RequestMapping("/developer")
	public Developer developerInfo() {

		return developerService.getLeadDeveloper();
	}

	@RequestMapping("/developer/{developerId}")
	public Developer getDeveloperById(@PathVariable("developerId") Integer id) {

		return developerService.getDeveloperById(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/developer")
	public String addDeveloer(@RequestBody Developer developer) {

		return developerService.addDeveloper(developer);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/developer/{updateId}")
	public String updateDeveloper(@RequestBody Developer developer, @PathVariable("updateId") Integer id) {

		return developerService.updateDeveloper(developer, id);
	}
}
