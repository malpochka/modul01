package by.epam.modul1.part3;

import java.util.Scanner;

/*Вычислить значения функции на отрезке [a,b] с шагом h:
 * y = {(x + c) * 2, x = 15; (x - c) + 6, x != 15;*/

public class Zadacha8 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int h;
		int x;
		int y;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите значение a");
		a = sc.nextInt();
		System.out.println("Введите значение b");
		b = sc.nextInt();
		System.out.println("Введите значение c");
		c = sc.nextInt();
		System.out.println("Введите значение  шага h");
		h = sc.nextInt();

		x = a;
		while (x <= b) {
			if (x == 15) {
				y = (x + c) * 2;
				System.out.println("Значение функции равно " + y);
			} else {
				y = (x - c) + 6;
				System.out.println("Значение функции равно " + y);
			}
			x += h;
		}

	}


}
