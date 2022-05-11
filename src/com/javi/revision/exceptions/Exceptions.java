package com.javi.revision.exceptions;

public class Exceptions {

	public static void exceptions() {

		int initialTotal = 11000;
		int participants = 0;
		int personTotal = 0;

		try {

			personTotal = calculate(initialTotal, participants);

		} catch (NumberFormatException e) {

			System.out.println("error 1");

		} catch (ArithmeticException e) {

			System.out.println("error 2");

		} catch (Exception e) {

			System.out.println("error 3");

		}

	}

	public static int calculate(int initialTotal, int participants) throws Exception {
		if (participants < 0 || participants > 20)
			throw new Exception();

		return initialTotal / participants;
	}

}
