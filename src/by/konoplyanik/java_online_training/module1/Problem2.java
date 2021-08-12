package by.konoplyanik.java_online_training.module1;

import java.lang.Math;

// Вычислить значение выражения по формуле (все переменные принимают действительные значения):
// (b + √(b^2 + 4ac)) - a^3 * c + b^(-2)

public class Problem2 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double x;
		
		a = 2.0;
		b = 3.5;
		c = 2.2;

		x = (b + Math.sqrt(Math.pow(b, 2.0) + 4.0 * a * c)) / (2.0 * a) - Math.pow(a, 3) * c + 1 / Math.pow(b, 2);

		System.out.println("Результат x = " + x + ".");
	}

}
