package com.javi.revision.oop;

public class Boat {
	public String licensePlate;
	public String name;

	// default constructor
	public Boat() {
		this.licensePlate = "DEFAULTLICENSEPLATE";
		this.name = "default name";
	}

	public Boat(String lP, String name) {
		this.licensePlate = lP;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Boat [licensePlate=" + licensePlate + ", name=" + name + "]";
	}

}
