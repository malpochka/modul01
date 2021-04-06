package by.epam.modul1.part3;

import java.util.Scanner;

/*Составить программу для вычисления значений функции F(x) на отрезке [a,b] с шагом h. 
 * Результат предоставить в виде таблицы, первый столбец которой-значение аргумента, 
 * второй-соответствующее значение функции: F(x)=sin^2(x) */

public class Zadacha22 {

	public static void main(String[] args) {
		double a;
		double b;
		double h;
		double x;
		double y;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите a");
		a = sc.nextDouble();
		System.out.println("Введите b");
		b = sc.nextDouble();
		System.out.println("Введите h");
		h = sc.nextDouble();

		x = a;
		System.out.println("  x " + " | " + "  y");
		while (x <= b) {
			y = Math.pow(Math.sin(x), 2);
			System.out.println(x + "  | " + y);
			x = x + h;
		}

	}

}
