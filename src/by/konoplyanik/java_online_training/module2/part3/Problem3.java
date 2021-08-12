package by.konoplyanik.java_online_training.module2.part3;

/*
Сортировка выбором. Дана последовательность чисел
a1 <= a2 <= ... <= an.Требуется переставить элементы так, чтобы они были расположены по убыванию.
Для этого в массиве, начиная с первого, выбирается наибольший элемент и ставится на первое место,
а первый - на место наибольшего. Затем, начиная со второго, эта процедура
повторяется. Написать алгоритм сортировки выбором.
*/

public class Problem3 {

	public static void main(String[] args) {
		
		int n;
		int[] arr;
		int max;
		int index;
		int temp;

		n = (int) (Math.random() * 10 + 2);
		arr = new int[n];
		arr[0] = (int) (Math.random() * 10) - 5;
		
		System.out.println("Неубывающая последовательность размерности " + n + ":");
		System.out.print(arr[0] + "\t");
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i + 1] = arr[i] + (int) (Math.random() * 5);
			System.out.print(arr[i + 1] + "\t");
		}
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			max = arr[i];
			index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] >= max) {
					max = arr[j];
					index = j;
				}
				temp = arr[i];
				arr[i] = max;
				arr[index] = temp;
			}
		}
		
		System.out.println("Отсортированная последовательность:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		
	}

}
