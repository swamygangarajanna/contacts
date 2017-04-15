/**
 * @Copyright 2016 Kuvira Technologies
 */
package com.kuvira.contacts.app.dao.exceptions;

/**
 * class for handling CreationFailureException							
 * @author swamymg
 *
 */
public class DeletionFailureException extends RuntimeException {

	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -7516555717962134980L;

	public DeletionFailureException(String message) {
		super(message);
	}
	
	public DeletionFailureException(String message,Throwable cause) {
		super(message,cause);
		
	}
}
