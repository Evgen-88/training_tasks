package by.konoplyanik.java_online_training.module2.part4;

// Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

public class Problem11 {
	
	private static int numCount(int num) {
		
		int count;
		
		count = 0;
		
		while (num != 0) {
			num /= 10;
			count++;
		}
		
		return count;
	}

	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		num1 = (int) (Math.random() * 10001);
		num2 = (int) (Math.random() * 10001);
		
		System.out.println("Даны числа " + num1 + " и " + num2 + ".");
		
		if (numCount(num1) == numCount(num2)) {
			System.out.println("Количество цифр в пером и втором числе одинаково.");
		} else if (numCount(num1) > numCount(num2)) {
			System.out.println("В первом числе цифр больше чем во втором.");
		} else {
			System.out.println("Во втором числе цифр больше чем в первом.");
		}
		
	}

}
