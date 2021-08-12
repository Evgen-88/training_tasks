package by.konoplyanik.java_online_training.module1;

import java.util.Scanner;
import java.lang.Math;

// Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
// заданному е. Общий член ряда имеет вид: An = 1 / 2^n + 1 / 3^n

public class Problem16 {

	public static void main(String[] args) {
		
		double e;
		int i;
		double a;
		double sum;
		
		i = 0;
		sum = 0;
		
		System.out.print("Введите число e: ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextDouble()) {
			System.out.print("Введите число e: ");
			sc.nextLine();
		}
		
		e = sc.nextDouble();

		if (e <= 0)
			System.out.print("Сумма элементов стремиться к бесконечности.");
		else {
			
			do {
				a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
				sum = sum + a;
				i++;
			} while (a >= e);

			System.out.println("Сумма элементов равна: " + sum + ".");
		}
	}

}
