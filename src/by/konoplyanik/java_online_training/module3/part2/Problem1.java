package by.konoplyanik.java_online_training.module3.part2;

// Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

public class Problem1 {

	public static void main(String[] args) {
		
		int count;
		count = 0;
		String str = "  in   1965       2  boys   stole     5  aples   ";
		String strComp = " ";
		
		while (str.contains(strComp)) {
			strComp = strComp + " ";
			count++;
		}
		
		System.out.print("Наибольшее количество подряд идущих пробелов равно " + count + ".");
	}

}
