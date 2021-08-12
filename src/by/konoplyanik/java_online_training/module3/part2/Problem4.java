package by.konoplyanik.java_online_training.module3.part2;

// С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.

public class Problem4 {

	public static void main(String[] args) {
		
		String str = "информатика";
		StringBuilder strb = new StringBuilder(String.copyValueOf(str.toCharArray(), 7, 1) +
				String.copyValueOf(str.toCharArray(), 3, 2) + String.copyValueOf(str.toCharArray(), 7, 1));
				
		System.out.print(strb.toString());
	}

}
