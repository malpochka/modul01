package by.epam.modul1.part2;

import java.util.Scanner;

//Составить программу определения наибольшего из двух чисел А и B.
public class Zadacha6 {

	public static void main(String[] args) {
		int A;
		int B;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число А");
		A = sc.nextInt();
		System.out.println("Введите число B");
		B = sc.nextInt();

		if (A > B) {
			System.out.println("Число А наибольшее");
		} else if (B > A) {
			System.out.println("Число B наибольшее");
		} else {
			System.out.println("Числа А и В равны");
		}

	}

}
