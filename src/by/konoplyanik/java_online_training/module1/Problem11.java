package by.konoplyanik.java_online_training.module1;

import java.util.Scanner;
import java.lang.Math;

// Вычислить значение функции: F(x) = x^2 - 3x + 9  если x <= 3;
//                             F(x) = 1 / (x^3 + 6) если x > 3.

public class Problem11 {

	public static void main(String[] args) {
		
		double x;
		double y;
		
		System.out.print("Введите значение x: ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Введите значение x:");
		}
		
		x = sc.nextDouble();

		if (x <= 3) {
			y = Math.pow(x, 2) - 3 * x + 9;
			System.out.print("F(x) = " + y + ".");
		} else if (x > 3) {
			y = 1 / (Math.pow(x, 3) + 6);
			System.out.print("F(x) = " + y + ".");
		}

	}

}
