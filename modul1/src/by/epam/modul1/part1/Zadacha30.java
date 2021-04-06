package by.epam.modul1.part1;

import java.util.Scanner;

/*Текущее показание электронных часов: m часов (0<=m<=23) n мин(0<=n<=59), 
*k ceк(0<=k<=59). Какое время будут показывать часы через p часов, q мин, r cекунд?*/

public class Zadacha30 {

	public static void main(String[] args) {
		int m;
		int n;
		int k;
		int p;
		int q;
		int r;
		int x;
		int y;
		int z;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите часы выполняя условие: 0<=m<=23");
		m = sc.nextInt();
		System.out.println("Введите минуты выполняя условие: 0<=n<=59");
		n = sc.nextInt();
		System.out.println("Введите секунды выполняя условие: 0<=k<=59");
		k = sc.nextInt();
		System.out.println("Введите часы");
		p = sc.nextInt();
		System.out.println("Введите минуты");
		q = sc.nextInt();
		System.out.println("Введите секунды");
		r = sc.nextInt();

		z = (k + r) % 60;
		y = ((n + q) + ((k + r) / 60)) % 60;
		x = ((m + p) + ((n + q) / 60) + ((k + r) / 60)) % 24;
		System.out.println("Время,которое показывают часы равно" + x + ":" + y + ":" + z);

	}

}
