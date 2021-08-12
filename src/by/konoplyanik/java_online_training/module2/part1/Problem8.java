package by.konoplyanik.java_online_training.module2.part1;

/*
 * Дана последовательность целых чисел a1, a2, ...,an. Образовать новую последовательность, выбросив из
исходной те члены, которые равны min(a1,a2, ...,an).
*/

public class Problem8 {

	public static void main(String[] args) {
		
		int n;
		n = (int) (Math.random() * 10 + 1);
		int[] arr = new int[n];
		int min;
		int count;
		count = 0;
		
		System.out.println("Исходня последовательность: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10);
			System.out.print(arr[i] + " ");
		}
		
		min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == min)
				count++;
		}
		
		System.out.println();
		System.out.println("Итоговая последовательность после исключения всех членов со значением "
		+ min + ":");
		
		int[] arrNew = new int[n - count];
		int i;
		int j;
		i = 0;
		j = 0;
		while (i <= arrNew.length) {
			if (arr[i] != min) {
				arrNew[j] = arr[i];
				System.out.print(arrNew[j] + " ");
				i++;
				j++;
			} else 
				i++;
		}
	}

}
