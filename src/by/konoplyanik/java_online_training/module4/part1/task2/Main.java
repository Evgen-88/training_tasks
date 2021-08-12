package by.konoplyanik.java_online_training.module4.part1.task2;

/*
Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
класса.
*/

public class Main {

	public static void main(String[] args) {
		
		Test2 test = new Test2();
		
		System.out.println(test.getVar1());
		System.out.println(test.getVar2());
		
		test.setVar1(4);
		test.setVar2(8);
		
		System.out.println(test.getVar1());
		System.out.println(test.getVar2());
		
		Test2 test2 = new Test2(9, 12);
		
		System.out.println(test2.getVar1());
		System.out.println(test2.getVar2());
		
		test2.setVar1(16);
		test2.setVar2(24);
		
		System.out.println(test2.getVar1());
		System.out.println(test2.getVar2());
	}

}
