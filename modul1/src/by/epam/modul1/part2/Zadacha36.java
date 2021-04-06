package by.epam.modul1.part2;

import java.util.Scanner;

//Вычислить значение функции: f(x) = {x^2- 3x + 9, если x <= 3; 1 / (x^3 + 6), если x > 3};
public class Zadacha36 {

	public static void main(String[] args) {
		int x;
		int y;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите х");
		x = sc.nextInt();

		if (x <= 3) {
			y = x * x - 3 * x + 9;
			System.out.println("Значение функции равно " + y);
		} else if (x > 3) {
			y = 1 / (x * x * x + 6);
			System.out.println("Значение функции равно " + y);
		} else {
			System.out.println("Попробуйте еще раз ");
		}

	}

}
