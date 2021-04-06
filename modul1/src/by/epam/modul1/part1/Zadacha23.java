package by.epam.modul1.part1;

import java.util.Scanner;
/*Вычислить корни квадратного уравнения ax(2) + bx + c = 0; c заданными коэффициентами
a,b,c.Предполагается , что a не равно 0 и, что дискриминант уравнения неотрицателен.*/

public class Zadacha23 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int D;
		int x1;
		int x2;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число  a");
		a = sc.nextInt();
		System.out.println("Введите число b");
		b = sc.nextInt();
		System.out.println("Введите число c");
		c = sc.nextInt();

		D = (int) Math.pow(b, 2) - 4 * a * c;

		if (D > 0) {
			x1 = (int) (-b + Math.sqrt(D)) / 2 * a;
			x2 = (int) (-b - Math.sqrt(D)) / 2 * a;
			System.out.println("Корни квадратного уравнения равны  " + x1 + ";" + x2);
		} else if (D == 0) {
			x1 = (int) (-b) / 2 * a;
			System.out.println("Корень квадратного уравнения равен " + x1);
		} else {
			System.out.println("У данного уравнения корней нет. ");

		}

	}

}
