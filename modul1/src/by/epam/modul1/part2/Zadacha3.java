package by.epam.modul1.part2;

import java.util.Scanner;

/*Cоставить программу сравнения введенного числа А и цифры 3. Вывести на экран слово -
 * "yes", если число A меньше 3;если число А больше, то вывести - слово "no".*/

public class Zadacha3 {

	public static void main(String[] args) {
		int A;
		int b;
		b = 3;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число А");
		A = sc.nextInt();

		if (A < b) {
			System.out.println("yes");
		} else {
			System.out.println("no");

		}
	}
}
