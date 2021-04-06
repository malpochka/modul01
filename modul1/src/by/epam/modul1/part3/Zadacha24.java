package by.epam.modul1.part3;

import java.util.Scanner;

/*Вводится натуральное число. Найти сумму четных цифр, входящих в его состав. Преобразовать его 
 * в другое число, цифры которого будут следовать в обратном порядке по сравнению с введенным числом.*/

public class Zadacha24 {

	public static void main(String[] args) {
		int n;
		int m;

		int sum;
		sum = 0;
		m = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число n");
		n = sc.nextInt();

		while (n != 0) {

			if (n % 10 % 2 == 0) {
				sum = sum + n % 10;
			}
			m = m * 10 + n % 10;
			n = n / 10;
		}
		System.out.println("Сумма четных цифр равна " + sum);
		System.out.println("Обратное число равно " + m);
	}

}
