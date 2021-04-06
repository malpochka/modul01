package by.epam.modul1.part2;

import java.util.Scanner;

//Составить программу нахождения наименьшего из квадратов двух чисел A и B
public class Zadacha8 {

	public static void main(String[] args) {
		int A;
		int B;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число A");
		A = sc.nextInt();
		System.out.println("Введите число B");
		B = sc.nextInt();

		if (A < B) {
			System.out.println(Math.pow(A, 2));
		} else if (B < A) {
			System.out.println(Math.pow(B, 2));
		} else {
			System.out.println("Числа А и В равны");
		}

	}

}
