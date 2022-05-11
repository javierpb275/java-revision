package com.javi.revision.oop;

public class Welder extends Person {
	public String title;

	@Override
	public String getData() {
		// call parent class method getData
		return super.getData() + " " + title;
	}

}
