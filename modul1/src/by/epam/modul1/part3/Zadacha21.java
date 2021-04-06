package by.epam.modul1.part3;

import java.util.Scanner;

/*Составить программу для вычисления значений функции F(x) на отрезке [a,b] с шагом h. 
 * Результат предоставить в виде таблицы, первый столбец которой-значение аргумента, 
 * второй-соответствующее значение функции: F(x)=x-sin(x) */

public class Zadacha21 {

	public static void main(String[] args) {
		double a;
		double b;
		double h;
		double x;
		double y;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите а");
		a = sc.nextDouble();
		System.out.println("Введите b");
		b = sc.nextDouble();
		System.out.println("Введите h");
		h = sc.nextDouble();

		x = a;
		System.out.println("  x " + " | " + "  y");
		while (x <= b) {
			y = x - Math.sin(x);
			System.out.println(x + "  | " + y);
			x = x + h;
		}

	}

}
