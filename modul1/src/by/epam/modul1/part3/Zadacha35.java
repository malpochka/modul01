package by.epam.modul1.part3;

import java.util.Scanner;

//Найти количество четных цифр данного натурального числа.
public class Zadacha35 {

	public static void main(String[] args) {
		int n;
		int i;

		i = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите натуральное число");
		n = sc.nextInt();

		while (n > 0) {

			if (n % 2 == 0) {
				i++;

			} else {
				System.out.print("");
			}
			n = n / 10;

		}
		System.out.println("Количество четных чисел в заданном числе равно " + i);
	}

}
