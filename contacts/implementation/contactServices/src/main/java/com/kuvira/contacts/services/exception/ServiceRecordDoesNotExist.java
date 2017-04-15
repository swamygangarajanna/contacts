/**
 * @Copyright 2016 Kuvira Technologies
 */
package com.kuvira.contacts.services.exception;

public class ServiceRecordDoesNotExist extends RuntimeException {
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 6011726231541724696L;

	public ServiceRecordDoesNotExist(String message) {
		super(message);
	}
	
	public ServiceRecordDoesNotExist(String message,Throwable cause) {
		super(message,cause);
		
	}
}
