package com.javi.revision.loops;

public class Loops {
	void forloop() {
		for (int a = 0; a < 10; a++) {
			System.out.println(a);
		}
	}

	void whileloop() {
		int num = 10;

		while (num != 0) {
			System.out.println(num--);
		}

		// num-- : 10
		// --num : 9
	}

	void doWhileloop() {
		int num = 10;

		do {
			System.out.println(num--);
		} while (num != 0);

	}
}
