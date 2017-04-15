/**
 * @Copyright 2016 Kuvira Technologies
 */
package com.kuvira.contacts.app.dao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kuvira.contacts.app.dao.exceptions.BadRequestException;
import com.kuvira.contacts.app.dao.exceptions.CreationFailureException;
import com.kuvira.contacts.app.dao.exceptions.DeletionFailureException;
import com.kuvira.contacts.app.dao.exceptions.UpdateFailureException;
import com.kuvira.contacts.app.dao.interfaces.ContactsDAO;
import com.kuvira.contacts.app.dao.service.interfaces.ContactService;
import com.kuvira.contacts.app.entities.Contact;


/**
 * ContactServiceImpl implementation for contacts service
 * @author swamymg
 *
 */
@Service("contactService")
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactsDAO conatactsDAO;
	
	@Transactional
	public void addContact(Contact contact) throws CreationFailureException{
		conatactsDAO.addContact(contact);

	}

	@Transactional
	public void updateContact(Contact contact) throws UpdateFailureException {
		conatactsDAO.updateContact(contact);

	}

	@Transactional
	public void deleteContact(String contact_name) throws DeletionFailureException, BadRequestException {
		conatactsDAO.deleteContact(contact_name);

	}

	@Transactional
	public Contact getContact(String contactName) throws BadRequestException {
		
		return conatactsDAO.getContact(contactName);
	}

	@Transactional
	public List<Contact> getAllContacts() throws BadRequestException {
		return conatactsDAO.getAllContacts();
	}

}
