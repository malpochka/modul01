package by.epam.modul1.part1;

import java.util.Scanner;

/*Дана величина А , выражающая обьем информации в байтах. Перевести А в более крупные
единицы информации*/

public class Zadacha32 {

	public static void main(String[] args) {
		double A;
		double kb;
		double mb;
		double gb;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите величину А, в байтах");
		A = sc.nextDouble();

		kb = A / 1024;
		mb = A / Math.pow(2, 20);
		gb = A / Math.pow(2, 30);

		System.out.println("Величина A в килобайтах: " + kb);
		System.out.println("Величина A в мегабайтах: " + mb);
		System.out.println("Величина A в гигабайтах:  " + gb);

	}

}
