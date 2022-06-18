package com.superbowldb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.superbowldb.model.Contact;
import com.superbowldb.repository.ContactRepository;

@Service
public class HomeService {
	@Autowired
	private ContactRepository contactRepository;
	
	public void addContact(Contact contact) {
		contactRepository.save(contact);
	}
}
