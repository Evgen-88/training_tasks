package by.konoplyanik.java_online_training.module2.part4;

// Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

public class Problem7 {

	private static int fac(int num) {
		
		int f;
		
		f = 1;
		
		for (int i = 1; i <= num; i++) {
			f *= i;
		}
		
		return f; 
	}
	
	public static void main(String[] args) {
		
		int f;
		
		f = 1;
		
		for (int i = 3; i <= 9; i += 2) {
			f += fac(i);
		}
		
		System.out.print("Сумма факториалов всех нечетных чисел от 1 до 9 равна: " + f + ".");
	}

}
