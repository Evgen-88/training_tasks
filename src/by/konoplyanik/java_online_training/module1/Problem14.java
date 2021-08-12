package by.konoplyanik.java_online_training.module1;

// Найти сумму квадратов первых ста чисел.

import java.lang.Math;

public class Problem14 {

	public static void main(String[] args) {
		
		int sum;
		
		sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			sum = (int)(sum + Math.pow(i, 2));
		}
		
		System.out.println("Сумма квадратов первых ста чисел равна: " + sum + ".");
	}

}
