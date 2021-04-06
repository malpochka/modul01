package by.epam.modul1.part3;

import java.util.Scanner;

//Найдите наибольшую цифру данного натурального числа.
public class Zadacha33 {

	public static void main(String[] args) {
		int n;
		int m;
		int max;

		max = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите натуральное число");
		n = sc.nextInt();

		while (n > 0) {
			m = n % 10;
			n = n / 10;
			if ((n % 10 > m) & (n % 10 > max)) {
				max = n % 10;

			} else if ((m > n % 10) & (m > max)) {
				max = m;
			}

		}
		System.out.println(max);
	}
}
