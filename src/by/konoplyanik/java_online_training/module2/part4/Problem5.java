package by.konoplyanik.java_online_training.module2.part4;

import java.util.Scanner;

/*
Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
которое меньше максимального элемента массива, но больше всех других элементов).
*/

public class Problem5 {

	private static int maxFind(int[] arr) {
		int max;
		
		max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		return max;
	}
	
	private static int maxNext(int[] arr, int max) {
		int find;
		
		if (arr[0] != max) {
			find = arr[0];
		} else {
			find = arr[1];
		}
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] > find) && (arr[i] < max)) {
				find = arr[i];
			}
		}
		
		return find;
	}
	
	public static void main(String[] args) {

		int n;
		int[] arr;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите размерность массива: ");
		do {
			while (!sc.hasNextInt()) {
				System.out.print("Повторите ввод: ");
				sc.nextLine();
			}
			n = sc.nextInt();
			if (n < 2) {
				System.out.print("Повторите ввод: ");
			}
		} while (n < 2);

		arr = new int[n];
		
		System.out.println("Массив: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 101 - 50);
			System.out.print(arr[i] + "\t");
		}
		
		System.out.println();
		System.out.print("Второй по величине элемент: " + maxNext(arr, maxFind(arr)));
	}

}
