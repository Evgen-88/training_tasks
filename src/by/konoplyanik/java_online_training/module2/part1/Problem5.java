package by.konoplyanik.java_online_training.module2.part1;

import java.util.Scanner;

// Даны целые числа а1 ,а2 ,..., аn. Вывести на печать только те числа, для которых аi > i.

public class Problem5 {

	public static void main(String[] args) {

		int n;

		System.out.print("Введите количество элементов n: ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			System.out.print("Повторите ввод: ");
			sc.nextLine();
		}
		n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Исходный ряд целых чисел: ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 21 - 10);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.println("Итоговый ряд:");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > i + 1)
				System.out.print(arr[i] + " ");
		}
	}

}
