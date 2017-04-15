/**
 * @Copyright 2016 Kuvira Technologies
 */

package com.kuvira.contacts.services.exception;

/**
 * Exception classes to handle Duplication 
 * @author swamymg
 *
 */

public class ServiceCreationFailureException extends RuntimeException {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6928823046436581737L;
	

	public ServiceCreationFailureException(String message) {
		super(message);
	}
	
	public ServiceCreationFailureException(String message,Throwable cause) {
		super(message,cause);
		
	}
}
