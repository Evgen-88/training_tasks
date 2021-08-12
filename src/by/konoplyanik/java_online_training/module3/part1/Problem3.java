package by.konoplyanik.java_online_training.module3.part1;

// В строке найти количество цифр.

public class Problem3 {

	public static void main(String[] args) {
		
		int count;
		String str = "In 1965 2 boys stole 5 aples";
		count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				count++;
			}
		}
		
		System.out.print("В строке " + count + " цифр.");
	}

}
