/**
 * @Copyright 2016 Kuvira Technologies
 */
package com.kuvira.contacts.services.exception;

/**
 * class for handling CreationFailureException							
 * @author swamymg
 *
 */
public class ServiceDeletionFailureException extends RuntimeException {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4563916292959190723L;

	public ServiceDeletionFailureException(String message) {
		super(message);
	}
	
	public ServiceDeletionFailureException(String message,Throwable cause) {
		super(message,cause);
		
	}
}
