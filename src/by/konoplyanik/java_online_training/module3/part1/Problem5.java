package by.konoplyanik.java_online_training.module3.part1;

/*
Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
Крайние пробелы в строке удалить.
*/

public class Problem5 {

	public static void main(String[] args) {
		
		String str = "  in   1965 2  boys   stole      5  aples   ";
		
		int i;
		int extrai;
		i = 0;
		
		str = str.trim();
		StringBuilder strb = new StringBuilder(str);
		
		while (i < strb.length()) {
			if (strb.charAt(i) == ' ') {
				extrai = 0;
				while (strb.charAt(i + extrai) == ' ') {
					extrai++;
				}
				strb = strb.replace(i, i + extrai, " ");
			}
			i++;
		}
		
		System.out.print(strb);
	}

}
