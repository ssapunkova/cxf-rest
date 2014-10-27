package com.zahariev.hcp.rest.model.test;

import java.util.ArrayList;
import java.util.List;

import com.zahariev.hcp.rest.model.Machine;
import com.zahariev.hcp.rest.model.MachineFactory;

public class ModelTest {
	private static List<Machine> machines = null;

	private static void initMachines() {
		if (machines == null) {
			machines = new ArrayList<Machine>();
			for (int i = 0; i < 5; i++) {
				machines.add(MachineFactory.getMachine());
			}
		}
	}

	public static void main(String[] args) {
		initMachines();
		for (Machine mac : machines) {
			System.out.println(mac);
		}
	}

}
