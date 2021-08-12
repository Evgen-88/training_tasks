package by.konoplyanik.java_online_training.module2.part2;

/*
Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
единиц равно номеру столбца.
*/

public class Problem14 {

	public static void main(String[] args) {

		int n;
		int m;
		n = (int) (Math.random() * 6 + 5);
		m = n - (int) (Math.random() * 2);
		int[][] arr = new int[n][m];
		int count;

		System.out.println("Формируем матрицу:");
		for (int j = 0; j < m; j++) {
			int i;

			do {
				i = 0;
				count = 0;
				while (i < n) {
					arr[i][j] = (int) (Math.random() * 2);
					if (arr[i][j] != 0)
						count++;
					i++;
				}
			} while (count != j + 1);
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}