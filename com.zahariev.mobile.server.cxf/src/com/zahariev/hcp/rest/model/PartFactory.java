package com.zahariev.hcp.rest.model;

public class PartFactory {
	private static int partID = 0;

	public static Part getPart() {
		String partName = "Part[" + partID + "]";
		return getPart(partName);
	}

	public static Part getPart(String partName) {
		return new Part(partID++, partName);
	}
}
