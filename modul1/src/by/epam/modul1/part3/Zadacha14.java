package by.epam.modul1.part3;

import java.util.Scanner;

//Дано натуральное число n.Вычислить 1+1/2+1/3+1/4...1/n
public class Zadacha14 {

	public static void main(String[] args) {
		double n;
		double i;
		double x;
		i = 1;
		x = 1;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число  n");
		n = sc.nextInt();

		for (i = 2; i <= n; i++) {

			x = x + 1 / i;
			System.out.println(x);

		}
	}

}
