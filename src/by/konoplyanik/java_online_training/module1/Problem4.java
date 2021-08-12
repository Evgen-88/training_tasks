package by.konoplyanik.java_online_training.module1;

import java.util.Scanner;

//  Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
// Поменять местами дробную и целую части числа и вывести полученное значение числа.

public class Problem4 {

	public static void main(String[] args) {
		
		double r;
		int r1;
		int r2;
		double rez;
		
		System.out.print("Введите число R = ");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Введите число R = ");
		}

		r = sc.nextDouble();
		System.out.println();

		r1 = (int) r;
		r2 = (int) ((r - r1) * 1000);
		rez = r2 + r1 / 1000.0;
		
		System.out.println("Результат перемены равен: " + rez + ".");
	}

}
