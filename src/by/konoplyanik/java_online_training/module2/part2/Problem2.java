package by.konoplyanik.java_online_training.module2.part2;

// Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Problem2 {

	public static void main(String[] args) {

		int n;
		n = (int) (Math.random() * 9 + 2);
		int[][] arr = new int[n][n];

		System.out.println("Квадратная матрица:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = (int) (Math.random() * 201 - 100);
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("Первая диагональ:");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i][i] + "\t");
		}
		System.out.println();
		
		System.out.println("Вторая диагональ:");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[n - 1 - i][i] + "\t");
		}
	}

}
