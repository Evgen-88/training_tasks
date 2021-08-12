package by.konoplyanik.java_online_training.module2.part2;

/*
Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
которых число 5 встречается три и более раз.
*/

public class Problem11 {

	public static void main(String[] args) {

		int[][] arr;
		arr = new int[10][20];
		int count;
		int[] dev5;
		dev5 = new int[10];

		System.out.println("Исходная матрица:");
		for (int i = 0; i < 10; i++) {
			count = 0;
			for (int j = 0; j < 20; j++) {
				arr[i][j] = (int) (Math.random() * 16);
				System.out.print(arr[i][j] + "\t");
				if ((arr[i][j] % 5 == 0) && (arr[i][j] % 10 != 0))
					count++;
			}
			dev5[i] = count;
			System.out.println();
		}

		count = 0;
		System.out.println("Номера строк, в которых 5 встречается три и больше раз:");
		for (int i = 0; i < 10; i++) {
			if (dev5[i] >= 3) {
				System.out.print((i + 1) + "\t");
				count++;
			}
		}
		if (count == 0)
			System.out.print("таких строк нет.");
	}
}