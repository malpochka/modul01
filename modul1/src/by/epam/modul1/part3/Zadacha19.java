package by.epam.modul1.part3;

import java.util.Scanner;

/*Даны числовой ряд и некоторое число e.Найти сумму тех членов ряда, модуль которых
*больше или равен заданному е. Общий член ряда имеет вид An=1/2^n+1/3^n*/

public class Zadacha19 {

	public static void main(String[] args) {
		double e;
		double An;
		double n;
		double sum;
		double x;
		double y;
		double z;
		z=3;		
		x=1;
		y=2;
		n = 1;
		An = x/y+x/z;
		sum = An;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число  e");
		e = sc.nextDouble();
		
		while (Math.abs(An) >= e) {
			n = n + 1;
			An = 1/Math.pow( 2, n) + 1/Math.pow(3, n);
			sum = sum + An;
			System.out.println(sum);
		}

	}

}
