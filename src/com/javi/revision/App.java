package com.javi.revision;

import com.javi.revision.oop.Boat;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		Boat defaultBoat = new Boat();
		Boat newBoat = new Boat("ABCDEF", "Sarah");

		System.out.println(defaultBoat.toString());
		System.out.println(newBoat.toString());

	}

}
