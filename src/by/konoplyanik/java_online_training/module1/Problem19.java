package by.konoplyanik.java_online_training.module1;

// Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

public class Problem19 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		int aTemp;
		int rez;
		
		a = 1023045;
		b = 2430;
		c = 0;
		aTemp = a;
		rez = 0;
		
		do {
			int a1;
			int count;
			int bTemp;
			
			a1 = aTemp % 10;
			count = 0;
			bTemp = b;
			
			do {
				int b1;
				b1 = bTemp % 10;
				
				if (a1 == b1)
					count++;
				bTemp = bTemp / 10;
			} while (bTemp != 0);
			if (count > 0) {
				c = c + a1;
				c = c * 10;
			}
			aTemp = aTemp / 10;
			if (aTemp == 0)
				c = c / 10;
		} while (aTemp != 0);
		//System.out.println(c);
		
		do {
			int c1;
			int cTemp;
			int count;
			
			c1 = c % 10;
			cTemp = c / 10;
			count = 0;
			
			do {
				int c2;
				
				c2 = cTemp % 10;
				
				if (c1 == c2)
					count++;
				cTemp = cTemp / 10;
			} while (cTemp != 0);
			if (count == 0) {
				rez = rez + c1;
				rez = rez * 10;
			}
			c = c / 10;
			if (c == 0)
				rez = rez / 10;
		} while (c != 0);
		System.out.print("Одновременно в состав числа " + a + " и в состав числа " + b + " входят числа: "
		+ rez + ".");
	}

}
