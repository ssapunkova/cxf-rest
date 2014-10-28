package com.zahariev.hcp.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import org.springframework.stereotype.Service;

import com.zahariev.hcp.rest.model.Machine;
import com.zahariev.hcp.rest.model.MachineFactory;

@Path("private")
@Service("privateService")
public class Private {
	private static List<Machine> machines = null;

	@Context
	UriInfo uriInfo;

	private static void initMachines() {
		if (machines == null) {
			machines = new ArrayList<Machine>();
			for (int i = 0; i < 5; i++) {
				String systemName = "PrivateSystem["+ i + "]";
				machines.add(MachineFactory.getMachine(systemName));
			}
		}
	}

	public Private() {
		initMachines();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON )
	public List<Machine> getMachines() {
		System.out.println("getMachines");
		return machines;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON )
	@Path("{macid}/")
	public Machine getMachine(@PathParam("macid") String strMacId) {
		System.out.println("getMachine(" + strMacId + ")");
		try {
			long macId = Long.parseLong(strMacId);
			for (Machine mac : machines) {
				if (mac.getSystemNumber() == macId) {
					return mac;
				}
				;
			}
		} catch (NumberFormatException e) {
			System.out.println("getMachine for " + strMacId + " is not a valid key:" + e);
		} catch (IllegalArgumentException e) {
			System.out.println("getMachine for " + strMacId + " gave exception:" + e);
		}
		return null;
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public int createMachine(Machine machineEntry) {
		System.out.println("createMachine(" + machineEntry + ")");
		machines.add(machineEntry);
		return machineEntry.getSystemNumber();
	}


}
