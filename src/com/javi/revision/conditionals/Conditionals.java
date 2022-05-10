package com.javi.revision.conditionals;

public class Conditionals {
	//
	void getGrade() {
		double grade = 4.6;
		if (grade < 5 || grade == 0) {
			System.out.println("F");
		} else if (grade > 5 && grade < 6) {
			System.out.println("Pass");
		} else if (grade >=6 && grade < 7) {
			System.out.println("Good");
		} else if (grade >= 7 && grade < 9) {
			System.out.println("Great");
		} else {
			System.out.println("Outstanding!");
		}
	}
}
