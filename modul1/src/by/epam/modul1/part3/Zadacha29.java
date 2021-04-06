package by.epam.modul1.part3;

import java.util.Scanner;

//Даны два числа.Определить цифры входящие в запись как первого так и второго числа.

public class Zadacha29 {

	public static void main(String[] args) {
		long n;
		long m;
		long l;
		long x;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число");
		n = sc.nextInt();
		System.out.println("Введите второе число");
		m = sc.nextInt();

		while (n > 0) {
			x = n % 10;
			n = n / 10;
			l = m;
			while (l > 0) {
				if (l % 10 == x) {
					System.out.print(x + " ");
				}
				l = l / 10;
			}
		}

	}

}
