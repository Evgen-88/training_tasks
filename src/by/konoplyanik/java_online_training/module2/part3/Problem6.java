package by.konoplyanik.java_online_training.module2.part3;

/*
Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. Если ai <= a(i+1), то продвигаются
на один элемент вперед. Если ai > a(i+1), то производится перестановка и сдвигаются на один элемент назад.
Составить алгоритм этой сортировки.
*/

public class Problem6 {

	public static void main(String[] args) {

		int n;
		double[] arr;
		double temp;

		n = (int) (Math.random() * 15) + 3;
		arr = new double[n];

		System.out.println("Исходный массив размерностью " + n + ":");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ((int) (Math.random() * 2001) - 1000) / 10.0;
			System.out.print(arr[i] + "\t");
		}
		System.out.println();

		for (int step = n / 2; step > 0; step /= 2) {
			for (int i = step; i < arr.length; i += step) {
				for (int j = i - step; j >= 0; j -= step) {
					if (arr[j] > arr[j + step]) {
						temp = arr[j];
						arr[j] = arr[j + step];
						arr[j + step] = temp;
					}
				}
			}
		}
		
		System.out.println("Отсортированый массив:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}

}
