package by.konoplyanik.java_online_training.module1;

import java.lang.Math;

// Составить программу нахождения произведения квадратов первых двухсот чисел.

public class Problem15 {

	public static void main(String[] args) {

		long mult;
		long nextMult;
		long correctMult;
		int count;

		mult = 1;
		nextMult = 1;
		correctMult = 0;
		count = 0;

		for (int i = 1; i <= 200; i++) {
			mult = mult * (int) (Math.pow(i, 2));
			nextMult = mult * (int) (Math.pow(i + 1, 2));
			if (nextMult > mult) {
				count++;
				correctMult = mult;
			}
		}

		System.out.println("Произошло переполнение после " + count + "-ой операции умножения.");
		System.out.print("Последний корректный результат: " + correctMult + ".");
	}
}