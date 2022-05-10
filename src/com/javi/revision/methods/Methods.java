package com.javi.revision.methods;

public class Methods {

	public static void task1() {
		System.out.println("Task 1!");
		int store[] = { 1, 2 };
		completeMethod(store, '>');
	}

	public static String completeMethod(int[] numArray, char someChar) {
		for (int i = 0; i < numArray.length; i++) {
			System.out.print(someChar);
			System.out.println(numArray[i]);
		}
		return "Finished";
	}
}
