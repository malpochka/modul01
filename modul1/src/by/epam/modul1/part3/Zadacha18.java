package by.epam.modul1.part3;

import java.util.Scanner;

/*Даны числовой ряд и некоторое число e.Найти сумму тех членов ряда, модуль которых
*больше или равен заданному е. Общий член ряда имеет вид An=(-1)^(n-1)/n*/

public class Zadacha18 {

	public static void main(String[] args) {
		double e;
		double n;
		double An;
		double sum;
		n = 1;
		An = 1;
		sum = An;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число  e");
		e = sc.nextDouble();

		while (Math.abs(An) > e) {
			n = n + 1;
			An = Math.pow(-1, (n - 1)) / n;
			sum = sum + An;
			System.out.println(sum);

		}
	}
}
