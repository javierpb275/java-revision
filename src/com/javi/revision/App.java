package com.javi.revision;

import com.javi.revision.enums.DayOfWeek;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		DayOfWeek day;
		day = DayOfWeek.SUNDAY;

		switch(day) {
			case SUNDAY:
			System.out.println("It's SUNDAY.");
			break;
			case MONDAY:
			System.out.println("It's MONDAY.");
			break;
			case TUESDAY:
			System.out.println("It's TUESDAY.");
			break;
			case WEDNESDAY:
			System.out.println("It's WEDNESDAY.");
			break;
			case THURSDAY:
			System.out.println("It's THURSDAY.");
			break;
			case FRIDAY:
			System.out.println("It's FRIDAY.");
			break;
			case SATURDAY:
			System.out.println("It's SATURDAY.");
			break;
		}

	}

}
