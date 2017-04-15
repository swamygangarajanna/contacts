/**
 * @Copyright 2016 Kuvira Technologies
 */

package com.kuvira.contacts.app.dao.exceptions;

/**
 * Exception classes to handle Duplication 
 * @author swamymg
 *
 */

public class CreationFailureException extends RuntimeException {

	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 4563916292959190723L;

	public CreationFailureException(String message) {
		super(message);
	}
	
	public CreationFailureException(String message,Throwable cause) {
		super(message,cause);
		
	}
}
