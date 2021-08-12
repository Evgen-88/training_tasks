package by.konoplyanik.java_online_training.module4.part1.task3;

public class Student {
	
	private String name;
	private int group;
	private int[] performance;
	
	public Student(String name, int group, int[] performance) {
		super();
		this.name = name;
		this.group = group;
		this.performance = performance;
	}
	
	public String getName() {
		return name;
	}
	
	public int getGroup() {
		return group;
	}
	
	public int[] getPerformance() {
		return performance;
	}

}
