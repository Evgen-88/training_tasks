package by.konoplyanik.java_online_training.module2.part4;

/*
Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
*/

public class Problem16 {

	private static int first(int n) {

		int f;

		f = 0;

		for (int i = 0; i < n; i++) {

			f = f * 10 + 1;
		}
		return f;
	}
	

	private static int last(int n) {

		int l;

		l = 0;

		for (int i = 0; i < n; i++) {

			l = l * 10 + 9;
		}
		return l;
	}
	

	private static boolean check(int n, int num) {
		
		int count;
		
		count = 1;
		
		while (count <= n) {
			
			if ((n % 10) / 2 != 0) {
				n /= 10;
			} else {
				return false;
			}
			count++;
		}
		return true;
	}

	private static long sum(int n) {
		
		long s;
		
		s = 0;
		
		for (int i = first(n); i <= last(n); i++) {
			
			if (check(n, i)) {
				
				s += i;
			}
		}
		
		return s;
	}

	private static int num(long sum) {
		
		int n;
		
		n = 0;
		
		while (sum != 0) {
			
			if ((sum % 10) % 2 == 0) {
				
				n++;
			}
			
			sum = sum / 10;
		}
		
		return n;
	}
	
	public static void main(String[] args) {

		int n;
		long s;

		n = (int) (Math.random() * 6 + 2);
		s = sum(n);
		
		System.out.println("Сумма " + n + "-значных чисел с нечетными цифрами в составе равно: " + s + ".");
		System.out.println("В найденной сумме четных цифр: " + num(s) + ".");
	}

}
