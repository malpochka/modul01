package by.epam.modul1.part2;

import java.util.Scanner;

//Составить программу нахождения модуля выражения a * x * x + b * x + c.
public class Zadacha7 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int x1;
		int x2;
		int D;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число а");
		a = sc.nextInt();
		System.out.println("Введите число b");
		b = sc.nextInt();
		System.out.println("Введите число c");
		c = sc.nextInt();

		D = b * b - 4 * a * c;
		if (D > 0) {
			x1 = (int) (-b + Math.sqrt(D)) / (2 * a);
			x2 = (int) (-b - Math.sqrt(D)) / (2 * a);
			System.out.println("Выражение имеет два корня " + Math.abs(x1) + "; " + Math.abs(x2) + ";");
		} else if (D == 0) {
			x1 = -b / (2 * a);
			System.out.println("Выражение имеет один корень " + Math.abs(x1) + ";");
		} else {
			System.out.println("Выражение не имеет корней");
		}
	}

}
