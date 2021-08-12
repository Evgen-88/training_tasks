package by.konoplyanik.java_online_training.module2.part4;

/*
Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
*/

public class Problem17 {

	private static int sum(int n) {
		
		int s;
		
		s = 0;
		
		while (n != 0) {
			s = s + (n % 10);
			n /= 10;
		}
		
		return s;
	}

	private static int num(int n) {
		
		int count;
		
		count = 0;
		
		while (n != 0) {
			
			int s;
			
			s = sum(n);
			n = n - s;
			count++;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
		int n;
		
		n = (int) (Math.random() * 1000 + 1);
		
		System.out.println("Из числа " + n + " требуется " + num(n) + " раз вычесть сумму его цифр.");
	}

}
