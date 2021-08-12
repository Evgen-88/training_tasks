package by.konoplyanik.java_online_training.module1;

// Вычислить значения функции на отрезке [а,b] c шагом h:
// y = x , при x > 2;
// y = -x, при x <= 2.

public class Problem13 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int h;
		int y;
		
		a = -3;
		b = 5;
		h = 1;
		
		System.out.println("Значения функции на отрезке [" + a + "," + b + "] с шагом " + h + ":");
		for (int x = a; x <= b; x += h) {
			if (x <= 2) {
				y = -1 * x;
				System.out.print(y + " ");
			} else if (x > 2) {
				y = x;
				System.out.print(y + " ");
			}
		}
		
	}

}
