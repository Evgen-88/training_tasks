package by.konoplyanik.java_online_training.module2.part3;

/*
Сортировка вставками. Дана последовательность чисел a1, a2, ..., an. Требуется переставить числа в порядке
возрастания. Делается это следующим образом. Пусть a1, a2, ..., ai - упорядоченная последовательность,
т. е. a1 <= a2 <= ... <= an. Берется следующее число a(i+1) и вставляется в последовательность так, чтобы новая
последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i+1 до n
не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.

*/

public class Problem5 {

	private static int binarySearch(int[] arr, int key, int max) {
		int min;
		int mid;

		min = 0;

		if (max == 1) {
			if (arr[min] <= key) {
				return 1;
			} else
				return 0;
		} else {
			while (min < max){
                mid = (min + max) / 2;
                if (arr[mid] > key){
                	if (mid == 0) {
                		return mid;
                	} else if (arr[mid - 1] < key) {
                		return mid;
                	} else max = mid - 1;
                } else if (arr[mid] < key){
                    if (arr[mid + 1] >= key){
                        return mid + 1;
                    } else min = mid + 1;
                } else return mid;
            }
        } return max;
	}

	public static void main(String[] args) {

		int n;
		int[] arr;
		int temp;

		n = (int) (Math.random() * 10 + 3);
		arr = new int[n];

		System.out.println("Исходная последовательность размерности " + n + ":");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 101) - 50;
			System.out.print(arr[i] + "\t");
		}
		System.out.println();

		/*
		 * без бинарного поиска: for (int i = 1; i < arr.length; i++) { for (int j = i;
		 * j >= 1; j--) { if (arr[j - 1] > arr[j]) { temp = arr[j]; arr[j] = arr[j - 1];
		 * arr[j - 1] = temp; } } }
		 */
		for (int i = 1; i < arr.length; i++) {
			
			int poz;
			poz = binarySearch(arr, arr[i], i);
			
			for (int j = i; j > poz; j--) {
				temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}
		}
		System.out.println();
		
		System.out.println("Отсортированная последовательность:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();

	}

}
