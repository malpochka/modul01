package by.epam.modul1.part2;

import java.util.Scanner;

//Написать программу нахождения суммы большего и меньшего из трех чисел.
public class Zadacha26 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int sum;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число a");
		a = sc.nextInt();
		System.out.println("Введитечисло b");
		b = sc.nextInt();
		System.out.println("Введите число c");
		c = sc.nextInt();

		if (a > b & a > c & b < a & b < c) {
			sum = a + b;
			System.out.println("Сумма равна " + sum);
		} else if (a > b & a > c & c < a & c < b) {
			sum = a + c;
			System.out.println("Сумма равна " + sum);
		} else if (b > a & b > c & c < a & c < b) {
			sum = b + c;
			System.out.println("Сумма равна " + sum);
		} else if (b > a & b > c & a < b & a < c) {
			sum = b + a;
			System.out.println("Сумма равна " + sum);
		} else if (c > a & c > b & b < a & b < c) {
			sum = c + b;
			System.out.println("Сумма равна " + sum);
		} else if (c > a & c > b & a < b & a < c) {
			sum = c + a;
			System.out.println("Сумма равна " + sum);
		} else {
			System.out.println("Вы ввели два одинаковых числа ");
		}
	}

}
