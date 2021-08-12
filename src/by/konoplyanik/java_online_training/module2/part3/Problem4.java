package by.konoplyanik.java_online_training.module2.part3;

/*
Сортировка обменами. Дана последовательность чисел a1 <= a2 <= ... <= an.Требуется переставить числа в
порядке возрастания. Для этого сравниваются два соседних числа ai и a(i+1). Если ai > ai+1, то делается
перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
*/

public class Problem4 {

	public static void main(String[] args) {

		int n;
		int[] arr;
		int temp;
		int count;

		n = (int) (Math.random() * 10 + 2);
		arr = new int[n];
		arr[0] = (int) (Math.random() * 10) - 5;
		count = 0;

		System.out.println("Неубывающая последовательность размерности " + n + ":");
		System.out.print(arr[0] + "\t");
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i + 1] = arr[i] + (int) (Math.random() * 5);
			System.out.print(arr[i + 1] + "\t");
		}
		System.out.println();
		
		for (int j = arr.length - 1; j >= 0; j--) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] < arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					count++;
				}
			}
		}

		System.out.println("Отсортированная последовательность:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		
		System.out.println("Потребовалось " + count + " замен.");
	}

}
