package com.superbowldb.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.superbowldb.model.Contact;
import com.superbowldb.service.HomeService;

@Controller
public class HomeController {
	@Autowired
	private HomeService homeService;
	
	@RequestMapping("/")
	public String homePage() {
		return "home";
	}
	
	@RequestMapping(value="/addContact", method=RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
	public String contact(Contact contact) {
		homeService.addContact(contact);
		
		return "home";
	}
	
}
