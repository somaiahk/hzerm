package com.mckesson.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mckesson.bean.Person;
import com.mckesson.dto.request.PersonDTO;
import com.mckesson.service.PersonService;

@Component
@Path("/person")
public class PersonResource {
	
	@Autowired
	private PersonService service;
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addPerson(Person person){
		
		System.out.println("Pesron name" + person.getFirstName());
		return Response.ok().entity(service.createPerson(PersonDTO.mapToDto(person))).build();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getPerson(@PathParam("id") Integer id){
		return Response.ok().entity(service.getPerson(id)).build();		
	}

	@PUT
	public Response updatePerson(Person person){
	      service.update(person);
	        return Response.ok().build();
	    }
	
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public Response deletePerson(Integer id){
		 service.delete(id);
		return Response.ok().build();
		
	}
		
}
