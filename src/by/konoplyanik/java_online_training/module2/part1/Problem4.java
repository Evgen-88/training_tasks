package by.konoplyanik.java_online_training.module2.part1;

import java.lang.Math;

// Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

public class Problem4 {

	public static void main(String[] args) {
		
		int n;
		n = 10;
		double[] arr = new double[n];
		double min;
		double max;
		int indexMin;
		int indexMax;
		
		System.out.println("Исходный массив:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 200 - 99) / 10.0;
			System.out.print(arr[i] + " ");
		}
		
		min = arr[0];
		max = arr[0];
		indexMin = 0;
		indexMax = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				indexMin = i;
			}
			if (arr[i] > max) {
				max = arr[i];
				indexMax = i;
			}
		}
		
		arr[indexMax] = min;
		arr[indexMin] = max;
		
		System.out.println();
		System.out.println("Итоговый массив:");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
