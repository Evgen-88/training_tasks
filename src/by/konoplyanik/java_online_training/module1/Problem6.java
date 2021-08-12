package by.konoplyanik.java_online_training.module1;

import java.util.Scanner;
import java.lang.Math;

// Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
// принадлежит закрашенной области, и false — в противном случае:

public class Problem6 {

	public static void main(String[] args) {
		
		double x;
		double y;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите координату x: ");
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Введите координату x: ");
		}
		
		x = sc.nextDouble();
		
		System.out.print("Введите координату y: ");
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Введите координату y: ");
		}
		
		y = sc.nextDouble();

		if (((Math.abs(x) <= 2) & (y >= 0) & (y <= 4)) || ((Math.abs(x) <= 4) & (y >= -3) & (y <= 0)))
			System.out.println("true");
		else
			System.out.println("false");
	}

}
