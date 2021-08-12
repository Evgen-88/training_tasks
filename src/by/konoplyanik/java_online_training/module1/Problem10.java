package by.konoplyanik.java_online_training.module1;

// Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
// Определить, пройдет ли кирпич через отверстие.

public class Problem10 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double x;
		double y;
		double z;
		
		a = 10.2;
		b = 23.4;
		x = 10;
		y = 25.5;
		z = 12.3;
		
		if ((a > x) & ((b > y) || (b > z)))
			System.out.println("Кирпич проходит.");
		else
			if ((a > y) & ((b > x) || (b > z)))
				System.out.println("Кирпич проходит.");
			else
				if ((a > z) & ((b > x) || (b > y)))
					System.out.println("Кирпич проходит.");
				else
					System.out.println("Кирпич не проходит.");
	}

}
