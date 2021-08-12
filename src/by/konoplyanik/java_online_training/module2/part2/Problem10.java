package by.konoplyanik.java_online_training.module2.part2;

// Найти положительные элементы главной диагонали квадратной матрицы.

public class Problem10 {

	public static void main(String[] args) {

		int n;
		n = (int) (Math.random() * 5 + 1) * 2;
		int[][] arr = new int[n][n];
		int m;
		int count;
		count = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = (int) (Math.random() * 199 - 99);
				System.out.print(arr[i][j] + "\t");
				if ((arr[i][j] > 0) && (i == j))
					count++;
			}
			System.out.println();
		}

		m = 0;

		if (count > 0) {
			System.out.println("Положительные члены главной диагонали:");
			while (m < n) {
				if (arr[m][m] > 0)
					System.out.print(arr[m][m] + "\t");
				m++;
			}
		} else
			System.out.print("На главной диагонали нет положительных членов.");
	}

}
