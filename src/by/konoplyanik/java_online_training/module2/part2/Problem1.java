package by.konoplyanik.java_online_training.module2.part2;

// Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class Problem1 {

	public static void main(String[] args) {

		int n;
		int m;
		n = (int) (Math.random() * 10 + 1);
		m = (int) (Math.random() * 10 + 1);
		int[][] arr = new int[n][m];

		System.out.println("Исходная матрица:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = (int) (Math.random() * 21 - 10);
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("Требуемые столбцы:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if ((j % 2 == 0) && (arr[0][j] > arr[n - 1][j]))
					System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
