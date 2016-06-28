package com.zahariev.hcp.rest.model;

import java.util.List;

public class Machine {
	private int systemNumber;
	private String systemName;
	private List<Part> parts;

	public Machine() {
		super();
	}

	public Machine(int systemNumber, String systemName, List<Part> parts) {
		super();
		this.systemNumber = systemNumber;
		this.systemName = systemName;
		this.parts = parts;
	}

	public int getSystemNumber() {
		return systemNumber;
	}

	public void setSystemNumber(int systemNumber) {
		this.systemNumber = systemNumber;
	}

	public String getSystemName() {
		return systemName;
	}

	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

	public List<Part> getParts() {
		return parts;
	}

	public void setParts(List<Part> parts) {
		this.parts = parts;
	}

	@Override
	public String toString() {
		return "Machine [systemNumber=" + systemNumber + ", systemName=" + systemName + ", parts=" + parts + "]";
	}

}
