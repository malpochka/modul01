package by.epam.modul1.part1;

import java.util.Scanner;

//Найти частное произведений четных и нечетных цифр четырехзначного числа.
public class Zadacha34 {

	public static void main(String[] args) {
		int N;
		int N1;
		int N2;
		int N3;
		int N4;
		int ch;
		int pr1;
		int pr2;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите четырехзначное число");
		N = sc.nextInt();

		N1 = N / 1000;
		N2 = N / 100 % 10;
		N3 = N % 100 / 10;
		N4 = N % 10;

		pr1 = N1 * N3;
		pr2 = N2 * N4;
		ch = pr2 / pr1;

		System.out.println("Частное равно  " + ch);

	}
}
