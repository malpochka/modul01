package by.epam.modul1.part3;

import java.util.Scanner;

/*Для заданного натурального числа определить, образуют ли его цифры арифметическую прогресию.Предполагается,
 * что в числе не мение 3 цифр. Например:1357,963. */

public class Zadacha38 {

	public static void main(String[] args) {
		int n;
		int An;
		int An1;
		int d;
		int b;
		boolean numb;

		numb = true;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число.Число должно содержать не менее 3 цифр");
		n = sc.nextInt();

		An = n % 10;
		An1 = n % 100 / 10;
		d = An - An1;

		while (numb) {
			while (n > 0) {
				An = n % 10;
				An1 = n % 100 / 10;
				b = An - An1;
				n = n / 10;

				if (d != b & An1 > 0) {
					numb = false;
				}
			}
			if (numb) {
				System.out.println("Да");
				break;
			} else {
				System.out.println("Нет");
			}
		}
	}

}
