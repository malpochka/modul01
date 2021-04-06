package by.epam.modul1.part1;

import java.util.Scanner;
//Найти (в радианах, в градусах) все углы треугольника со сторонами abc.

public class Zadacha27 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double x;
		double y;
		double z;
		double x1;
		double y1;
		double z1;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите значение стороны a");
		a = sc.nextDouble();
		System.out.println("Введите значение стороны  b");
		b = sc.nextDouble();
		System.out.println("Введите значение стороны  c");
		c = sc.nextDouble();

		x = Math.acos(((Math.sqrt(b) + Math.sqrt(c) - Math.sqrt(a)) / (2 * b * c)));
		y = Math.acos(((Math.sqrt(a) + Math.sqrt(c) - Math.sqrt(b)) / (2 * a * c)));
		z = Math.toRadians(180) - (x + y);
		x1 = Math.toDegrees(x);
		y1 = Math.toDegrees(y);
		z1 = Math.toDegrees(z);
		System.out.println("Углы треугольника в радианах равны  " + x + "; " + y + "; " + z + ";");
		System.out.println("Углы треугольника в градусах равны  " + x1 + "; " + y1 + "; " + z1 + ";");

	}

}
