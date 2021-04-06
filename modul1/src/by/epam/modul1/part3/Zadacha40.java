package by.epam.modul1.part3;

import java.util.Scanner;

//Получить все числа не превышающие заданного числа N, которые делятся без остатка на все свои цифры.
public class Zadacha40 {

	public static void main(String[] args) {
		int n;
		int i;
		int m;
		int x;
		boolean button;

		button = true;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число");
		n = sc.nextInt();

		for (i = 1; i <= n; i++) {
			x = i;
			while (x > 0) {
				m = x % 10;
				x = x / 10;
				if (m == 0) {
					button = false;
					break;
				}
				if (i % m == 0) {
					button = true;
				} else {
					button = false;
					break;
				}
			}
			if (button == true) {
				System.out.println(i);

			}
		}
	}

}
