package com.javi.revision;

import com.javi.revision.oop.Student;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		Student student1 = new Student();
		
		student1.id = "123456789-X";
		student1.name = "Pepe";
		
		student1.showInfo();
	}

}
