package by.epam.modul1.part2;

import java.util.Scanner;

//Вычислить значение функции: f(x){x^2 если 0 <= x <= 3; 4 если x > 3 или x < 0;
public class Zadacha38 {

	public static void main(String[] args) {
		int x;
		int y;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите значение х");
		x = sc.nextInt();

		if (0 <= x & x <= 3) {
			y = x * x;
			System.out.println("Значение функции равно " + y);
		} else if (x > 3 | x < 0) {
			y = 4;
			System.out.println("Значение функции равно " + y);
		} else {
			System.out.println("Попробуйте еще раз ");
		}

	}

}
