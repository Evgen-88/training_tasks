package by.konoplyanik.java_online_training.module3.part2;

// Из заданной строки получить новую, повторив каждый символ дважды.

public class Problem6 {

	public static void main(String[] args) {
		
		int index;
		char element;
		index = 0;
		String str = "abstract article substance";
		StringBuilder strb = new StringBuilder(str);
		
		for (int i = 0; i < str.length(); i++) {
			element = str.charAt(i);
			index++;
			strb.insert(index + i, element);
		}
		
		System.out.print(strb.toString());
	}

}
