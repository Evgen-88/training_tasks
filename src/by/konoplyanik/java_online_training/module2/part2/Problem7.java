package by.konoplyanik.java_online_training.module2.part2;

/*
Сформировать квадратную матрицу порядка N по правилу:  A[I][J] = sin((I^2 - J^2) / N)
и подсчитать количество положительных элементов в ней.
*/

public class Problem7 {

	public static void main(String[] args) {
		
		int n;
		n = (int) (Math.random() * 9 + 2);
		double[][] arr = new double[n][n];
		int count;
		count = 0;
		
		System.out.println("Формируем матрицу:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = (int) (Math.sin(((i + 1) * (i + 1) - (j + 1) * (j + 1)) / n) * 100) / 100.0;
				System.out.print(arr[i][j] + "\t");
				if (arr[i][j] > 0)
					count++;
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.print("Положительных элементов: " + count + ".");
	}

}
