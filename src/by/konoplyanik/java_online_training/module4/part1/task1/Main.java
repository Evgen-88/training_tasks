package by.konoplyanik.java_online_training.module4.part1.task1;

/*
Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
наибольшее значение из этих двух переменных.
*/

public class Main {

	public static void main(String[] args) {
		
		Test1 test = new Test1(4, 25);
		
		test.printVar();
		
		System.out.println("Сумма двух переменных равна " + test.sumVar() + ".");
		
		test.setVar1(13);
		
		test.setVar2(17);
		
		test.printVar();
		
		System.out.println("Сумма двух переменных равна " + test.sumVar() + ".");
		
		test.compareVar();
	}

}
