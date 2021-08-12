package by.konoplyanik.java_online_training.module2.part2;

import java.util.Scanner;

/*
Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел
1, 2, 3, ...,2^n так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей
равны между собой. Построить такой квадрат.
*/

public class Problem16 {

	private static int enterFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.print("Введите порядок магического квадрата: ");
		do {
			while (!sc.hasNextInt()) {
				System.out.print("Введите целое число: ");
				sc.nextLine();
			}
			n = sc.nextInt();
			if (n <= 2)
				System.out.print("Введите число больше 2: ");
		} while (n <= 2);
		return n;
	}

	private static void printOnConsole(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	private static void oddSquare(int[][] arr, int n, int x, int i, int j, int mini, int maxi, int minj, int maxj) {
		// индийский метод

		int count;

		arr[i][j] = x;
		count = 0;

		while (count < n * n - 1) {
			// нормальный переход вверх вправо
			x++;
			// если вышли за пределы
			if (i - 1 < mini)
				i = maxi - 1;
			else
				i--;

			if (j + 1 >= maxj)
				j = minj;
			else
				j++;

			if (arr[i][j] == 0) {
				arr[i][j] = x;
				count++;
				// если ячейка уже заполнена
			} else {
				i = i + 2;
				j--;

				if (i > maxi)
					i = mini + 1;
				if (j < minj)
					j = maxj - 1;
				arr[i][j] = x;
				count++;
			}
		}
		// return arr;
		/*
		
		*/
	}

	private static int[][] evenOddSquare(int[][] arr, int n) {
		// метод четырех квадратов

		int m;
		int temp;
		int i;

		m = n / 2;

		oddSquare(arr, m, 1, 0, m / 2, 0, m, 0, m);
		oddSquare(arr, m, m * m + 1, m, m + m / 2, m, n, m, n);
		oddSquare(arr, m, 2 * m * m + 1, 0, m + m / 2, 0, m, m, n);
		oddSquare(arr, m, 3 * m * m + 1, m, m / 2, m, n, 0, m);

		temp = arr[0][0];
		arr[0][0] = arr[n / 2][0];
		arr[n / 2][0] = temp;
		temp = arr[n - 1][0];
		arr[n - 1][0] = arr[n / 2 - 1][0];
		arr[n / 2 - 1][0] = temp;
		i = 1;
		while (i <= n / 2 - 2) {
			temp = arr[i][1];
			arr[i][1] = arr[i + n / 2][1];
			arr[i + n / 2][1] = temp;
			i++;
		}

		return arr;
	}

	private static int[][] evenEvenSquare(int[][] arr, int n) {
		// метод Роуз-Болла

		int x;
		int temp;
		int m;

		x = 1;
		m = n / 4;

		// заполняем матрицу числами в естественном порядке
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = x;
				x++;
			}
		}

		// заменяем главные диагонали
		for (int i = 0; i < n / 2; i++) {

			temp = arr[i][i];
			arr[i][i] = arr[n - i - 1][n - i - 1];
			arr[n - i - 1][n - i - 1] = temp;

			temp = arr[i][n - i - 1];
			arr[i][n - i - 1] = arr[n - i - 1][i];
			arr[n - i - 1][i] = temp;
		}
		// заменяем побочные диагонали
		if (m > 1) {
			for (int j = 4; j < n; j += 4) {
				
				for (int i = 0; i < n / 2; i++) {
					
					if ((j + i < n) && (j - 1 - i >= 0)) {
						temp = arr[i][j + i];
						arr[i][j + i] = arr[n - 1 - i][j - 1 - i];
						arr[n - 1 - i][j - 1 - i] = temp;

						temp = arr[i][j - 1 - i];
						arr[i][j - 1 - i] = arr[n - 1 - i][j + i];
						arr[n - 1 - i][j + i] = temp;
						
					} else if (j + i >= n) {
						temp = arr[i][j + i - n];
						arr[i][j + i - n] = arr[n - 1 - i][j - 1 - i];
						arr[n - 1 - i][j - 1 - i] = temp;

						temp = arr[i][j - 1 - i];
						arr[i][j - 1 - i] = arr[n - 1 - i][j + i - n];
						arr[n - 1 - i][j + i - n] = temp;
						
					} else if (j - 1 - i < 0) {
						temp = arr[i][j + i];
						arr[i][j + i] = arr[n - 1 - i][j - 1 - i + n];
						arr[n - 1 - i][j - 1 - i + n] = temp;

						temp = arr[i][j - 1 - i + n];
						arr[i][j - 1 - i + n] = arr[n - 1 - i][j + i];
						arr[n - 1 - i][j + i] = temp;
						
					} else if ((j + i >= n) && (j - 1 - i < 0)) {
						temp = arr[i][j + i - n];
						arr[i][j + i - n] = arr[n - 1 - i][j - 1 - i + n];
						arr[n - 1 - i][j - 1 - i + n] = temp;

						temp = arr[i][j - 1 - i + n];
						arr[i][j - 1 - i + n] = arr[n - 1 - i][j + i - n];
						arr[n - 1 - i][j + i - n] = temp;
					}
				}
			}
		}

		return arr;
	}

	public static void main(String[] args) {

		int n;
		int[][] arr;

		n = enterFromConsole();
		arr = new int[n][n];
		if (n % 4 == 0) {
			System.out.println("Магический квадрат четно-четного парядка " + n + ":");
			printOnConsole(evenEvenSquare(arr, n));
		} else if (n % 2 == 0) {
			System.out.println("Магический квадрат четно-нечетного парядка " + n + ":");
			printOnConsole(evenOddSquare(arr, n));
		} else {
			System.out.println("Магический квадрат нечетного порядка " + n + ":");
			oddSquare(arr, n, 1, 0, n / 2, 0, n, 0, n);
			printOnConsole(arr);
		}
	}

}
