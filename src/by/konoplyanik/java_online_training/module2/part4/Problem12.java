package by.konoplyanik.java_online_training.module2.part4;

/*
Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
являются числа, сумма цифр которых равна К и которые не больше N.
*/

public class Problem12 {

	private static int sum(int num) {

		int s;

		s = 0;

		while (num != 0) {
			s = s + num % 10;
			num = num / 10;
		}

		return s;
	}

	public static void main(String[] args) {

		int k;
		int n;
		int[] arr;
		int count;
		int index;

		k = (int) (Math.random() * 100);
		n = (int) (Math.random() * 1001);
		count = 0;
		index = 0;

		System.out.println("Число К = " + k + "; исло N = " + n + ".");

		for (int i = 1; i <= n; i++) {
			if (sum(i) == k) {
				count++;
			}
		}

		if (count == 0) {
			System.out.println("Элементов, удовлетворяющих условию не существует.");
		} else {

			arr = new int[count];

			System.out.println("Итоговый массив:");

			for (int i = 1; i <= n; i++) {
				if (sum(i) == k) {
					arr[index] = i;
					System.out.print(arr[index] + "\t");
					index++;
				}
			}
		}
	}

}
