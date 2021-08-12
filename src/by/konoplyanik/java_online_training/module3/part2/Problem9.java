package by.konoplyanik.java_online_training.module3.part2;

import java.util.Scanner;

/*
Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
буквы.
*/

public class Problem9 {

	public static void main(String[] args) {

		int numLow;
		int numHigh;
		String str = new String();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		numLow = 0;
		numHigh = 0;

		System.out.println("Введите строку:");
		str = sc.nextLine();

		for (int i = 0; i < str.length(); i++) {

			if (Character.isLetter(str.charAt(i))) {
				if (((int) str.charAt(i) >= 65) && ((int) str.charAt(i) <= 90)
						|| ((int) str.charAt(i) >= 97) && ((int) str.charAt(i) <= 122)) {
					if (Character.isLowerCase(str.charAt(i))) {
						numLow++;
					} else {
						numHigh++;
					}
				}
			}
		}

		System.out.print("В введенной строке " + numLow + " строчных и " + numHigh + " прописных букв.");
	}

}
