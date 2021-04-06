package by.epam.modul1.part2;

import java.util.Scanner;

/*Составить программу, определяющую результат гадания на ромашке - "любит - не любит",
взяв за исходное данное количество лепестков n.*/

public class Zadacha24 {

	public static void main(String[] args) {
		int n;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число лепестков");
		n = sc.nextInt();

		if (n % 2 == 0) {
			System.out.println("Любит");
		} else {
			System.out.println("Не любит");
		}

	}

}
