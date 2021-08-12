package by.konoplyanik.java_online_training.module2.part2;

// Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

public class Problem15 {

	public static void main(String[] args) {

		int n;
		int m;
		n = (int) (Math.random() * 6 + 5);
		m = (int) (Math.random() * 6 + 5);
		int[][] arr = new int[n][m];
		int max;

		System.out.println("Исходная матрица:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = (int) (Math.random() * 100);
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

		max = arr[0][0];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] > max)
					max = arr[i][j];
			}
		}

		System.out.println();
		System.out.println("Новая матрица:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] % 2 == 0) {
					System.out.print(arr[i][j] + "\t");
				} else {
					System.out.print(max + "\t");
				}
			}
			System.out.println();
		}
	}
}