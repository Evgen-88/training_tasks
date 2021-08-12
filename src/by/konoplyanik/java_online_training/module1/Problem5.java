package by.konoplyanik.java_online_training.module1;

import java.util.Scanner;

// Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
// Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc

public class Problem5 {

	public static void main(String[] args) {
		
		int t;
		int hour;
		int min;
		int sec;
		
		System.out.print("Введите время в секундах: ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print("Повторите ввод времени в секундах: ");
		}

		t = sc.nextInt();

		hour = t / 3600;
		min = (t % 3600) / 60;
		sec = t % 60;

		System.out.println(t + "c это " + hour + "ч " + min + "мин " + sec + "с.");

	}

}
