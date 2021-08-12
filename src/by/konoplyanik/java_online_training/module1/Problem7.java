package by.konoplyanik.java_online_training.module1;

import java.util.Scanner;

//  Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
// и если да, то будет ли он прямоугольным.

public class Problem7 {

	public static void main(String[] args) {
		
		double a;
		double b;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите значение первого угла: ");
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Введите значение первого угла: ");
		}
		
		a = sc.nextDouble();
		
		System.out.print("Введите значение второго угла: ");
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Введите значение второго угла: ");
		}
		
		b = sc.nextDouble();

		if (((a + b) < 180) & (a != 0) & (b != 0)) {
			System.out.println("Такой треугольник существует.");
			if ((a + b) == 90)
				System.out.println("Он прямоугольный.");
			else
				System.out.println("Он не прямоугольный.");
		} else
			System.out.println("Такого треугольника не существует.");
	}

}
