package by.konoplyanik.java_online_training.module2.part4;

import java.util.Scanner;

/*
 На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
*/

public class Problem4 {
	
	private static double length(double x1, double y1, double x2, double y2) {
		
		double len;
		
		len = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		
		return len;
	}
	
	private static void maxFind(double[] len, String[] name) {
		
		double max;
		
		max = len[0];
		
		for (int i = 1; i < len.length; i++) {
			if (len[i] > max) {
				max = len[i];
			}
		}
		
		System.out.print("Максимальное расстояние ");
		for (int i = 0; i < len.length; i++) {
			if (len[i] == max) {
				System.out.print(name[i] + "\t");
			}
		}
	}
	
	public static void main(String[] args) {
		
		int n;
		int num;
		int index;
		double[][] point;
		double[] len;
		String[] name;
		
		System.out.print("Введите количество точек: ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		do {
			while (!sc.hasNextInt()) {
				System.out.print("Повторите ввод: ");
				sc.nextLine();
			}
			n = sc.nextInt();
			if (n < 2)
				System.out.print("Повторите ввод: ");
		} while (n < 2);
		
		num = n * (n - 1) / 2;
		index = 0;
		point = new double[n][2];
		len = new double[num];
		name = new String[num];
		
		System.out.println("Координаты точек:");
		for (int i = 0; i < n; i++) {
			System.out.print("точка №" + (i + 1) + " (");
			for (int j = 0; j < 2; j++) {
				point[i][j] = (int) (Math.random() * 201 - 100) / 10.0;
				if (j > 0) {
					System.out.print("; " + point[i][j] + ")");
				} else {
					System.out.print(point[i][j]);
				}
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				len[index] = length(point[i][0], point[i][1], point[j][0], point[j][1]);
				//System.out.print(len[index] + "\t");
				name[index] = "между точкой №" + (i + 1) + " и точкой №" + (j + 1);
				index++;
			}
		}
		
		maxFind(len, name);
	}

}
