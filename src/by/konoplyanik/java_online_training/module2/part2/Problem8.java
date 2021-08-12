package by.konoplyanik.java_online_training.module2.part2;

import java.util.Scanner;
import java.lang.Math;

/*
В числовой матрице поменять местами два любых столбца, т. е. все элементы одного столбца поставить
на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
пользователь с клавиатуры.
*/

public class Problem8 {

	public static void main(String[] args) {
		
		int n;
		int m;
		n = (int) (Math.random() * 8 + 3);
		m = (int) (Math.random() * 9 + 2);
		int[][] arr = new int[n][m];
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int temp;
		
		System.out.println("Исходная матрица:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = (int) (Math.random() * 101 - 50);
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.print("Введите номер первого столбца: ");
		do {
			while (!sc.hasNextInt()) {
				System.out.print("Номер должен быть больше 0 но меньше " + (m + 1) + ": ");
				sc.nextLine();
			}
			num1 = sc.nextInt();
			if ((num1 <= 0) | (num1 > m))
				System.out.print("Номер должен быть больше 0 но меньше " + (m + 1) + ": ");
		} while ((num1 <= 0) | (num1 > m));
		
		System.out.print("Введите номер второго столбца: ");
		do {
			while (!sc.hasNextInt()) {
				System.out.print("Номер должен быть больше 0 но меньше " + (m + 1) + ": ");
				sc.nextLine();
			}
			num2 = sc.nextInt();
			if ((num2 <= 0) | (num2 > m))
				System.out.print("Номер должен быть больше 0 но меньше " + (m + 1) + ": ");
			if (num1 == num2)
				System.out.print("Номера столбцов должны отличаться: ");
		} while ((num2 <= 0) | (num2 > m) | (num1 == num2));
		
		if (num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		System.out.println("Матрица после перестановки столбцов:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m ; j++) {
				if (j == num1 - 1) {
					temp = arr[i][j];
					arr[i][j] = arr[i][num2 - 1];
					arr[i][num2 - 1] = temp;
					System.out.print(arr[i][j] + "\t");
				} else {
					System.out.print(arr[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}

}
