package com.zahariev.hcp.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.zahariev.hcp.rest.model.Machine;

@Path("v1")
public interface Public {
    @GET
    @Path("machines/")
    @Consumes({ MediaType.APPLICATION_JSON })
    @Produces({ MediaType.APPLICATION_JSON })
	public List<Machine> getMachines();

}
