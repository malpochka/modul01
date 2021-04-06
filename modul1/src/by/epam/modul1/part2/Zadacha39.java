package by.epam.modul1.part2;

import java.util.Scanner;

//Найти значение функции: f(x){-x^2 + x - 9; если x >= 8; 1 / (x^4 - 6) если x < 8;
public class Zadacha39 {

	public static void main(String[] args) {
		int x;
		int y;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите значение х");
		x = sc.nextInt();

		if (x >= 8) {
			y = -x * x + x - 9;
			System.out.println("Значение функции равно " + y);
		} else if (x < 8) {
			y = (int) (1 / (Math.pow(x, 4) - 6));
			System.out.println("Значение функции равно " + y);
		} else {
			System.out.println("Попробуйте еще раз ");
		}

	}

}
