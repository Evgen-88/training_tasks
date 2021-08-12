package by.konoplyanik.java_online_training.module2.part1;

/*
В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
чисел несколько, то определить наименьшее из них.
 */

public class Problem9 {

	public static void main(String[] args) {

		int n;
		n = (int) (Math.random() * 10 + 1);
		int[] arr = new int[n];
		int[] arrCount = new int[n];
		int count;
		int max;
		int index;

		System.out.println("Исходный массив: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 21 - 10);
			System.out.print(arr[i] + " ");
		}

		for (int i = 0; i < arr.length; i++) {
			count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j])
					count++;
			}
			arrCount[i] = count;
		}

		max = arrCount[0];
		index = 0;

		for (int i = 0; i < arrCount.length; i++) {
			if (arrCount[i] > max) {
				max = arrCount[i];
				index = i;
			} else if (arrCount[i] == max) {
				if (arr[i] < arr[index]) {
					max = arrCount[i];
					index = i;
				}
			}
		}

		System.out.println();
		System.out.print("Самое часто встречающееся число последовательности: " + arr[index] + ".");
	}

}
