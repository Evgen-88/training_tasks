package by.konoplyanik.java_online_training.module1;

import java.util.Scanner;

// Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
// m и n вводятся с клавиатуры.

public class Problem18 {

	public static void main(String[] args) {
		
		int m;
		int n;
		
		m = -1;
		n = -1;
		
		System.out.print("Введите число m: ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (m < 0) {
			while (!sc.hasNextInt()) {
				System.out.print("Введите число m: ");
				sc.nextLine();
			}
			m = sc.nextInt();
			if (m < 0) {
				System.out.print("Число должно быть положительное: ");
			}
		}

		System.out.print("Введите число n: ");
		while ((n < 0) | (n <= m)) {
			while (!sc.hasNextInt()) {
				System.out.print("Введите число n: ");
				sc.nextLine();
			}
			n = sc.nextInt();
			if ((n < 0) | (n <= m))
				System.out.print("Число должно быть положительным и больше " + m + ": ");
		}

		if (n < 4)
			System.out.print("Таких делителей не существует");
		else {
			for (int i = 4; i <= n; i++) {
				int count = 0;
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						System.out.print(j + " ");
						count++;
					}
				}
				if (count == 1)
					System.out.println("- делитель " + i);
				else if (count > 1)
					System.out.println("- делители " + i);
			}
		}
	}

}
