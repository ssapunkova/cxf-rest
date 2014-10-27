package com.zahariev.hcp.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Part {
	private int partNumber;
	private String partName;

	public Part() {
		super();
	}
	public Part(int partNumber, String partName) {
		super();
		this.partNumber = partNumber;
		this.partName = partName;
	}
	public int getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(int partNumber) {
		this.partNumber = partNumber;
	}
	public String getPartName() {
		return partName;
	}
	public void setPartName(String partName) {
		this.partName = partName;
	}
	@Override
	public String toString() {
		return "Part [partNumber=" + partNumber + ", partName=" + partName + "]";
	}
}
