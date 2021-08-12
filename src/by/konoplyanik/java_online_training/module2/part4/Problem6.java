package by.konoplyanik.java_online_training.module2.part4;

// Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

public class Problem6 {

	private static int gcd(int max, int min) {

		int temp;

		while (min != 0) {
			temp = max % min;
			max = min;
			min = temp;
		}
		
		return max;
	}

	private static int mutSimple(int a, int b) {
		
		int marker;
		
		if (a > b) {
			marker = gcd(a, b);
		} else {
			marker = gcd(b, a);
		}
		return marker;
	}
	
	public static void main(String[] args) {

		int a;
		int b;
		int c;
		
		a = (int) (Math.random() * 101 - 50);
		b = (int) (Math.random() * 101 - 50);
		c = (int) (Math.random() * 101 - 50);
		
		System.out.println("Даны три числа: " + a + "; " + b + "; " + c + ".");
		
		if (Math.abs(mutSimple(a, b) * mutSimple(b, c) * mutSimple(a, c)) == 1) {
			System.out.print("Данные три числа взаимно простые.");
		} else {
			System.out.print("Данные три числа не взаимно простые.");
		}
		
	}

}
