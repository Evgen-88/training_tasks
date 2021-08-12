package by.konoplyanik.java_online_training.module3.part2;

/*
Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
def", то должно быть выведено "abcdef".
*/

public class Problem7 {

	public static void main(String[] args) {
		
		String str = "  abc cde  defgg ";
		StringBuilder strb = new StringBuilder(str);
		int index;
		index = 0;
		
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				strb.deleteCharAt(i - index);
				index++;
			} else {
				for (int j = i - 1; j >= 0; j--) {
					if (str.charAt(j) == str.charAt(i)) {
						strb.deleteCharAt(i - index);
						index++;
					}
				}
			}
		}
		
		System.out.print(strb.toString().trim());
	}

}
