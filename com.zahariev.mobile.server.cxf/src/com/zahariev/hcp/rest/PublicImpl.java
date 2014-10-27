package com.zahariev.hcp.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.zahariev.hcp.rest.model.Machine;
import com.zahariev.hcp.rest.model.MachineFactory;

@Service("publicService")
public class PublicImpl implements Public{
	private static List<Machine> machines = null;

	private static void initMachines() {
		if (machines == null) {
			machines = new ArrayList<Machine>();
			for (int i = 0; i < 5; i++) {
				String systemName = "PublicSystem["+ i + "]";
				machines.add(MachineFactory.getMachine(systemName));
			}
		}
	}

	public PublicImpl() {
		initMachines();
	}

	public List<Machine> getMachines() {
		System.out.println("getMachines");
		return machines;
	}
}
