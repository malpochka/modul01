package by.epam.modul1.part2;

import java.util.Scanner;

//Определить, делителем каких чисел a,b,c является число k.
public class Zadacha20 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int k;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число а");
		a = sc.nextInt();
		System.out.println("Введите число b");
		b = sc.nextInt();
		System.out.println("Введите число c");
		c = sc.nextInt();
		System.out.println("Введите число k");
		k = sc.nextInt();

		if (a % k == 0) {
			System.out.println("Число k является делителем числа a");
		} else if (b % k == 0) {
			System.out.println("Число k является делителем числа b");
		} else if (c % k == 0) {
			System.out.println("Число k является делителем числа c");
		} else {
			System.out.println("Число k не является делителем для чисел abc");
		}

	}

}
