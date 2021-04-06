package by.epam.modul1.part2;

import java.util.Scanner;

//Подсчитать количество отрицательных чисел среди чисел ABC.
public class Zadacha18 {

	public static void main(String[] args) {
		int A;
		int B;
		int C;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число A");
		A = sc.nextInt();
		System.out.println("Введите число B");
		B = sc.nextInt();
		System.out.println("Введите число C");
		C = sc.nextInt();

		if (A < 0 & B < 0 & C < 0) {
			System.out.println("Три отрицательных числа");
		} else if ((A < 0 & B >= 0 & C >= 0) | (A >= 0 & B < 0 & C >= 0) | (A >= 0 & B >= 0 & C < 0)) {
			System.out.println("Одно отрицательное число");
		} else if ((A < 0 & B < 0 & C >= 0) | (A >= 0 & B < 0 & C < 0) | (A < 0 & B >= 0 & C < 0)) {
			System.out.println("Два отрицательных числа");
		} else {
			System.out.println("Отрицательные числа отсутствуют");
		}
	}

}
