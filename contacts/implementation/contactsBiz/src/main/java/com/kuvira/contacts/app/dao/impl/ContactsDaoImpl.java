/**
 * @Copyright 2016 Kuvira Technologies
 */

package com.kuvira.contacts.app.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.CacheMode;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.kuvira.contacts.app.dao.exceptions.BadRequestException;
import com.kuvira.contacts.app.dao.exceptions.CreationFailureException;
import com.kuvira.contacts.app.dao.exceptions.DeletionFailureException;
import com.kuvira.contacts.app.dao.exceptions.UpdateFailureException;
import com.kuvira.contacts.app.dao.interfaces.ContactsDAO;
import com.kuvira.contacts.app.entities.Contact;

/**
 * DAO implementation for contacts
 * @author swamymg
 *
 */
@Repository("conatactsDAO")
//@Transactional
public class ContactsDaoImpl /*extends HibernateDaoSupport*/ implements ContactsDAO {

	private static final String SELCT_ALL_FROM_CONTACT = "from Contact";
	
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	//@Transactional
	public void addContact(Contact contact) throws CreationFailureException {
		
		try {
			//getHibernateTemplate().save(contact);
			
			Session session = sessionFactory.openSession();
			session.save(contact);
			session.flush();
			session.close();
			
		} catch (DataAccessException e) {
			throw new CreationFailureException("Creation of Contact failed for the conatct name :" + contact.getContact_name());
		}	
	}

	@Override
	//@Transactional
	public void updateContact(Contact contact) throws UpdateFailureException {
		try {
			//etHibernateTemplate().update(contact);
			Session session = sessionFactory.openSession();
			session.update(contact);
			session.flush();
			session.close();
			
		} catch (DataAccessException e) {
			throw new UpdateFailureException("Update contact failed for the conatct name :" + contact.getContact_name());
		}
	}

	@Override
	//@Transactional
	public void deleteContact(String contact_name) throws DeletionFailureException{
		//sessionFactory.getCurrentSession().delete(getContact(contact_name));
		try {
			//getHibernateTemplate().delete(getContact(contact_name));
			Session session = sessionFactory.openSession();
			session.delete(getContact(contact_name));
			session.flush();
			session.close();
			
		} catch (DataAccessException e) {
			throw new DeletionFailureException("Deletion contact failed for the conatct name :" + contact_name);
		}catch (BadRequestException e) {
			throw new DeletionFailureException("Conatct doesn't exist with for  :" + contact_name);
		}

	}

	@Override
	//@Transactional
	public Contact getContact(String contactName) throws BadRequestException {
		Contact contact = null;
		//return (Contact)sessionFactory.getCurrentSession().get(Contact.class,contactName);
		try {
			//contact = getHibernateTemplate().get(Contact.class,contactName);
			Session session = sessionFactory.openSession();
			session.get(Contact.class,contactName);
			session.close();
			
		} catch (DataAccessException e) {
			throw new BadRequestException("The request conatcts do not exist");
		}
		return contact;
	}

	@SuppressWarnings("rawtypes")
	@Override
	//@Transactional
	public List<Contact> getAllContacts() throws BadRequestException {
		List<Contact> conatcts = new ArrayList<Contact>();
		// conatcts= getHibernateTemplate().find(SELCT_ALL_FROM_CONTACT);
		Session session = sessionFactory.openSession();
		conatcts = session.createCriteria(Contact.class).list();
		/*Query createQuery = session.createQuery("");
		createQuery.setCacheable(true);
		createQuery.setCacheRegion("");*/
		session.close();
		return conatcts;
	
	}
	
/*	@Autowired
    public void anyMethodName(SessionFactory sessionFactory)
    {
        setSessionFactory(sessionFactory);
    }
*/
}
