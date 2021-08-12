package by.konoplyanik.java_online_training.module3.part1;

// Замените в строке все вхождения 'word' на 'letter'.

public class Problem2 {

	public static void main(String[] args) {
		
		String str = "This is a test of word, and other word expressions.";
		
		String str1 = str.replace("word", "letter");
		
		System.out.print(str1);
	}

}
