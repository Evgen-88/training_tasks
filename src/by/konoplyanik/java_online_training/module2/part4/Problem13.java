package by.konoplyanik.java_online_training.module2.part4;

/*
Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
решения задачи использовать декомпозицию.
*/

public class Problem13 {
	
	private static void check(int n, int a) {
		
		for (int i = a + 1; i <= 2 * n; i++) {
			if (i - a == 2) {
				System.out.print("(" + a + "; " + i + ")" + "\t");
			}
		}
	}

	public static void main(String[] args) {
		
		int n;
		
		n = (int) (Math.random() * 99 + 2);
		
		System.out.println("Пары чисел-близнецов в диапазоне от " + n +  " до " + 2 * n + ":");
		
		for (int i = n; i < 2 * n; i++) {
			check(n, i);
		}
		
	}

}
