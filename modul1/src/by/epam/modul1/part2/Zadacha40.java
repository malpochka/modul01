package by.epam.modul1.part2;

import java.util.Scanner;

//Вычислить значение функции: F(x)={-x^3 + 9, если x <= 13; -(3 / x + 1), если x > 13;
public class Zadacha40 {

	public static void main(String[] args) {
		int x;
		int y;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите значение х");
		x = sc.nextInt();

		if (x <= 13) {
			y = (int) (Math.pow(-x, 3) + 9);
			System.out.println("Значение функции равно " + y);
		} else if (x > 13) {
			y = -(3 / x + 1);
			System.out.println("Значение функции равно " + y);
		} else {
			System.out.println("Попробуйте еще раз ");
		}

	}

}
