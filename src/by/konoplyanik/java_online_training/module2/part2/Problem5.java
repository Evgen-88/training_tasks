package by.konoplyanik.java_online_training.module2.part2;

/*
Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
1   1   1   ...   1   1   1
2   2   2   ...   2   2   0
3   3   3   ...   3   0   0
... ... ... ... ... ... ...
n-1 n-1 0   ...   0   0   0
n   0   0   ...   0   0   0
*/

public class Problem5 {

	public static void main(String[] args) {

		int n;
		n = (int) (Math.random() * 5 + 1) * 2;
		int[][] arr = new int[n][n];

		System.out.println("Формирование квадратной матрицы размера " + n + " x " + n + ":");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j > n - 1 - i) {
					arr[i][j] = 0;
					System.out.print(arr[i][j] + "\t");
				} else {
					arr[i][j] = i + 1;
					System.out.print(arr[i][j] + "\t");
				}
			}
			System.out.println();
		}

	}

}
