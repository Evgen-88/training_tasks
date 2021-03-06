package by.konoplyanik.java_online_training.module3.part2;

/*
Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
знаком. Определить количество предложений в строке X.
*/

public class Problem10 {

	public static void main(String[] args) {
		
		String str = "Строка представляет собой последовательность символов. Для работы со строками в Java определен класс String! Он предоставляет ряд методов для манипуляции строками? Физически объект String представляет собой ссылку на область в памяти, в которой размещены символы.";
		
		String[] word = str.split("[,!?]");
		System.out.print("Предложений в данной строке: " + word.length + ".");
	}

}
