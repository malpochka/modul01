package by.epam.modul1.part1;

import java.util.Scanner;

/*Даны натуральные числа М и N , вывести старшую цифру дробной части и
младшую цифру целой части числа M/N*/

public class Zadacha33 {

	public static void main(String[] args) {
		double m;
		double n;
		double z;
		int x;
		int y;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Натуральное число M");
		m = sc.nextDouble();
		System.out.println("Натуральное число  N");
		n = sc.nextDouble();

		z = m / n;

		x = (int) z % 10;
		y = (int) (z * 10) % 10;

		System.out.println(z);
		System.out.println("Старшая цифра дробной части  " + y);
		System.out.println("Младшая цифра целой части " + x);

	}

}
