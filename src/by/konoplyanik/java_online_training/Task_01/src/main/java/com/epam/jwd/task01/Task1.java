package com.epam.jwd.task01;

import java.util.Scanner;

/*
 * ���� ��� �������������� �����. �������� � ������� �� �� ���, �������� ������� ��������������,
 * � � ��������� ������� � �������������.
 */

public class Task1 {
	
	public static void main(String[] args) {
		double x;
		double y;
		double z;
		
		x = modifyNumber(inputNumber());
		y = modifyNumber(inputNumber());
		z = modifyNumber(inputNumber());
		
		System.out.printf("����������: %f, %f, %f.", x, y, z);
	}
	
	public static double inputNumber() {
		System.out.print("������� �����: ");
		Scanner sc = new Scanner(System.in);
		while(!sc.hasNextDouble()) {
			System.out.print("��������� ����: ");
			sc.nextLine();
		}
		return sc.nextDouble();
	}
	
	public static double modifyNumber(double num) {
		return num = num < 0 ? Math.pow(num, 4.0) : num * num;
	}

}
