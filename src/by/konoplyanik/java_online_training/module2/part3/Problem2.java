package by.konoplyanik.java_online_training.module2.part3;

/*
Даны две последовательности a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm. Образовать из них новую последовательность
чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
*/

public class Problem2 {

	public static void main(String[] args) {

		int n;
		int m;
		int[] arr1;
		int[] arr2;
		int[] arr;
		int x;
		int x1;
		int x2;

		n = (int) (Math.random() * 10 + 2);
		m = (int) (Math.random() * 10 + 2);
		arr1 = new int[n];
		arr2 = new int[m];
		arr = new int[n + m];
		arr1[0] = (int) (Math.random() * 10) - 5;
		arr2[0] = (int) (Math.random() * 10) - 5;
		x = 0;
		x1 = 0;
		x2 = 0;

		System.out.println("Первая неубывающая последовательность размерности " + n + ":");
		System.out.print(arr1[0] + "\t");
		for (int i = 0; i < arr1.length - 1; i++) {
			arr1[i + 1] = arr1[i] + (int) (Math.random() * 5);
			System.out.print(arr1[i + 1] + "\t");
		}
		System.out.println();

		System.out.println("Вторая неубывающая последовательность размерности " + m + ":");
		System.out.print(arr2[0] + "\t");
		for (int i = 0; i < arr2.length - 1; i++) {
			arr2[i + 1] = arr2[i] + (int) (Math.random() * 5);
			System.out.print(arr2[i + 1] + "\t");
		}
		System.out.println();
		
		System.out.println("Результирующая неубывающая последовательность размерности " + (n + m) + ":");
		while (x < arr.length) {
			if ((x1 < arr1.length) && (x2 < arr2.length)) {
				if (arr1[x1] <= arr2[x2]) {
					arr[x] = arr1[x1];
					System.out.print(arr[x] + "\t");
					x++;
					x1++;
				} else {
					arr[x] = arr2[x2];
					System.out.print(arr[x] + "\t");
					x++;
					x2++;
				}
			} else if (x1 >= arr1.length) {
				arr[x] = arr2[x2];
				System.out.print(arr[x] + "\t");
				x++;
				x2++;
			} else if (x2 >= arr2.length) {
				arr[x] = arr1[x1];
				System.out.print(arr[x] + "\t");
				x++;
				x1++;
			}

		}

	}

}
