/**
 * @Copyright 2016 Kuvira Technologies
 */

package com.kuvira.contacts.services.exception.mapper;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.kuvira.contacts.services.exception.ServiceUpdateFailureException;
import com.kuvira.contacts.services.exception.response.ErrorResponse;

/**
 * Exception Mapper
 * 
 * @author swamymg
 *
 */
@Provider
public class UpdateExceptionMapper implements ExceptionMapper<ServiceUpdateFailureException> {

	@Override
	public Response toResponse(ServiceUpdateFailureException exception) {
		System.out.println("Exception resposnse Mapper is called !");
		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(getErrorResponse(exception)).build();
	}

	private ErrorResponse getErrorResponse(ServiceUpdateFailureException ex) {

		int errorCode = 500;

		if (ex instanceof ServiceUpdateFailureException) {
			errorCode = 400;
		} 

		ErrorResponse resonse = new ErrorResponse(ex.getMessage(), errorCode, ex.getClass().getName());
		return resonse;

	}

}
