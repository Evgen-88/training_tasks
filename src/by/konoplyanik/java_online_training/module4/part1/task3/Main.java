package by.konoplyanik.java_online_training.module4.part1.task3;

/*
Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
номеров групп студентов, имеющих оценки, равные только 9 или 10.
*/

public class Main {
	
	private static void findStudent(Student[] student) {
		
		int count;
		
		for (Student st: student) {
			count = 0;
			for (int perf: st.getPerformance()) {
				if (perf == 9 || perf == 10) {
					count++;
				}
			}
			if (count == st.getPerformance().length) {
				System.out.println(st.getName() + " группа № " + st.getGroup());
			}
		}
		
	}

	public static void main(String[] args) {
		
		Student[] student = new Student[10];
		student[0] = new Student("Иванов И.И.", 131, new int[] {9, 7, 5, 4, 8});
		student[1] = new Student("Петров П.П.", 132, new int[] {9, 9, 6, 10, 8});
		student[2] = new Student("Сидоров Д.П.", 133, new int[] {9, 9, 10, 9, 10});
		student[3] = new Student("Широков И.Д.", 131, new int[] {8, 7, 8, 9, 10});
		student[4] = new Student("Сигал С.И.", 131, new int[] {9, 9, 9, 9, 10});
		student[5] = new Student("Норрис Ч.Н.", 133, new int[] {10, 10, 9, 10, 10});
		student[6] = new Student("Бананов Ф.Г.", 132, new int[] {9, 10, 9, 7, 10});
		student[7] = new Student("Грозный И.И.", 131, new int[] {10, 9, 5, 5, 8});
		student[8] = new Student("Филиппов Ф.Ф.", 133, new int[] {9, 5, 6, 9, 10});
		student[9] = new Student("Собакин С.С.", 132, new int[] {9, 10, 9, 9, 9});
		
		findStudent(student);
	}

}
