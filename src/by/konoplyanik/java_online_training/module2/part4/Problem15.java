package by.konoplyanik.java_online_training.module2.part4;

// Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
// последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.

public class Problem15 {

	private static int first(int n) {
		
		int min;
		
		min = 0;
		
		for (int i = 0; i < n; i++) {
			min = min * 10 + 1;
		}
		
		return min;
	}

	private static int last(int n) {
		
		int max;
		
		max = 0;
		
		for (int i = 0; i < n; i++) {
			max = max * 10 + 9;
		}
		
		return max;
	}
	
	private static boolean check(int n, int num) {
		
		int prev;
		int curr;
		int count;
		
		count = 2;
		
		while (count <= n) {
			
			prev = num % 10;
			num /= 10;
			curr = num % 10;
			
			if (prev > curr) {
				count++;
			} else {
				return false;
			}
		}
		return true;
	}
	
	private static void find(int n) {
		
		for (int i = first(n); i <= last(n); i++) {
			
			if (check(n, i)) {
				System.out.print(i + "\t");
			}
		}
		
	}

	public static void main(String[] args) {

		int n;
		
		n = (int) (Math.random() * 4 + 2);
		
		System.out.println("Возрастающие " + n + "-значные числа:");
		find(n);
	}

}
