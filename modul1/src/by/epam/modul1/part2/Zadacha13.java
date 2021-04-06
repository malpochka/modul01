package by.epam.modul1.part2;

import java.util.Scanner;

/*Даны две точки А(x1,y1) и В(x2,y2).Составить алгоритм, определяющий, которая из 
 *точек находится ближе к началу координат.*/

public class Zadacha13 {

	public static void main(String[] args) {
		double x1;
		double A;
		double x2;
		double B;
		double y1;
		double y2;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите координаты точки А(x1)");
		x1 = sc.nextInt();
		System.out.println("Введите координаты точки А(y1)");
		y1 = sc.nextInt();
		System.out.println("Введите координаты точки B(x2)");
		x2 = sc.nextInt();
		System.out.println("Введите координаты точки B(y2)");
		y2 = sc.nextInt();

		A = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
		B = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));

		if (A > B) {
			System.out.println("Точка B ближе к началу координат");
		} else {
			System.out.println("Точка A ближе к началу координат");
		}

	}

}
