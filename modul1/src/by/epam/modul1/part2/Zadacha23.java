package by.epam.modul1.part2;
/*Определить правильность даты введенной с клавиатуры(число - от 1 до 31 и 
 * месяц - от 1 до 12).Если введены некорректные данные, то сообщить об этом.*/

import java.util.Scanner;

public class Zadacha23 {

	public static void main(String[] args) {
		int x;
		int m;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число");
		x = sc.nextInt();
		System.out.println("Введите месяц");
		m = sc.nextInt();

		if (x >= 1 & x <= 31 & m >= 1 & m <= 12) {
			System.out.println(x + " Числа " + m + " Месяца");
		} else {
			System.out.println("Вы ввели неверные данные");
		}

	}

}
