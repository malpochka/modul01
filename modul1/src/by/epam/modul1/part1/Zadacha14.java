package by.epam.modul1.part1;

import java.util.Scanner;

//Найти произведение цифр заданного четырехзначного числа
public class Zadacha14 {

	public static void main(String[] args) {
		numer1();
	}

	public static int numer1() {
		int numb;
		int a;
		int b;
		int c;
		int d;
		int z;

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число от 1000 до 9999 :  ");
		numb = sc.nextInt();
		if (numb >= 1000 && numb <= 9999) {
			a = numb % 10;
			b = numb % 100 / 10;
			c = numb % 1000 / 100;
			d = numb / 1000;
			z = a * b * c * d;
			System.out.println("Произведение цифр заданного числа = " + z);
			sc.close();
			System.exit(0);
		} else {
			System.out.println("Вы ввели число неверного формата,попробуйте еще раз");
		}
		return numer1();
	}
}
