package by.konoplyanik.java_online_training.module2.part2;

/*
Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
1   1   1   ...   1   1   1
0   1   1   ...   1   1   0
0   0   1   ...   1   0   0
... ... ... ... ... ... ...
0   1   1   ...   1   1   0
1   1   1   ...   1   1   1
*/

public class Problem6 {

	public static void main(String[] args) {

		int n;
		n = (int) (Math.random() * 5 + 1) * 2;
		int[][] arr = new int[n][n];

		System.out.println("Формирование квадратной матрицы размера " + n + " x " + n + ":");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i < n / 2) {
					if ((j > n - 1 - i) || (j < i)) {
						arr[i][j] = 0;
						System.out.print(arr[i][j] + "\t");
					} else {
						arr[i][j] = 1;
						System.out.print(arr[i][j] + "\t");
					}
				} else if (i >= n / 2) {
					if ((j < n - 1 - i) || (j > i)) {
						arr[i][j] = 0;
						System.out.print(arr[i][j] + "\t");
					} else {
						arr[i][j] = 1;
						System.out.print(arr[i][j] + "\t");
					}
				}
			}
			System.out.println();
		}

	}

}
