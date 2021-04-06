package by.epam.modul1.part2;

import java.util.Scanner;

//Cоставить программу определения наименьшего из двух чисел A и B.

public class Zadacha5 {

	public static void main(String[] args) {
		int A;
		int B;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число A");
		A = sc.nextInt();
		System.out.println("Введите число  B");
		B = sc.nextInt();

		if (A < B) {
			System.out.println("число А наименьшее");
		} else if (B < A) {
			System.out.println("число B наименьшее");
		} else {
			System.out.println("числа А и В равны");
		}

	}

}
