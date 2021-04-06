package by.epam.modul1.part3;

import java.util.Scanner;

/*Составить программу для вычисления значений функции F(x) на отрезке [a,b] с шагом h. 
 * Результат предоставить в виде таблицы, первый столбец которой-значение аргумента, 
 * второй-соответствующее значение функции: F(x)=ctg(x/3)+1/2*sin(x) */

public class Zadacha23 {

	public static void main(String[] args) {
		double a;
		double b;
		double h;
		double x;
		double y;
		double z;
		double p;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число a");
		a = sc.nextDouble();
		System.out.println("Введите число  b");
		b = sc.nextDouble();
		System.out.println("Введите число  h");
		h = sc.nextDouble();

		x = a;

		System.out.println("  x " + " | " + "  y");
		while (x <= b) {
			z = 1.0 / Math.tan(x / 3.0);
			p = 1.0 / 2.0 * Math.sin(x);
			y = z + p;
			System.out.println(x + "  | " + y);
			x = x + h;

		}

	}

}
