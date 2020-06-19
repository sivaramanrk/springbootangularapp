package com.springboot.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinAvgTwoSlice {
	static int slice(int A[]) {
		int minindex = 0;

		int arrlen = 0;

		double sum = 0;
		for (int i = 0; i < A.length; i++) {

			for (int j = i + 1; j <= A.length; j++) {
				int array[] = Arrays.copyOfRange(A, i, j);
				arrlen = array.length;

				for (int k = 0; k < array.length; k++) {
					sum += array[k];
				}
				double avg = sum / arrlen;
				System.out.println("avg "+avg);
				List<Double> list = new ArrayList<>();
				list.add(avg);
				for (int l = 0; l < list.size(); l++) {
					if (minindex == 0) {
						minindex = i;
					}
					if (minindex < list.get(l)) {
						minindex = i;
					}

				}

			}
		}

		return minindex;
	}

	public static void main(String[] args) {
		int A[] = { 4, 2, 2, 5, 1, 5, 8 };
		System.out.println(slice(A));

	}

}
