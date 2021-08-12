package by.konoplyanik.java_online_training.module2.part1;

import java.util.Scanner;
import java.lang.Math;

// В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class Problem1 {

	public static void main(String[] args) {
		
		int n;
		int k;
		int sum;
		
		sum = 0;
		
		System.out.print("Введите разменость массива а: ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			System.out.print("Повторите ввод: ");
			sc.nextLine();
		}
		n = sc.nextInt();
		
		System.out.println("Массив А[" + n + "]: ");
		
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = (int)(Math.random() * 10);
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		System.out.print("Введите число К: ");
		while (!sc.hasNextInt()) {
			System.out.print("Повторите ввод: ");
			sc.nextLine();
		}
		
		k = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			if (a[i] % k == 0)
				sum = sum + a[i];
		}
		
		System.out.print("Сумма элементов массива, кратных числу " + k + " равна: " + sum + ".");
	}

}
