package by.konoplyanik.java_online_training.module2.part3;

/*
Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
дополнительный массив.
*/

public class Problem1 {

	public static void main(String[] args) {
		
		int k;
		int n;
		int m;
		int[] arr1;
		int[] arr2;
		int[] arr;
		
		k = 2;
		n = (int) (Math.random() * 6 + 3);
		m = (int) (Math.random() * 6 + 2);
		arr1 = new int[n];
		arr2 = new int[m];
		arr = new int[n + m];
		
		System.out.println("Первая последовательность:");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (int) (Math.random() * 100) - 99;
			System.out.print(arr1[i] + "\t");
		}
		System.out.println();
		
		System.out.println("Вторая последовательность:");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = (int) (Math.random() * 100) - 49;
			System.out.print(arr2[i] + "\t");
		}
		System.out.println();
		
		System.out.println("Вставка второй последовательности в первую после " + k + "-го елемента:");
		for (int i = 0; i < arr.length; i++) {
			if (i < k) {
				arr[i] = arr1[i];
				System.out.print(arr[i] + "\t");
			}
			else if ((i >= k) && (i - k < arr2.length)) {
				arr[i] = arr2[i - k];
				System.out.print(arr[i] + "\t");
			} else {
				arr[i] = arr1[i - arr2.length];
				System.out.print(arr[i] + "\t");
			}
		}
	}

}
