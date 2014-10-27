package com.zahariev.hcp.rest.model;

import java.util.ArrayList;
import java.util.List;

public class MachineFactory {
	private static int systemID = 0;
	
	public static Machine getMachine(){
		String systemName = "System["+systemID + "]";
		return getMachine(systemName);
	}

	public static Machine getMachine(String systemName){
		List<Part> parts = new ArrayList<Part>();
		for(int i = 0; i < 10; i++){
			parts.add(PartFactory.getPart("Part[" + systemID + ":" + i + "]"));
		}
		return getMachine(systemName, parts);
	}

	public static Machine getMachine(String systemName, List<Part> parts){
		return new Machine(systemID++, systemName, parts);
	}
}
