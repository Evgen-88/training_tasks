package by.konoplyanik.java_online_training.module2.part1;

import java.lang.Math;

// Дана последовательность действительных чисел а1 ,а2 ,..., аn. Заменить все ее члены,
// большие данного Z, этим числом. Подсчитать количество замен.

public class Problem2 {

	public static void main(String[] args) {
		
		double[] a = new double[10];
		double z;
		int count;
		
		z = 2.3;
		count = 0;
		
		System.out.println("Исходный массив: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random() * 100) / 10.0;
			System.out.print(a[i] + " ");
		}
		
		System.out.println("Измененный массив: ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] > z) {
				a[i] = z;
				count++;
			}
			System.out.print(a[i] + " ");
		}
		System.out.print("Количество замен равно: " + count + ".");
	}

}
