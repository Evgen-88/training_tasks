package by.konoplyanik.java_online_training.module2.part4;

// Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

public class Problem2 {
	
	private static int gcd(int max, int min) {
		
		int temp;
		
		while (min != 0) {
			temp = max % min;
			max = min;
			min = temp;
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		
		int n;
		int[] arr;
		int comlcm;
		
		n = 4;
		arr = new int[n];
		
		System.out.println("Исходные 4 натуральных числа:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 1000 + 1);
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		
		if (arr[0] > arr[1]) {
			comlcm = gcd(arr[0], arr[1]);
		} else {
			comlcm = gcd(arr[1], arr[0]);
		}
		
		for (int i = 2; i < arr.length; i++) {
			if (comlcm > arr[i]) {
				comlcm = gcd(comlcm, arr[i]);
			} else {
				comlcm = gcd(arr[i], comlcm);
			}
		}
		
		System.out.print("Наибольший общий делитель представленных чисел равен " + comlcm + ".");
	}

}
