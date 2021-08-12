package by.konoplyanik.java_online_training.module2.part1;

import java.util.Scanner;

// Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
// являются простыми числами.

public class Problem6 {

	public static void main(String[] args) {

		int n;
		int sum;

		sum = 0;

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
			arr[i] = (int) (Math.random() * 11);
			System.out.print(arr[i] + " ");
			int j;
			int count;

			j = i;
			count = 0;

			while (j >= 0) {
				if ((i + 1) % (j + 1) == 0)
					count++;
				j--;
			}
			if (count == 2)
				sum = sum + arr[i];
		}

		System.out.println();
		System.out.print("Сумма чисел: " + sum + ".");
	}

}
