package by.konoplyanik.java_online_training.module2.part4;

/*
Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
использовать декомпозицию.
*/

public class Problem14 {
	
	private static int count(int n) {
		
		int c;
		
		c = 0;
		
		while (n != 0) {
			n = n / 10;
			c++;
		}
		
		return c;
	}

	private static int sum(int n) {
		
		int s;
		
		s = 0;
		
		while (n != 0) {
			s = s + n % 10;
			n /= 10;
		}
		
		return s;
	}

	private static void check(int n) {
		
		if (Math.pow(sum(n), count(n)) == n) {
			System.out.print(n + "\t");
		}
	}
	
	public static void main(String[] args) {
		
		int n;
		
		n = (int) (Math.random() * 1000 + 1);
		
		System.out.println("Числа армстронга из диапазона от 1 до " + n + ":");
		
		for (int i = 1; i <= n; i++) {
			check(i);
		}
	}

}
