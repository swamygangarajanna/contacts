/**
 * @Copyright 2016 Kuvira Technologies
 */
package com.kuvira.contacts.app.dao.exceptions;

/**
 * 
 * @author swamymg
 *
 */
public class BadRequestException extends Exception {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1821784203437634414L;

	public BadRequestException(String message) {
		super(message);
	}
	
	public BadRequestException(String message,Throwable cause) {
		super(message,cause);
		
	}
}
