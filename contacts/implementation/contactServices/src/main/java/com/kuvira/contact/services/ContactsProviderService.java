package com.kuvira.contact.services;

import java.net.URI;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Link;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kuvira.contact.response.model.AddressDTO;
import com.kuvira.contact.response.model.ContactDTO;
import com.kuvira.contacts.app.dao.exceptions.BadRequestException;
import com.kuvira.contacts.app.dao.exceptions.CreationFailureException;
import com.kuvira.contacts.app.dao.exceptions.DeletionFailureException;
import com.kuvira.contacts.app.dao.exceptions.UpdateFailureException;
import com.kuvira.contacts.app.dao.service.interfaces.ContactService;
import com.kuvira.contacts.app.entities.Address;
import com.kuvira.contacts.app.entities.Contact;
import com.kuvira.contacts.services.exception.ServiceBadRequestException;
import com.kuvira.contacts.services.exception.ServiceCreationFailureException;
import com.kuvira.contacts.services.exception.ServiceDeletionFailureException;
import com.kuvira.contacts.services.exception.ServiceUpdateFailureException;


@Path("/v1")
//@Component
public class ContactsProviderService {
    
	private static final String EMPTY = "";
	
	//@Autowired
	private ContactService contactService = getContactService();
	
	
	
	@Path("/add")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addContact(ContactDTO contacts){
		System.out.println("Service is called");
		Response response = null;
		Contact contact = getConatctsMapping(contacts);
		try {
			if(contactService != null){
				contactService.addContact(contact);
				response = Response.status(Status.CREATED).entity(contacts).build();
			}else{
				
				response = Response.status(Status.BAD_REQUEST).entity(contacts).build();
			}
		}catch (CreationFailureException e) {
	      throw new ServiceCreationFailureException(e.getMessage());
		}
		return response;
	}

	
	

	

	@Path("/readall")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllConatcts(){
		Response response = null;
		try {
			response = Response.status(Status.OK).entity(contactService.getAllContacts()).build();
			
		} catch (BadRequestException e) {
			throw new ServiceBadRequestException("Bad request");
		}
		return response;
	}
	
	
	@GET
	@Path("/read/{contact_name}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getContact(@PathParam("contact_name") String contact_name ,@Context UriInfo uriInfo){
		Response response = null;
		try {
			Contact contact = contactService.getContact(contact_name);
			ContactDTO conatctsDTOMapping = getConatctsDTOMapping(contact);
			URI uriPath = uriInfo.getBaseUriBuilder().
					      path(ContactsProviderService.class).
					      path(ContactsProviderService.class,"getContact").resolveTemplate("contact_name",contact_name).build();
			Link link =  Link.fromUri(uriPath).type("self").title("link to self").build();
			conatctsDTOMapping.getLinks().add(link);
			
			response = Response.status(Status.OK).entity(conatctsDTOMapping).build();
		} catch (BadRequestException e) {
			throw new ServiceBadRequestException("Bad request");
		}
		return response;
	}
	
	
	@PUT
	@Path("/update/{contact_name}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateContact(ContactDTO contactDTO,@PathParam("contact_name") String conatctName){
		Response response = null;
		
		if((conatctName != null && !EMPTY.equals(conatctName.trim())) && conatctName.equals(contactDTO.getContact_name())){
			
			Contact contact = getConatctsMapping(contactDTO);
			try {
				contactService.updateContact(contact);
				response = Response.status(Status.OK).entity(contactDTO).build();
			} catch (UpdateFailureException e) {
				throw new ServiceUpdateFailureException("Updating contact failed for the conatct :" + contactDTO.getContact_name());
			}
		}else if((conatctName == null || EMPTY.equals(conatctName.trim())) || !conatctName.equals(contactDTO.getContact_name())){
			throw new ServiceBadRequestException("It is a bad request");
		}
		return response;
	}
	
	@DELETE
	@Path("/delete/{contact_name}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response dleteConatct(@PathParam("contact_name") String contact_name){
		Response response = null;
		try {
			contactService.deleteContact(contact_name);
			response = Response.status(Status.OK).entity(contact_name).build();
		} catch (DeletionFailureException e) {
			throw new ServiceDeletionFailureException("Deletion of Conatct failed for the conatct : " + contact_name);
		} catch (BadRequestException e) {
			throw new ServiceBadRequestException("Bad request,deletion of Conatct failed for the conatct : " + contact_name);
		}
		return response;
	}
	
	private Contact getConatctsMapping(ContactDTO contacts) {
		Address address = new Address();
		address.setUnit(contacts.getAddress().getUnit());
		address.setArea(contacts.getAddress().getArea());
		address.setStreet(contacts.getAddress().getStreet());
		address.setState(contacts.getAddress().getStreet());
		address.setCountry(contacts.getAddress().getCountry());
		address.setPinCode(contacts.getAddress().getPincode());
		Contact contact = new Contact();
		contact.setContact_name(contacts.getContact_name());
		contact.setFirst_name(contacts.getFirst_name());
		contact.setLast_name(contacts.getLast_name());
		contact.setSur_name(contacts.getSur_name());
		contact.setMobile_number(contacts.getMobile_number());
		contact.setAddress(address);
		contact.setEmail(contacts.getEmail());
		contact.setContact_num(contacts.getContact_num());
		return contact;
	}
	
	
	private ContactDTO getConatctsDTOMapping(Contact contacts) {
		ContactDTO contact = new ContactDTO();
		AddressDTO address = new AddressDTO();
		if(contacts != null){
			
			address.setUnit(contacts.getAddress().getUnit());
			address.setArea(contacts.getAddress().getArea());
			address.setStreet(contacts.getAddress().getStreet());
			address.setState(contacts.getAddress().getStreet());
			address.setCountry(contacts.getAddress().getCountry());
			address.setPincode(contacts.getAddress().getPinCode());
			
			contact.setContact_name(contacts.getContact_name());
			contact.setFirst_name(contacts.getFirst_name());
			contact.setLast_name(contacts.getLast_name());
			contact.setSur_name(contacts.getSur_name());
			contact.setMobile_number(contacts.getMobile_number());
			contact.setAddress(address);
			contact.setEmail(contacts.getEmail());
			contact.setContact_num(contacts.getContact_num());
		}
		else{
			
		}
		return contact;
	}
	
	private ContactService getContactService() {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("service-bean.xml");
		applicationContext.registerShutdownHook();
		ContactService bean = (ContactService)applicationContext.getBean("contactService");
		System.out.println(" bean is ****** " + bean );
		return bean;
	}
	
}
