package by.konoplyanik.java_online_training.module2.part2;

/*
Сформировать квадратную матрицу порядка n по заданному образцу (n - четное):
1     2    3  ... n
n    n-1  n-2 ... 1
1     2    3  ... n
n    n-1  n-2 ... 1
...  ...  ...  ...
n    n-1  n-2 ... 1
*/

public class Problem4 {

	public static void main(String[] args) {

		int n;
		n = (int) (Math.random() * 5 + 1) * 2;
		int[][] arr = new int[n][n];

		System.out.println("Формирование квадратной матрицы размера " + n + " x " + n + ":");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i % 2 == 0) {
					arr[i][j] = j + 1;
					System.out.print(arr[i][j] + "\t");
				} else {
					arr[i][j] = n - j;
					System.out.print(arr[i][j] + "\t");
				}
			}
			System.out.println();
		}

	}

}
