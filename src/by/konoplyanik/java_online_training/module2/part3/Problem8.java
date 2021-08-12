package by.konoplyanik.java_online_training.module2.part3;

/*
Даны дроби p1/q1, p2/q2, ..., pn/qn (pi, qi - натуральные). Составить программу, которая приводит эти дроби к общему
знаменателю и упорядочивает их в порядке возрастания
*/

public class Problem8 {

	public static void main(String[] args) {

		int n;
		long[] arrP;
		long[] arrQ;
		long comlcm;
		long max;
		long min;
		long temp;

		n = (int) (Math.random() * 8 + 3);
		arrP = new long[n];
		arrQ = new long[n];

		System.out.println("Последовательность дробей:");
		for (int i = 0; i < arrP.length; i++) {
			arrP[i] = (int) (Math.random() * 10 + 1);
			arrQ[i] = (int) (Math.random() * 10 + 1);
			System.out.print(arrP[i] + "/" + arrQ[i] + "\t");
		}
		System.out.println();
		
		if (arrQ[0] > arrQ[1]) {
			max = arrQ[0];
			min = arrQ[1];
		} else {
			max = arrQ[1];
			min = arrQ[0];
		}
		while (min != 0) {
			temp = max % min;
			max = min;
			min = temp;
		}
		comlcm = (arrQ[0] * arrQ[1]) / max;
		
		for (int i = 2; i < arrQ.length; i++) {
			if (comlcm > arrQ[i]) {
				max = comlcm;
				min = arrQ[i];
			} else {
				max = arrQ[i];
				min = comlcm;
			}
			while (min != 0) {
				temp = max % min;
				max = min;
				min = temp;
			}
			comlcm = (comlcm * arrQ[i]) / max;
		}
		
		System.out.println("Последовательность дробей с общими знаменателями:");
		for (int i = 0; i < arrP.length; i++) {
			arrP[i] = arrP[i] * comlcm / arrQ[i];
			System.out.print(arrP[i] + "/" + comlcm + "\t");
		}
		System.out.println();
		
		for (int i = arrP.length - 1; i >= 0; i--) {
			for (int j = 0; j < arrP.length - 1; j++) {
				if (arrP[j] > arrP[j + 1]) {
					temp = arrP[j];
					arrP[j] = arrP[j + 1];
					arrP[j + 1] = temp;
				}
			}
		}
		
		System.out.println("Отсортированная последовательность дробей с общими знаменателями:");
		for (int i = 0; i < arrP.length; i++) {
			System.out.print(arrP[i] + "/" + comlcm + "\t");
		}
		System.out.println();
	}

}
