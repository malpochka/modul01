package by.epam.modul1.part2;

import java.util.Scanner;

/*Написать программу, которая по заданным трем числам определяет, является ли сумма 
 * каких нибудь из них положительной*/

public class Zadacha32 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число a");
		a = sc.nextInt();
		System.out.println("Введите число b");
		b = sc.nextInt();
		System.out.println("Введите число c");
		c = sc.nextInt();

		if ((a + b > 0) | (b + c > 0) | (a + c > 0)) {
			System.out.println("Сумма двух чисел является положительной");
		} else {
			System.out.println("Сумма двух чисел является отрицательной");
		}

	}

}
