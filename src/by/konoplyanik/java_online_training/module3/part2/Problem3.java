package by.konoplyanik.java_online_training.module3.part2;

// Проверить, является ли заданное слово палиндромом.

public class Problem3 {

	public static void main(String[] args) {

		String str = "прокакорп";
		StringBuilder strb = new StringBuilder(str).reverse();
		
		if (str.equals(strb.toString())) {
			System.out.print("Слово <<" + str + ">> является палиндромом.");
		} else {
			System.out.print("Слово <<" + str + ">> не является палиндромом.");
		}
	}

}
