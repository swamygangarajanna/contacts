/**
 * @Copyright 2016 Kuvira Technologies
 */
package com.kuvira.contacts.services.exception;

/**
 * 
 * @author swamymg
 *
 */
public class ServiceBadRequestException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7979718432859545197L;

	public ServiceBadRequestException(String message) {
		super(message);
	}
	
	public ServiceBadRequestException(String message,Throwable cause) {
		super(message,cause);
		
	}
}
