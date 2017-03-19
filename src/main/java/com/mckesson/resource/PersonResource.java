package com.mckesson.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mckesson.service.PersonService;

@Component
@Path("/person")
public class PersonResource {
	
	@Autowired
	private PersonService service;
	
	@POST
	public Response addPerson(){
		return Response.ok().entity("Person has been created...").build();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getPerson(@PathParam("id") Integer id){
		return Response.ok().entity(service.getPerson(id)).build();		
	}

}
