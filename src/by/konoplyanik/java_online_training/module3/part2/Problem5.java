package by.konoplyanik.java_online_training.module3.part2;

// Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

public class Problem5 {

	public static void main(String[] args) {

		int count;
		int index;
		count = 0;
		index = 0;
		String str = " abstract article substance ";

		while (str.indexOf("a", index) >= 0) {
			index = str.indexOf("a", index) + 1;
			count++;
		}

		if (count > 0) {
			System.out.println("В данной строке " + count + " символов “а”.");
		} else {
			System.out.println("В данной строке нет символов “а”.");
		}
	}

}
