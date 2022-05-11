package com.javi.revision.oop;

public class Musician {
	public String name;
	public String surname;
	public String address;

	public String getNameSurname() {
		return name + " " + surname;
	}

	public String getNameSurname(boolean conDir) {
		return name + " " + surname;
	}


	@Override
	public String toString() {
		return getNameSurname();
	}

}
