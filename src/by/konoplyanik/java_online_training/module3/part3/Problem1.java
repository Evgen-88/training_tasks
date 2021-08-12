package by.konoplyanik.java_online_training.module3.part3;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

/*
Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
алфавиту.
*/

public class Problem1 {

	private static String[] separateIntoParagraph(String text) {

		return text.split("\n");
	}

	private static String[] separateIntoSentence(String paragraph) {

		String[] sentence = paragraph.split("(?<=([.!?]+\s))");

		for (int i = 0; i < sentence.length; i++) {
			sentence[i] = sentence[i].trim();
		}
		return sentence;
	}

	private static String[] separateIntoWord(String sentence) {

		sentence = sentence.replaceAll("[,.!?-]+", " ");
		String[] word = sentence.split("\s+");

		return word;
	}

	private static String sortBySentence(String[] paragraph) {

		StringBuilder sortedParagraph = new StringBuilder();
		int temp;
		String tempParagraph;
		int[] numSent = new int[paragraph.length];

		for (int i = 0; i < numSent.length; i++) {
			numSent[i] = paragraph[i].split("[.!?]").length;
		}

		for (int i = 0; i < numSent.length - 1; i++) {
			for (int j = 0; j < numSent.length - 1 - i; j++) {
				if (numSent[i] > numSent[i + 1]) {
					temp = numSent[i + 1];
					numSent[i + 1] = numSent[i];
					numSent[i] = temp;
					tempParagraph = paragraph[i + 1];
					paragraph[i + 1] = paragraph[i];
					paragraph[i] = tempParagraph;
				}
			}
		}

		for (int i = 0; i < paragraph.length; i++) {
			sortedParagraph.append(paragraph[i]).append("\n");
		}

		return sortedParagraph.toString().trim();
	}

	private static String sortByWord(String text) {

		String sortedText = new String();
		String[] paragraph = separateIntoParagraph(text);
		String[] sortedParagraph = new String[paragraph.length];
		
		for (int i = 0; i < paragraph.length; i++) {
			String[] sentence = separateIntoSentence(paragraph[i]);
			String[] sortedSentence = new String[sentence.length];

			for (int j = 0; j < sentence.length; j++) {
				
				int temp;
				String tempWord;
				String punctMark = sentence[j].replaceAll("[^.!?]+", " ").trim();
				String[] word = separateIntoWord(sentence[j]);
				int[] numWord = new int[word.length];

				for (int k = 0; k < word.length; k++) {
					numWord[k] = word[k].length();
				}

				for (int k = 0; k < word.length - 1; k++) {
					for (int m = 0; m < word.length - 1 - k; m++) {
						if (numWord[m] > numWord[m + 1]) {
							temp = numWord[m + 1];
							numWord[m + 1] = numWord[m];
							numWord[m] = temp;
							tempWord = word[m + 1];
							word[m + 1] = word[m];
							word[m] = tempWord;
						}
					}
				}

				sortedSentence[j] = word[0].concat(" ");

				for (int k = 1; k < word.length; k++) {
					sortedSentence[j] = sortedSentence[j].concat(word[k]).concat(" ");
				}

				sortedSentence[j] = sortedSentence[j].trim();
				sortedSentence[j] = sortedSentence[j].concat(punctMark);
			}

			sortedParagraph[i] = sortedSentence[0].concat(" ");

			for (int j = 1; j < sentence.length; j++) {
				sortedParagraph[i] = sortedParagraph[i].concat(sortedSentence[j]).concat(" ");
			}

			sortedParagraph[i] = sortedParagraph[i].trim();
		}

		sortedText = sortedParagraph[0].concat("\n");

		for (int i = 1; i < paragraph.length; i++) {
			sortedText = sortedText.concat(sortedParagraph[i]).concat("\n");
		}

		return sortedText.trim();
	}

	private static String sortBySymbol(String text, String symbol) {
		
		String sortedText = new String();
		String[] paragraph = separateIntoParagraph(text); // текст на абзацы
		String[] sortedParagraph = new String[paragraph.length];
		
		for (int i = 0; i < paragraph.length; i++) {
			String[] sentence = separateIntoSentence(paragraph[i]); // абзацы на предложения
			String[] sortedSentence = new String[sentence.length];

			for (int j = 0; j < sentence.length; j++) {
				
				int temp;
				String tempWord;
				String punctMark = sentence[j].replaceAll("[^.!?]+", " ").trim(); // знак препинания
				String[] word = separateIntoWord(sentence[j]); // предложения на слова
				int[] numWord = new int[word.length];
				Pattern pat = Pattern.compile(symbol, 2);
				Matcher[] mat = new Matcher[word.length];

				for (int k = 0; k < word.length; k++) {
					int count = 0;
					mat[k] = pat.matcher(word[k]);
					while (mat[k].find()) {
						count++;
					}
					numWord[k] = count;
				}

				for (int k = 0; k < word.length - 1; k++) {
					for (int m = 0; m < word.length - 1 - k; m++) {
						if (numWord[m] < numWord[m + 1]) {
							temp = numWord[m + 1];
							numWord[m + 1] = numWord[m];
							numWord[m] = temp;
							tempWord = word[m + 1];
							word[m + 1] = word[m];
							word[m] = tempWord;
						} else if (numWord[m] == numWord[m + 1]) {
							if (compareWord(word[m], word[m + 1]) == 2) {
								temp = numWord[m + 1];
								numWord[m + 1] = numWord[m];
								numWord[m] = temp;
								tempWord = word[m + 1];
								word[m + 1] = word[m];
								word[m] = tempWord;
							}
						}
					}
				}

				sortedSentence[j] = word[0].concat(" ");
				for (int k = 1; k < word.length; k++) {
					sortedSentence[j] = sortedSentence[j].concat(word[k]).concat(" ");
				}

				sortedSentence[j] = sortedSentence[j].trim();
				sortedSentence[j] = sortedSentence[j].concat(punctMark);
			}

			sortedParagraph[i] = sortedSentence[0].concat(" ");
			for (int j = 1; j < sentence.length; j++) {
				sortedParagraph[i] = sortedParagraph[i].concat(sortedSentence[j]).concat(" ");
			}

			sortedParagraph[i] = sortedParagraph[i].trim();
		}

		sortedText = sortedParagraph[0].concat("\n");
		for (int i = 1; i < paragraph.length; i++) {
			sortedText = sortedText.concat(sortedParagraph[i]).concat("\n");
		}

		return sortedText.trim();
	}
	
	private static int compareWord(String word1, String word2) {
		
		int i;
		i = 0;
		
		while ((i < word1.length()) && (i < word2.length())) {
			i++;
			if ((int) word1.toLowerCase().charAt(i - 1) != (int) word2.toLowerCase().charAt(i - 1)) {
				break;
			}
		}
		
		if ((int) word1.toLowerCase().charAt(i - 1) < (int) word2.toLowerCase().charAt(i - 1)) {
			return 1;
		} else if ((int) word1.toLowerCase().charAt(i - 1) > (int) word2.toLowerCase().charAt(i - 1)) {
			return 2;
		} else {
			if (word1.length() > word2.length()) {
				return 2;
			} else {
				return 1;
			}
		}
	}
	
	public static void main(String[] args) {

		String text = "The sky is full of clouds today. No sun at all! I hate such weather. Damn... Never mind.\n"
				+ "I have 2 brothers. One is smart but noisy, second is an asshole. Mother, can I have a sister, please?\n"
				+ "Cooking takes a lot of time. May be, I should have married a chef? Who knows... Good idea!";

		System.out.print(sortBySentence(separateIntoParagraph(text)));

		System.out.println("\n");
		
		System.out.print(sortByWord(text));
		
		System.out.println("\n");
		
		// System.out.print(sortByWord(sortBySentence(separateIntoParagraph(text))));
		
		// System.out.println("\n");
		
		System.out.print("Введите символ: ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String symbol = new String() + sc.nextLine().charAt(0);
		
		System.out.print(sortBySymbol(text, symbol));
	}

}
