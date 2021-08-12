package by.konoplyanik.java_online_training.module2.part4;

import java.util.Scanner;

/*
Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] + D[5] + D[6].
Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
массива с номерами от k до m.
*/

public class Problem8 {
	
	private static void sum3(int[] arr, int[] sum, int k, int m) {
		
		int index;
		
		index = 0;
		
		System.out.print("Суммы трех последовательно расположенных элементов: ");
		for (int i = k; i <= sum.length * 2 + k - 1; i += 2) {
			sum[index] = arr[i] + arr[i + 1] + arr[i + 2];
			System.out.print(sum[index] + "\t");
			index++;
		}
		
	}

	public static void main(String[] args) {
		
		int n;
		int[] arr;
		int[] sum;
		int k;
		int m;
		
		n = (int) (Math.random() * 15 + 6);
		arr = new int[n];
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введите начальный индекс от 1 до " + (n - 2) + ": ");
		do {
			while (!sc.hasNextInt()) {
				System.out.print("Введите целое число: ");
				sc.nextLine();
			}
			k = sc.nextInt();
			if ((k < 1) || (k >= n - 2)) {
				System.out.print("Введите число от 1 до " + (n - 2) + ": ");
			}
		} while ((k < 1) || (k >= n - 2));
		
		System.out.print("Введите конечный индекс от " + k + " до " + n + ": ");
		do {
			while (!sc.hasNextInt()) {
				System.out.print("Введите целое число: ");
				sc.nextLine();
			}
			m = sc.nextInt();
			if ((m < k) || (m >= n)) {
				System.out.print("Введите число от 1 до " + n + ": ");
			}
		} while ((m < k) || (m >= n));
		
		System.out.println("Исходная последовательнасть:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 101 - 50);
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		
		sum = new int[(m - k) / 2];
		
		sum3(arr, sum, k - 1, m - 1);
	}

}
