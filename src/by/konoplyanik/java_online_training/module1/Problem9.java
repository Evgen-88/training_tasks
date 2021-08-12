package by.konoplyanik.java_online_training.module1;


// Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

public class Problem9 {

	public static void main(String[] args) {

		double x1;
		double y1;
		double x2;
		double y2;
		double x3;
		double y3;
		
		x1 = 1;
		y1 = 2.5;
		x2 = 3;
		y2 = 3.5;
		x3 = -4;
		y3 = 0;

		if (((x1 == x2) & (x1 == x3)) || ((y1 == y2) & (y1 == y3)))
			System.out.println("Точки расположены на одной прямой.");
		else {
			if ((x3 - x1) * (y2 - y1) == (x2 - x1) * (y3 - y1))
				System.out.println("Точки расположены на одной прямой.");
			else
				System.out.println("Точки не расположены на одной прямой.");
		}

	}

}
