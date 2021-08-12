package by.konoplyanik.java_online_training.module1;

import java.util.Scanner;

// Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
// все числа от 1 до введенного пользователем числа.

public class Problem12 {

	public static void main(String[] args) {
		
		int x;
		int sum;
		int k;
		
		sum = 0;
		k = 1;
		
		System.out.print("Введите целое положительное число: ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print("Введите целое положительное число: ");
		}
		
		x = sc.nextInt();
		
		while (k <= x) {
			sum = sum + k;
			k++;
		}
		System.out.println("Сумма чисел от единицы до введенного равна: " + sum + ".");
	}

}
