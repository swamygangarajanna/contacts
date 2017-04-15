/**
 * @Copyright 2016 Kuvira Technologies
 */
package com.kuvira.contacts.app.dao.exceptions;

public class RecordDoesNotExist extends RuntimeException {
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 7979718432859545197L;

	public RecordDoesNotExist(String message) {
		super(message);
	}
	
	public RecordDoesNotExist(String message,Throwable cause) {
		super(message,cause);
		
	}
}
