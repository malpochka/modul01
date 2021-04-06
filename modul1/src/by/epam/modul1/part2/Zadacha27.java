package by.epam.modul1.part2;

import java.util.Scanner;

//Найти max{min(a,b),min(c,d)}
public class Zadacha27 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		int maxNumber;
		int minNumberab;
		int minNumbercd;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число a");
		a = sc.nextInt();
		System.out.println("Введите число b");
		b = sc.nextInt();
		System.out.println("Введите число c");
		c = sc.nextInt();
		System.out.println("Введите число d");
		d = sc.nextInt();

		if (a == b | c == d) {
			System.out.println("Вы ввели одинаковые числа");

		} else {
			minNumberab = Math.min(a, b);
			System.out.println("Минимальное значение среди a и b равно " + minNumberab);
			minNumbercd = Math.min(c, d);
			System.out.println("Минимальное значение среди c и d равно " + minNumbercd);
			maxNumber = Math.max(minNumberab, minNumbercd);
			System.out.println("Максимальное значение среди минимальных равно " + maxNumber);
		}
	}

}
