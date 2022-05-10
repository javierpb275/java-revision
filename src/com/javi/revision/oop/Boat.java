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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Boat other = (Boat) obj;
		if (licensePlate == null) {
			if (other.licensePlate != null)
				return false;
		} else if (!licensePlate.equals(other.licensePlate))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
