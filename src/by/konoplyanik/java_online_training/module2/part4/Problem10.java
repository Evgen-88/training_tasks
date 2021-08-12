package by.konoplyanik.java_online_training.module2.part4;

// Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
// являются цифры числа N.

public class Problem10 {

	public static void main(String[] args) {
		
		int n;
		int n1;
		int[] arr;
		int num;
		int count;
		
		n = (int) (Math.random() * 4001);
		System.out.println("Исходное число: " + n + ".");
		num = n;
		n1 = n;
		count = -1;
		
		while (num != 0) {
			num = n1;
			num = num % 10;
			n1 = n1 / 10;
			count++;
		}
		
		arr = new int[count];
		
		System.out.println("Итоговый массив:");
		//System.out.println(count);
		for (int i = arr.length - 1; i >= 0; i--) {
			num = n;
			arr[i] = num % 10;
			n = n / 10;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}

}
