package com.javi.revision;

import com.javi.revision.oop.GuitarPlayer;
import com.javi.revision.oop.Musician;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		GuitarPlayer guitarPlayer1 = new GuitarPlayer();
		guitarPlayer1.name = "pepe";
		guitarPlayer1.surname = "perez";
		
		Musician musician1 = new Musician();
		musician1.name = "paco";
		musician1.surname = "rodriguez";
		
		System.out.println(guitarPlayer1.getNameSurname());
		System.out.println(musician1.getNameSurname());
	}

}
