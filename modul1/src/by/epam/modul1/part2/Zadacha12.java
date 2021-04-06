package by.epam.modul1.part2;

import java.util.Scanner;

/*Даны три действительных числа.Возвести в квадрат те из них, значение которых 
 *неотрицательны, и в четвертую степень - отрицательные.*/

public class Zadacha12 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double a1;
		double b1;
		double c1;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите первое действительное число");
		a = sc.nextInt();
		System.out.println("Введите второе действительное число");
		b = sc.nextInt();
		System.out.println("Введите третье действительное число");
		c = sc.nextInt();

		if (a > 0) {
			a1 = Math.pow(a, 2);
			System.out.println("Первое неотрицательное число к квадрате равно " + a1);
		} else {
			a1 = Math.pow(a, 4);
			System.out.println("Первое отрицательное число в 4 степени равно " + a1);
		}
		if (b > 0) {
			b1 = Math.pow(b, 2);
			System.out.println("Второе неотрицательное число к квадрате равно " + b1);
		} else {
			b1 = Math.pow(b, 4);
			System.out.println("Второе отрицательное число в 4 степени равно " + b1);
		}
		if (c > 0) {
			c1 = Math.pow(c, 2);
			System.out.println("Третье неотрицательное число к квадрате равно " + c1);
		} else {
			c1 = Math.pow(c, 4);
			System.out.println("Третье отрицательное число в 4 степени равно " + c1);
		}

	}

}
