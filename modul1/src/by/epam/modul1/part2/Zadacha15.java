package by.epam.modul1.part2;

import java.util.Scanner;

/*Даны действительные числа x и y, не равные друг другу. Меньшее из этих двух чисел 
 * заменить половиной их суммы, а большее их удвоенным произведением*/

public class Zadacha15 {

	public static void main(String[] args) {
		double x;
		double y;
		double a;
		double b;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число x");
		x = sc.nextDouble();
		System.out.println("Введите число y, причем y не равно х");
		y = sc.nextDouble();
		a = (x + y) / 2;
		b = x * y * 2;
		if (x == y) {
			System.out.println("Вы ввели неправильное число");
		} else if (x < y) {
			System.out.println("Х равен " + a + ", a Y равен " + b);
		} else {
			System.out.println("X равен " + b + ", a Y раввен " + a);
		}

	}

}
