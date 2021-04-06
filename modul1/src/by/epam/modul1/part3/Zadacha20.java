package by.epam.modul1.part3;

import java.util.Scanner;

/*Даны числовой ряд и некоторое число e.Найти сумму тех членов ряда, модуль которых
*больше или равен заданному е. Общий член ряда имеет вид An=1/(3n-2)*(3n+1)*/

public class Zadacha20 {

	public static void main(String[] args) {
		double e;
		double An;
		double n;
		double sum;
		double x;
		double y;
		double z;
		double q;

		n = 1;
		x = 3 - 2;
		y = 3 + 1;

		An = 1.0 / (x * y);

		sum = An;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число  e");
		e = sc.nextDouble();

		while (Math.abs(An) >= e) {
			n = n + 1;
			z = 3 * n - 2;
			q = 3 * n + 1;
			An = 1.0 / (z * q);
			sum = sum + An;
			System.out.println(sum);

		}

	}

}
