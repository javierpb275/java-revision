package com.javi.revision.conditionals;

public class Conditionals {

	void getGrade() {
		double grade = 4.6;
		if (grade < 5 || grade == 0) {
			System.out.println("F");
		} else if (grade > 5 && grade < 6) {
			System.out.println("Pass");
		} else if (grade >= 6 && grade < 7) {
			System.out.println("Good");
		} else if (grade >= 7 && grade < 9) {
			System.out.println("Great");
		} else {
			System.out.println("Outstanding!");
		}
	}

	void checkNumber() {
		int value = 1;

		switch (value) {
		case 1:
			System.out.println("It's one");
			break;
		case 2:
			System.out.println("It's two");
			break;
		case 3:
			System.out.println("It's three");
			break;
		default:
			System.out.println("It's neither one, nor two, nor three");
			break;
		}

	}

	void ternaryOperator() {
		boolean pass;
		int grade = 7;
		pass = grade >= 5 ? true : false;

		int roundedGrade;
		int grade2 = 6;

		roundedGrade = grade2 >= 5 ? 10 : 5;
	}

}
