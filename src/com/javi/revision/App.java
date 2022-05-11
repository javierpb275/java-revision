package com.javi.revision;

import com.javi.revision.oop.Person;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		Person.info = "";
		Person.sayHello();

		Person p1 = new Person();
	}

}
