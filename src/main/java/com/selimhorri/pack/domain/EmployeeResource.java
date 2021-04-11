package com.selimhorri.pack.domain;

import javax.inject.Inject;
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

import com.selimhorri.pack.entity.Employee;
import com.selimhorri.pack.service.EmployeeService;

@Path("/app/api/employees")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EmployeeResource {
	
	@Inject
	private EmployeeService employeeService;
	
	@GET
	public Response findAll() {
		return Response.ok(this.employeeService.findAll()).build();
	}
	
	@Path("/{id}")
	@GET
	public Response findById(@PathParam("id") final Integer id) {
		return Response.ok(this.employeeService.findById(id)).build();
	}
	
	@POST
	public Response save(final Employee employee) {
		return Response.ok(this.employeeService.save(employee)).build();
	}
	
	@PUT
	public Response update(final Employee employee) {
		return Response.ok().build();
	}
	
	@Path("/{id}")
	@DELETE
	public Response deleteById(@PathParam("id") final Integer id) {
		this.employeeService.deleteById(id);
		return Response.ok().build();
	}
	
	
	
}







