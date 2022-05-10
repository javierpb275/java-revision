package com.javi.revision.arrays;

import java.util.Random;

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

	void theMatrix() {

		int[][] twoDimensionalArray = new int[10][10];
		int[][][] threeDimensionalArray = new int[2][4][6];

		Random rand = new Random(System.nanoTime());

		for (int r = 0; r < twoDimensionalArray.length; r++) {

			for (int c = 0; c < twoDimensionalArray[0].length; c++) {

				twoDimensionalArray[r][c] = rand.nextInt(10);

			}
		}

		for (int i = 0; i < twoDimensionalArray.length; i++) {

			for (int j = 0; j < twoDimensionalArray[0].length; j++) {

				System.out.print(twoDimensionalArray[i][j]);
				System.out.print(" ");

			}

			System.out.println(" ");

		}

	}

}
