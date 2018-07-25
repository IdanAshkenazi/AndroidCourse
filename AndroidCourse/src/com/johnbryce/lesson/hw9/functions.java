package com.johnbryce.lesson.hw9;

import java.util.Arrays;

public class functions {

	public boolean getarray(int lookfornum, int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == lookfornum)
				return true;
		}
		return false;
	}

	public static boolean isSeven(int x) {
		if (x == 7)
			return true;
		return false;
	}

	public static int getTwoNum(int a, int b) {
		if (a > b)
			return 1;
		else if (a == b)
			return 0;
		return -1;

	}

	public static boolean getTwoArr(int[] arr1, int[] arr2) {
		if (arr1.length != arr2.length)
			return false;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i])
				return false;
		}
		return true;

	}

	public static boolean checkIfSameArray(int[] arr3, int[] arr4) {
		if (arr3.length != arr4.length)
			return false;
		for (int i = 0; i < arr3.length; i++) {
			boolean isExist = false;
			for (int k = 0; k < arr3.length; k++) {
				if (arr3[i] == arr4[k])
					isExist = true;
			}
			if (!isExist)
				return false;
		}
		return true;
	}
	
	public static boolean checkIfSameArray2(int[] arr3, int[] arr4) {
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));
		Arrays.sort(arr4);
		System.out.println(Arrays.toString(arr4));
		return getTwoArr(arr3, arr4);
	}
	
	public static void main(String[] args) {
		int [] array1 = {1,4,2,3};
		int [] array2 = {1,2,3,4};
		System.out.println(checkIfSameArray(array1, array2));
		System.out.println(checkIfSameArray2(array1, array2));
	}

}
