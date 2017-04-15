/**
 * @Copyright 2016 Kuvira Technologies
 */
package com.kuvira.contacts.app.dao.exceptions;

/**
 * class for handling CreationFailureException							
 * @author swamymg
 *
 */
public class UpdateFailureException extends RuntimeException {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4563916292959190723L;

	public UpdateFailureException(String message) {
		super(message);
	}
	
	public UpdateFailureException(String message,Throwable cause) {
		super(message,cause);
		
	}
}
