package by.epam.modul1.part2;

import java.util.Scanner;

/*Даны три точки A(x1,y1),B(x2,y2),C(x3,y3).Определить будут ли они расположены
 *  на одной прямой.*/

public class Zadacha29 {

	public static void main(String[] args) {
		int x1;
		int x2;
		int x3;
		int y1;
		int y2;
		int y3;
		int s;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите x1 точки А");
		x1 = sc.nextInt();
		System.out.println("Введите y1 точки A");
		y1 = sc.nextInt();
		System.out.println("Введите x2 точки B");
		x2 = sc.nextInt();
		System.out.println("Введите y2 точки B");
		y2 = sc.nextInt();
		System.out.println("Введите x3 точки C");
		x3 = sc.nextInt();
		System.out.println("Введите y3 точки C");
		y3 = sc.nextInt();

		s = ((x1 * y2 + x2 * y3 + x3 * y1) - (x2 * y1 + x3 * y2 + x1 * y3)) / 2;
		if (s == 0) {
			System.out.println("Точки лежат на одной прямой");
		} else {
			System.out.println("Точки не лежат на одной прямой");
		}

	}

}
