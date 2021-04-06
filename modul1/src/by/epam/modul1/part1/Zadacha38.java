package by.epam.modul1.part1;
//Дано значение х, получить значение -2х + 3х^2 - 4x^3 и 1 + 2x + 3x^2 + 4x^3.

import java.util.Scanner;

public class Zadacha38 {

	public static void main(String[] args) {
		int x;
		int rez1;
		int rez2;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите значение  x");
		x = sc.nextInt();
		rez1 = x * ((-x) * (4 * x - 3) - 2);
		rez2 = (((4 * x + 3) * x + 2) * x + 1);
		System.out.println("Значение первого уравнения равно " + rez1);
		System.out.println("Значение второго уравнения равно  " + rez2);

	}

}
