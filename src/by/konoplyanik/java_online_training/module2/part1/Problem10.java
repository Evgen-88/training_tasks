package by.konoplyanik.java_online_training.module2.part1;

/*
Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй
элемент (освободившиеся элементы заполнить нулями). Примечание: Дополнительный массив не использовать.
*/

public class Problem10 {

	public static void main(String[] args) {

		int n;
		n = (int) (Math.random() * 20 + 1);
		int[] arr = new int[n];

		System.out.println("Исходный массив:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 21 - 10);
			System.out.print(arr[i] + " ");
		}

		System.out.println();
		System.out.println("Сжатый массив:");

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0)
				arr[i] = 0;
		}

		System.out.print(arr[0] + " ");
		for (int i = 1; i < arr.length; i++) {
			if (arr.length % 2 == 0) {
				if (i < arr.length / 2) {
					arr[i] = arr[i * 2];
					arr[i * 2] = 0;
					System.out.print(arr[i] + " ");
				} else
					System.out.print(arr[i] + " ");
			}
			if (arr.length % 2 != 0) {
				if (i < arr.length / 2 + 1) {
					arr[i] = arr[i * 2];
					arr[i * 2] = 0;
					System.out.print(arr[i] + " ");
				} else
					System.out.print(arr[i] + " ");
			}
		}
	}

}
