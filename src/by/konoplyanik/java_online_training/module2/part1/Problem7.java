package by.konoplyanik.java_online_training.module2.part1;

import java.util.Scanner;

// Даны действительные числа a1, a2, ..., a2n. Найти max(a1 + a2n, a2 + a2n-1, ..., an + an+1).

public class Problem7 {

	public static void main(String[] args) {

		int n;
		double max;

		System.out.print("Введите полуразмерность последовательности n : ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			System.out.print("Повторите ввод: ");
			sc.nextLine();
		}
		n = sc.nextInt();

		double[] arr = new double[2 * n];
		double[] arr2 = new double[n];
		
		System.out.println("Исходня последовательность: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 202.0 - 100.0) / 10.0;
			System.out.print(arr[i] + " ");
		}
		
		max = arr2[0];
		
		System.out.println();
		System.out.println("Итоговая последовательность: ");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr[i] + arr[arr.length -1 - i];
			System.out.print(arr2[i] + " ");
			if (max < arr2[i])
				max = arr2[i];
		}
		
		System.out.println();
		System.out.print("Максимальный член новой последовательности: " + max + ".");
	}

}
