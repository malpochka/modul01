package by.epam.modul1.part2;

import java.util.Scanner;

/* Даны три числа a,b,c. Определить, какое из них равно d.Если ни одно не равно d,
 * то найти max(d-a,d-b,d-c).*/

public class Zadacha28 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		int max;
		int x;
		int y;
		int z;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число а");
		a = sc.nextInt();
		System.out.println("Введите число b");
		b = sc.nextInt();
		System.out.println("Введите число c");
		c = sc.nextInt();
		System.out.println("Введите число d");
		d = sc.nextInt();

		if (a == d & b == d & c != d) {
			System.out.println("Число a и b равно d");
		} else if (a == d & c == d & b != d) {
			System.out.println("Число a и c равно d");
		} else if (b == d & c == d & a != d) {
			System.out.println("Число b и c равно d");
		} else if (a == d) {
			System.out.println("Число а равно d");
		} else if (b == d) {
			System.out.println("Число b равно d");
		} else if (c == d) {
			System.out.println("Число c равно d");

		} else {

			x = d - a;
			y = d - b;
			z = d - c;

			max = Math.max((x), Math.max(y, z));
			System.out.println("Максимальное значение равно " + max);
		}

	}

}
