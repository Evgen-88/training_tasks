package by.konoplyanik.java_online_training.module3.part1;

// В строке найти количество чисел.

public class Problem4 {

	public static void main(String[] args) {

		int count;
		String str = "In 1965 2 boys stole 5 aples";
		count = 0;

		if (Character.isDigit(str.charAt(str.length() - 1))) {
			count = 1;
			for (int i = 0; i < str.length() - 1; i++) {
				if (Character.isDigit(str.charAt(i)) && !Character.isDigit(str.charAt(i + 1))) {
					count++;
				}
			}
		} else {
			for (int i = 0; i < str.length() - 1; i++) {
				if (Character.isDigit(str.charAt(i)) && !Character.isDigit(str.charAt(i + 1))) {
					count++;
				}
			}
		}

		System.out.print("В строке " + count + " чисел.");
	}

}
