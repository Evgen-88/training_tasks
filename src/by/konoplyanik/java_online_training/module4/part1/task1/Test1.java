package by.konoplyanik.java_online_training.module4.part1.task1;

public class Test1 {

	private int var1;
	private int var2;
	
	public Test1(int var1, int var2){
		super();
		this.var1 = var1;
		this.var2 = var2;
	}
	
	public void setVar1(int var1) {
		this.var1 = var1;
	}
	
	public void setVar2(int var2) {
		this.var2 = var2;
	}
	
	public void printVar() {
		System.out.println("Первая переменная равна " + var1 + ";\nвторая переменная равна " + var2 + ".");
	}
	
	public int sumVar() {
		return var1 + var2;
	}
	
	public void compareVar() {
		if (var1 > var2) {
			System.out.println("Значение первой переменной (" + var1 + ") больше.");
		}else if (var2 > var1) {
			System.out.println("Значение второй переменной (" + var2 + ") больше.");
		}else System.out.println("Значения переменных равны.");
	}
}
