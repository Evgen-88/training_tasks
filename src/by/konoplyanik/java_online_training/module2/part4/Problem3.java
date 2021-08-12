package by.konoplyanik.java_online_training.module2.part4;

import java.util.Scanner;

// Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
// треугольника

public class Problem3 {

	private static double enterFromConsole() {

		double n;

		System.out.print("Введите значение стороны шестиугольника: ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		do {
			while (!sc.hasNextDouble()) {
				System.out.print("Повторите ввод: ");
				sc.nextLine();
			}
			n = sc.nextDouble();
			if (n <= 0)
				System.out.print("Повторите ввод: ");
		} while (n <= 0);

		return n;
	}
	
	private static double semiPer(double a) {
		
		double p;
		
		p = (a * 3) / 2.0;
		
		return p;
	}

	private static double square(double a) {
		
		double s;
		
		s = Math.sqrt(semiPer(a) * 3.0 * (semiPer(a) - a));
		
		return s;
	}
	
	public static void main(String[] args) {
		
		double a;
		
		a = enterFromConsole();
		
		System.out.print("Площадь правильного шестиугольника со стороной " + a + " равна " + square(a) * 6 + ".");
		
	}

}
