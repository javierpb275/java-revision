package com.javi.revision.oop;

public class GuitarPlayer extends Musician {
	String guitarName;

	@Override
	public String getNameSurname() {
		return name + ":" + surname;
	}

}
