package com.javi.revision;

import com.javi.revision.oop.Pattern;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		Pattern p1 = Pattern.getPattern();
		Pattern p2 = Pattern.getPattern();
		Pattern p3 = Pattern.getPattern();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
