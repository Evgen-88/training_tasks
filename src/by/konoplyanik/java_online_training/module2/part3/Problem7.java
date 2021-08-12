package by.konoplyanik.java_online_training.module2.part3;

/*
Пусть даны две неубывающие последовательности действительных чисел a1 <= a2 <= ... <= an и
b1 <= b2 <= ... <= bm. Требуется указать те места, на которые нужно вставлять элементы последовательности
b1 <= b2 <= ... <= bm в первую последовательность так, чтобы новая последовательность оставалась возрастающей.
*/

public class Problem7 {

	public static void main(String[] args) {

		int n;
		int m;
		double[] arrA;
		double[] arrB;
		int max;
		int min;
		int mid;
		int poz;

		n = (int) (Math.random() * 10 + 2);
		m = (int) (Math.random() * 10 + 2);
		arrA = new double[n];
		arrB = new double[m];
		arrA[0] = ((int) (Math.random() * 101) - 50) / 10.0;
		arrB[0] = ((int) (Math.random() * 101) - 50) / 10.0;

		System.out.println("Неубывающая последовательность A размерности " + n + ":");
		System.out.print(arrA[0] + "\t");
		for (int i = 0; i < arrA.length - 1; i++) {
			arrA[i + 1] = arrA[i] + (int) (Math.random() * 11);
			System.out.print(arrA[i + 1] + "\t");
		}
		System.out.println();

		System.out.println("Неубывающая последовательность B размерности " + m + ":");
		System.out.print(arrB[0] + "\t");
		for (int i = 0; i < arrB.length - 1; i++) {
			arrB[i + 1] = arrB[i] + (int) (Math.random() * 11);
			System.out.print(arrB[i + 1] + "\t");
		}
		System.out.println();

		System.out.println("Позиции соответствующих элементов ппоследовательности B в последовательности A:");
		for (int i = 0; i < arrB.length; i++) {
			min = 0;
			max = arrA.length;
			if (arrB[i] > arrA[arrA.length - 1]) {
				poz = arrA.length;
				System.out.print(poz + "\t");
			} else {
				while (min < max) {
					mid = (min + max) / 2;
					if (arrA[mid] < arrB[i]) {
						if (arrA[mid + 1] >= arrB[i]) {
							poz = mid + 1;
							System.out.print(poz + "\t");
							break;
						} else {
							min = mid + 1;
						}
					} else if (arrA[mid] > arrB[i]) {
						if (mid == 0) {
							poz = mid;
							System.out.print(poz + "\t");
							break;
						} else if (arrA[mid - 1] < arrB[i]) {
							poz = mid;
							System.out.print(poz + "\t");
							break;
						} else {
							max = mid - 1;
						}
					} else if (arrA[mid] == arrB[i]) {
						poz = mid;
						System.out.print(poz + "\t");
						break;
					}
				}
			}
		}
	}

}
