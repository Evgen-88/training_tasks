package by.konoplyanik.java_online_training.module2.part2;

import java.util.Scanner;

// Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

public class Problem3 {

	public static void main(String[] args) {

		int n;
		int m;
		int k;
		int p;
		n = (int) (Math.random() * 4 + 2);
		m = (int) (Math.random() * 3 + 2);
		int[][] arr = new int[n][m];

		System.out.println("Исходная матрица:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = (int) (Math.random() * 21 - 10);
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println();
		System.out.print("Введите номер строки k: ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		do {
			while (!sc.hasNextInt()) {
				System.out.print("Повторите ввод k: ");
				sc.nextLine();
			}
			k = sc.nextInt();
			if ((k < 1) || (k > n)) {
				System.out.print("Число k должно быть в диапазоне от 1 до" + n + ": ");
			}
		} while ((k < 1) || (k > n));

		System.out.println();
		System.out.print("Введите номер столбца p: ");
		do {
			while (!sc.hasNextInt()) {
				System.out.print("Повторите ввод p: ");
				sc.nextLine();
			}
			p = sc.nextInt();
			if ((p < 1) || (p > m)) {
				System.out.print("Число k должно быть в диапазоне от 1 до" + m + ": ");
			}
		} while ((p < 1) || (p > m));

		System.out.println();
		System.out.println("Вывод строки номер " + k + ":");
		for (int j = 0; j < m; j++) {
			System.out.print(arr[k - 1][j] + "\t");
		}
		System.out.println();

		System.out.println("Вывод столбца номер " + p + ":");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i][p - 1] + "\t");
		}
		System.out.println();
	}

}