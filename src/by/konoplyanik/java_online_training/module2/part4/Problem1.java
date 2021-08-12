package by.konoplyanik.java_online_training.module2.part4;

import java.util.Scanner;

/*
 Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
натуральных чисел: НОК(А, Б) = (А * Б) / НОД(А, Б)
*/

public class Problem1 {

	private static int enterFromConsole() {
		
		int n;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введите натуральное число: ");

		do {
			while (!sc.hasNextInt()) {
				System.out.print("Повторите ввод: ");
				sc.nextLine();
			}
			n = sc.nextInt();
			if (n <= 0) {
				System.out.print("Повторите ввод: ");
			}
		} while (n <= 0);
		return n;
	}

	private static int gcd(int max, int min) {

		int temp;

		while (min != 0) {
			temp = max % min;
			max = min;
			min = temp;
		}

		return max;
	}

	private static int lcm(int max, int min) {
		int mul;

		mul = (max * min) / gcd(max, min);

		return mul;
	}

	public static void main(String[] args) {

		int a;
		int b;
		
		a = enterFromConsole();
		
		b = enterFromConsole();
		
		if (a > b) {
			System.out.print("НОК = " + lcm(a, b) + ", НОД = " + gcd(a, b) + ".");
		} else {
			System.out.print("НОК = " + lcm(b, a) + ", НОД = " + gcd(b, a) + ".");
		}
		
	}
}
