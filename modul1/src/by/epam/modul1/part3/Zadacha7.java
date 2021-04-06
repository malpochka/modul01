package by.epam.modul1.part3;

import java.util.Scanner;

/*Вычислить значения функции на отрезке [a,b] c шагом h:
 * y = {x, x > 2;-x, x <= 2;*/

public class Zadacha7 {

	public static void main(String[] args) {
		int a;
		int b;
		int h;
		int x;
		int y;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите значение а");
		a = sc.nextInt();
		System.out.println("Введите значение b");
		b = sc.nextInt();
		System.out.println("Введите значение шага h");
		h = sc.nextInt();

		x = a;
		while (x <= b) {
			if (x > 2) {
				y = x;
				System.out.println("Значение функции равно " + y);

			} else {
				y = -x;
				System.out.println("Значение функции равно " + y);

			}
			x = x + h;
		}

	}

}
