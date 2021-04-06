package by.epam.modul1.part1;

import java.util.Scanner;

/*Найти площадь треугольника, две стороны которого равны а и b ,А угол между этими
сторонами y. */

public class Zadacha24 {

	public static void main(String[] args) {
		double a;
		double b;
		double A;
		double S;
		double y;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите значение стороны a");
		a = sc.nextDouble();
		System.out.println("Введите значение стороны b");
		b = sc.nextDouble();
		System.out.println("Введите значение угла между стороной a и b");
		A = sc.nextDouble();

		y = Math.toRadians(A);
		S = (a * b * Math.sin(y)) / 2;
		System.out.println("Площадь треугольника =  " + S);

	}

}
