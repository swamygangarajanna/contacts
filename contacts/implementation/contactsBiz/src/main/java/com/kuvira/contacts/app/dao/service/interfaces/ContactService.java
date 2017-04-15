/**
 * @Copyright 2016 Kuvira Technologies
 */
package com.kuvira.contacts.app.dao.service.interfaces;

import java.util.List;

import com.kuvira.contacts.app.dao.exceptions.BadRequestException;
import com.kuvira.contacts.app.dao.exceptions.UpdateFailureException;
import com.kuvira.contacts.app.dao.exceptions.CreationFailureException;
import com.kuvira.contacts.app.dao.exceptions.DeletionFailureException;
import com.kuvira.contacts.app.dao.exceptions.RecordDoesNotExist;
import com.kuvira.contacts.app.entities.Contact;

/**
 * Contact Service class to access the business apis
 * @author swamymg
 *
 */
public interface ContactService {
	
	public void addContact(Contact contact) throws CreationFailureException;
	public void updateContact(Contact contact) throws UpdateFailureException;
	public void deleteContact(String contact_name) throws DeletionFailureException,BadRequestException;
	public Contact getContact(String contactName) throws BadRequestException;
	public List<Contact> getAllContacts() throws BadRequestException;
}
