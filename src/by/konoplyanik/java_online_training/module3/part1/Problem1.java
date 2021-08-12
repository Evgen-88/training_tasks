package by.konoplyanik.java_online_training.module3.part1;

// Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

public class Problem1 {
	
	private static void change(String str) {
		
		int count;
		StringBuilder strb = new StringBuilder(str);
		count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				strb.insert(i + count, '_');
				count++;
			}
		}
		
		System.out.println(strb.toString().toLowerCase());
	}

	public static void main(String[] args) {
		
		String[] arr = {"firstIndex", "lastIndex", "maxSum", "secMaxSum"};		
		
		for (int i = 0; i < arr.length; i++) {
			change(arr[i]);
		}
	}

}
