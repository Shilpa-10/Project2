package org.code.java.start.controller;

import java.util.List;

import org.code.java.start.model.Contact;
import org.code.java.start.service.ContactBusiness;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	@GetMapping("/hi")
	public String welcome() {
		
		 
		return "contact";
	}
	
	@RequestMapping("/list_contact")
	
	public String listContact(Model model) {
		ContactBusiness business= new ContactBusiness();
	List<Contact> ContactList =	business.getList();
	model.addAttribute("contacts" ,ContactList);
	return "contact1";
	}

}
