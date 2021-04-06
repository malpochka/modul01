package by.epam.modul1.part1;

import java.util.Scanner;
//Три сопротивления R1, R2, R3 соединены параллельно. Найдите сопротивление соединения.

public class Zadacha28 {

	public static void main(String[] args) {
		double R1;
		double R2;
		double R3;
		double SR;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите сопротивление  R1");
		R1 = sc.nextDouble();
		System.out.println("Введите сопротивление  R2");
		R2 = sc.nextDouble();
		System.out.println("Введите сопротивление  R3");
		R3 = sc.nextDouble();

		SR = 1 / ((1 / R1) + (1 / R2) + (1 / R3));
		System.out.println("Сопротивление соединения равно  " + SR);

	}

}
