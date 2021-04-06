package by.epam.modul1.part2;

import java.util.Scanner;

//Подсчитать количество положительных среди чисел ABC.
public class Zadacha19 {

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

		if (A > 0 & B > 0 & C > 0) {
			System.out.println("Три положительных числа");
		} else if ((A < 0 & B >= 0 & C >= 0) | (A >= 0 & B < 0 & C >= 0) | (A >= 0 & B >= 0 & C < 0)) {
			System.out.println("Два положительных числа");
		} else if ((A < 0 & B < 0 & C >= 0) | (A >= 0 & B < 0 & C < 0) | (A < 0 & B >= 0 & C < 0)) {
			System.out.println("Одно положительное число");
		} else {
			System.out.println("Положительные числа  отсутствуют");

		}
	}

}
