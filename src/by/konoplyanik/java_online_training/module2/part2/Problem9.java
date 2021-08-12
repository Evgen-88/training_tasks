package by.konoplyanik.java_online_training.module2.part2;

/*
Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
столбец содержит максимальную сумму.
*/

public class Problem9 {

	public static void main(String[] args) {

		int n;
		int m;
		n = (int) (Math.random() * 8 + 3);
		m = (int) (Math.random() * 9 + 2);
		int[][] arr = new int[n][m];
		int[] sum = new int[m];
		int maxSum;
		int maxIndex;

		System.out.println("Исходная матрица:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = (int) (Math.random() * 100);
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("Сумма по столбцам:");
		for (int j = 0; j < m; j++) {
			for (int i = 0; i < n; i++) {
				sum[j] += arr[i][j];
			}
			System.out.print(sum[j] + "\t");
		}
		System.out.println();

		maxSum = sum[0];
		maxIndex = 0;
		for (int j = 0; j < sum.length; j++) {
			if (sum[j] > maxSum) {
				maxSum = sum[j];
				maxIndex = j;
			}
		}
		System.out.print("Максимальная сумма, равная " + maxSum + ", в столбце №" + (maxIndex + 1) + ".");
	}

}
