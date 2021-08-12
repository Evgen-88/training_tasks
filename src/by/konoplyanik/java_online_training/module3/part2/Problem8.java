package by.konoplyanik.java_online_training.module3.part2;

import java.util.Scanner;

/*
Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
длинных слов может быть несколько, не обрабатывать.
*/

public class Problem8 {

	public static void main(String[] args) {
		
		int max;
		int maxIndex;
		String phrase = new String();
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите строку слов, разделенных пробелами:");
		phrase = sc.nextLine();
		
		//String phrase = "Множество самых разнообразных слов разделенных пробелами";
		
		String[] word = phrase.split(" ");
		max = word[0].length();
		maxIndex = 0;
		
		for (int i = 1; i < word.length; i++) {
			if (word[i].length() > max) {
				max = word[i].length();
				maxIndex = i;
			}
		}
		
		System.out.print("Самое длинное слово в этой фразе - <<" + word[maxIndex] + ">>.");
	}

}
