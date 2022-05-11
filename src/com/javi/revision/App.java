package com.javi.revision;

import com.javi.revision.oop2.classes.Plumber;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		Plumber p1 = new Plumber(12, 100);

		System.out.println(p1.getYearlySalary());
	}

}
