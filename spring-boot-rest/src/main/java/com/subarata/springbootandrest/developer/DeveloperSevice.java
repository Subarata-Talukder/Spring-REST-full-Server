package com.subarata.springbootandrest.developer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.subarata.springbootandrest.model.Developer;

@Service
public class DeveloperSevice {

	private List<Developer> developerList = new ArrayList<>();
	private List<Developer> tempList;

	protected List<Developer> getDevelopers() {

		tempList = new ArrayList<>();
		Iterator<Developer> developers = developerList.iterator();

		while (developers.hasNext()) {

			Developer dlop = developers.next();

			tempList.add(dlop);
		}

		return tempList;
	}

	protected Developer getLeadDeveloper() {

		Developer developer = new Developer();

		developer.setName("Subarata Chandra Talukder");
		developer.setEducation("M.Sc. in Computer Science & Engineering");
		developer.setDesignation("Software Engineer");
		developer.setWorkingFields("Android, iOS, Sencha Extjs, Java Spring, PHP Codeigniter");
		developer.setMessage("Hi and hello every one this my spring boot application. You may "
				+ "get help from basic idea of the spring boot development");

		return developer;
	}

	protected Developer getDeveloperById(Integer id) {

		if (developerList.size() > id)

			return developerList.get(id);

		return null;
	}

	protected String addDeveloper(Developer name) {

		developerList.add(name);

		return "Developer added Succesfully";
	}

	public String updateDeveloper(Developer developer, Integer id) {

		if (developerList.size() > id) {
			developerList.set(id, developer);
			return "Updated";
		}
		
		return "Update failed";
	}
}
