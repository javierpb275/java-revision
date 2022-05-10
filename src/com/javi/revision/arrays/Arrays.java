package com.javi.revision.arrays;

public class Arrays {

	void myArrays() {
		int data[] = new int[3];
		char data2[] = { 'a', 'b', 'c' };

		data[0] = 0;
		data[1] = 1;
		data[2] = 2;

		for (int a = 0; a < data.length; a++) {
			System.out.println(data[a]);

		}

		for (int b = 0; b < data2.length; b++) {
			System.out.println(data2[b]);
		}

	}

}
