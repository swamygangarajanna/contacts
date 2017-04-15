/**
 * @Copyright 2016 Kuvira Technologies
 */

package com.kuvira.contacts.services.exception.response;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Error Ressonse Class
 * @author swamymg
 *
 */

@XmlRootElement
public class ErrorResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8417296848399249448L;
	
	String errorMessage;
	int errorCode;
	String errorDocumentation;
	
	
	
	public ErrorResponse(String errorMessage, int errorCode, String errorDocumentation) {
		super();
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
		this.errorDocumentation = errorDocumentation;
	}
	
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public int getErrorCode() {
		return errorCode;
	}
	
	public String getErrorDocumentation() {
		return errorDocumentation;
	}
	
}
