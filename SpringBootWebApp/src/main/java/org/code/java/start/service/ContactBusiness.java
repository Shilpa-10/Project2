package org.code.java.start.service;

import java.util.ArrayList;
import java.util.List;

import org.code.java.start.model.Contact;

public class ContactBusiness {
	
	public List<Contact> getList(){
	List<Contact> listContact=  new ArrayList<>();
	
	listContact.add(new Contact("Marry","marry@gmail.com","USA"));
	listContact.add(new Contact("John","john@email.com","UK"));
	listContact.add(new Contact("Roy","roy@gmail.com","Norway"));
	listContact.add(new Contact("Rey","rey@email.com","Denmark"));
	
	return listContact;
	

}
}
