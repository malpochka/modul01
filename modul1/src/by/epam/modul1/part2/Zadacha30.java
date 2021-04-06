package by.epam.modul1.part2;

import java.util.Scanner;

/* Даны действительные числа ABC. Удвоить эти числа если a>b>c, и заменить их абсолютными 
 * значениями, если это не так.*/

public class Zadacha30 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int a1;
		int b1;
		int c1;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число а");
		a = sc.nextInt();
		System.out.println("Введите число b");
		b = sc.nextInt();
		System.out.println("Введите число c");
		c = sc.nextInt();

		if (a > b & b > c) {
			a1 = a * 2;
			b1 = b * 2;
			c1 = c * 2;
			System.out
					.println("Число а равно " + a1 + ";" + " Число b равно " + b1 + ";" + " Число с равно " + c1 + ";");

		} else {
			a1 = Math.abs(a);
			b1 = Math.abs(b);
			c1 = Math.abs(c);
			System.out
					.println("Число а равно " + a1 + ";" + " Число b равно " + b1 + ";" + " Число с равно " + c1 + ";");
		}

	}

}
