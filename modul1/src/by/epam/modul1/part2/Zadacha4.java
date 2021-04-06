package by.epam.modul1.part2;

import java.util.Scanner;

//Cоставить программу сравнения двух чисел A и B.
public class Zadacha4 {

	public static void main(String[] args) {
		int A;
		int B;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число А");
		A = sc.nextInt();
		System.out.println("Введите число  B");
		B = sc.nextInt();

		if (A < B) {
			System.out.println("A<B");
		} else if (A == B) {
			System.out.println("A==B");
		} else {
			System.out.println("A>B");
		}

	}

}
