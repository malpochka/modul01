package by.epam.modul1.part3;

import java.util.Scanner;

//требуется определить факториал числа, которое ввел пользователь.
public class Zadacha25 {

	public static void main(String[] args) {
		int n;
		int i;
		long fact;
		fact = 1;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число");
		n = sc.nextInt();

		for (i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("Факториал заданного числа равен  " + fact);

	}

}
