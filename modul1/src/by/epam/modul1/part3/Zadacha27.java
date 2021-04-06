package by.epam.modul1.part3;

import java.util.Scanner;

/*Для каждого натурального числа в промежутке от m до n вывести все делители,
 * кроме единицы и самого числа. m и n вводятся с клавиатуры.
 */

public class Zadacha27 {

	public static void main(String[] args) {
		int m;
		int n;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число m");
		m = sc.nextInt();
		System.out.println("Введите число n");
		n = sc.nextInt();

		while (m <= n) {
			System.out.println(" ");
			System.out.print(m + ": ");

			for (int i = 2; i < m; i++) {
				if (m % i == 0) {
					System.out.print(i + ";  ");

				}
			}
			m = m + 1;
		}

	}

}
