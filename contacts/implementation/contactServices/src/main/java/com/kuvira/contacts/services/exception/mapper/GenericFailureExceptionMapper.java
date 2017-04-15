/**
 * @Copyright 2016 Kuvira Technologies
 */

package com.kuvira.contacts.services.exception.mapper;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.kuvira.contacts.services.exception.ServiceCreationFailureException;
import com.kuvira.contacts.services.exception.response.ErrorResponse;

/**
 *  Exception Mapper
 * 
 * @author swamymg
 *
 */
@Provider
public class GenericFailureExceptionMapper implements ExceptionMapper<ServiceCreationFailureException> {

	@Override
	public Response toResponse(ServiceCreationFailureException exception) {
		System.out.println("Exception resposnse Mapper is called !");
		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(getErrorResponse(exception)).build();
	}

	private ErrorResponse getErrorResponse(RuntimeException ex) {
		int errorCode = 500;

		if (ex instanceof ServiceCreationFailureException) {
			errorCode = 400;
		} 
		ErrorResponse resonse = new ErrorResponse(ex.getMessage(), errorCode, ex.getClass().getName());
		return resonse;

	}

}
