package by.konoplyanik.java_online_training.module1;

import java.lang.Math;

// Вычислить значение выражения по формуле (все переменные принимают действительные значения):
// (sin x + cos y) / (cos x - sin y) * tg xy

public class Problem3 {

	public static void main(String[] args) {
		
		double x;
		double y;
		double rez;
		
		x = 45.0;
		y = 90.0;
		
		rez = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
		System.out.println("Результат равен: " + rez + ".");
		
	}

}
