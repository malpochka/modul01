package by.epam.modul1.part3;

import java.util.Scanner;

//Даны действительные (a) и натурально (n).Вычислить:a*(a+1)...(a+n-1)
public class Zadacha17 {

	public static void main(String[] args) {
		double a;
		double n;
		double pr;
		double x;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите значение действительного числа a");
		a = sc.nextDouble();
		System.out.println("Введите значение натурального числа n");
		n = sc.nextDouble();

		for (int i = 1; i <= (n - 1); i++) {
			x = a + i;
			pr = a * x;
			System.out.println(pr);
		}

	}

}
