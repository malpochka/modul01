package by.epam.modul1.part1;

import java.util.Scanner;

//Функция с = 3 + а.
public class Zadacha40 {

	public static void main(String[] args) {
		int a;
		int c;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value a");
		a = sc.nextInt();

		c = 3 + a;
		System.out.println("c = " + c);

	}

}
