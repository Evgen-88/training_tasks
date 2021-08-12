package by.konoplyanik.java_online_training.module2.part2;

// Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

public class Problem12 {

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
		System.out.println("Сортировка строк по возрастанию:");
		for (int i = 0; i < n; i++) {
			int j = 0;
			while (j < m) {
				minTemp = arr[i][j];
				index = j;
				for (int k = j; k < m; k++) {
					if (arr[i][k] < minTemp) {
						minTemp = arr[i][k];
						index = k;
					}
				}
				arr[i][index] = arr[i][j];
				arr[i][j] = minTemp;
				System.out.print(arr[i][j] + "\t");
				j++;
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Сортировка строк по убыванию:");
		for (int i = 0; i < n; i++) {
			int j = 0;
			while (j < m) {
				maxTemp = arr[i][j];
				index = j;
				for (int k = j; k < m; k++) {
					if (arr[i][k] > maxTemp) {
						maxTemp = arr[i][k];
						index = k;
					}
				}
				arr[i][index] = arr[i][j];
				arr[i][j] = maxTemp;
				System.out.print(arr[i][j] + "\t");
				j++;
			}
			System.out.println();
		}
	}

}
