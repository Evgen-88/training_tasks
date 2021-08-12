package by.konoplyanik.java_online_training.module2.part4;

// Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
// если угол между сторонами длиной X и Y— прямой.

public class Problem9 {

	private static double angle(double x, double y, double z,double t) {
		
		double a;
		
		a = Math.acos((z * z + t * t - (x * x + y * y)) / (2 * z * t));
		
		return a;
	}
	
	private static double square(double x, double y, double z, double t, double a) {
		
		double s;
		double p;
		
		p = (x + y + z + t) / 2.0;
		s = Math.sqrt((p - x) * (p - y) * (p - z) * (p - t) - x * y * z * t * Math.pow(Math.cos((a + angle(x, y, z, t)) / 2), 2));
		
		return s;
	}
	
	public static void main(String[] args) {
		
		double x;
		double y;
		double z;
		double t;
		double a;
		
		x = 2.0;
		y = 4.5;
		z = 3.0;
		t = 5.0;
		a = 90;
		
		System.out.print("Площадь четырехугольника равна: " + square(x, y, z, t, a) + ".");
	}

}
