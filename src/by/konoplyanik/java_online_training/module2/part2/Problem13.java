package by.konoplyanik.java_online_training.module2.part2;

// Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

public class Problem13 {

	public static void main(String[] args) {

		int n;
		int m;
		n = (int) (Math.random() * 6 + 5);
		m = (int) (Math.random() * 6 + 5);
		int[][] arr = new int[n][m];
		int minTemp;
		int maxTemp;
		int index;

		System.out.println("Исходная матрица:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = (int) (Math.random() * 100);
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Сортировка столбцов по возрастанию:");
		for (int j = 0; j < m; j++) {
			int i = 0;
			while (i < n) {
				minTemp = arr[i][j];
				index = i;
				for (int k = i; k < n; k++) {
					if (arr[k][j] < minTemp) {
						minTemp = arr[k][j];
						index = k;
					}
				}
				arr[index][j] = arr[i][j];
				arr[i][j] = minTemp;
				i++;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Сортировка столбцов по убыванию:");
		for (int j = 0; j < m; j++) {
			int i = 0;
			while (i < n) {
				maxTemp = arr[i][j];
				index = i;
				for (int k = i; k < n; k++) {
					if (arr[k][j] > maxTemp) {
						maxTemp = arr[k][j];
						index = k;
					}
				}
				arr[index][j] = arr[i][j];
				arr[i][j] = maxTemp;
				i++;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}