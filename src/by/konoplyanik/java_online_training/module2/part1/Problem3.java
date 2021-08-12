package by.konoplyanik.java_online_training.module2.part1;

import java.util.Scanner;

// Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
// положительных и нулевых элементов.

public class Problem3 {

	public static void main(String[] args) {
		
		int n;
		int countPoz;
		int countNeg;
		int countZero;
		
		countPoz = 0;
		countNeg = 0;
		countZero = 0;
		
		System.out.print("Введите размерность массива N: ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			System.out.print("Повторите ввод N: ");
			sc.nextLine();
		}
		n = sc.nextInt();
		
		double[] arr = new double[n];
		
		System.out.println("Исходный массив:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 200 - 99) / 10.0;
			System.out.print(arr[i] + " ");
			if (arr[i] > 0)
				countPoz++;
			else if (arr[i] < 0)
				countNeg++;
			else
				countZero++;
		}
		
		System.out.println();
		
		System.out.println("Количество положительных злементов: " + countPoz + ".");
		System.out.println("Количество отрицательных злементов: " + countNeg + ".");
		System.out.println("Количество нулевых злементов: " + countZero + ".");
	}

}
