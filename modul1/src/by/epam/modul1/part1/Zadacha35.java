package by.epam.modul1.part1;
/*Составить линейную программу печатающую true, если указанное высказывание
является истинным и false в противном случае.*/

import java.util.Scanner;

public class Zadacha35 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		/* 1)Целое число N является четным двузначным чилом. */

		int N;
		System.out.println("Введите двузначное число");
		N = sc.nextInt();

		if (N > 0 && N < 100 && N % 2 == 0) {
			System.out.println("true");
		} else {
			System.out.println("False");
		}
		/*
		 * 2)Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его
		 * последних цифр.
		 */

		int N1;
		int x1;
		int x2;
		int x3;
		int x4;
		System.out.println("Введите четырехзначное число");
		N1 = sc.nextInt();

		x1 = N1 / 1000;
		x2 = N1 / 100 % 10;
		x3 = N1 % 100 / 10;
		x4 = N1 % 10;

		if ((x1 + x2) == (x3 + x4)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		// 3)Сумма цифр данного трехзначного числа N является четным числом.
		int N2;
		int y1;
		int y2;
		int y3;
		int sum;

		System.out.println("Введите трехзначное число");
		N2 = sc.nextInt();

		y1 = N2 / 1000;
		y2 = N2 / 100 % 10;
		y3 = N2 % 100 / 10;

		sum = y1 + y2 + y3;
		if (sum % 2 == 0) {
			System.out.println("true");
		} else {
			System.out.println("False");
		}

		/*
		 * 4)Точка с координатами (x,y) принадлежит части плоскости лежащей между
		 * прямыми x = m, x = n (m < n).
		 */

		int X5;

		int m;
		int n;
		System.out.println("Введите прямую m, где m<n");
		m = sc.nextInt();
		System.out.println("Введите прямую n,где m<n");
		n = sc.nextInt();
		System.out.println("Введите координаты точки x");
		X5 = sc.nextInt();

		if (X5 >= m && X5 <= n) {
			System.out.println("true");
		} else {
			System.out.println("false");

		}
		/*
		 * 5)Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.
		 */

		int N3;
		int a1;
		int a2;
		int a3;
		int sum1;
		int kvd;

		System.out.println("Введите трехзначное число");
		N3 = sc.nextInt();
		a1 = N3 / 1000;
		a2 = N3 / 100 % 10;
		a3 = N3 % 100 / 10;
		kvd = (int) Math.pow(N3, 2);
		sum1 = (int) Math.pow((a1 + a2 + a3), 3);
		if (kvd == sum1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		// 6)Треугольник со сторонами a,b,c является равнобедренным.

		int a;
		int b;
		int c;

		System.out.println("Введите сторону a");
		a = sc.nextInt();
		System.out.println("Введите сторону b");
		b = sc.nextInt();
		System.out.println("Введите сторону c");
		c = sc.nextInt();

		if (a == b && b == c) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		/*
		 * 7)Сумма каких-либо двух цифр заданного трехзначного натурального числа N
		 * равна третьей цифре.
		 */

		int N4;
		int b1;
		int b2;
		int b3;
		System.out.println("Введите натуральное трехзначное число");
		N4 = sc.nextInt();

		b1 = N4 / 1000;
		b2 = N4 / 100 % 10;
		b3 = N4 % 100 / 10;

		if (b1 + b2 == b3 || b2 + b3 == b1 || b1 + b3 == b2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		/*
		 * 8)Заданное число N является степенью числа А(показатель степени может
		 * находиться в диапазоне от 0 до 4).
		 */

		int N5;
		int A;
		int pow;
		int B;

		System.out.println("Введите число N");
		N5 = sc.nextInt();
		System.out.println("Введите число A");
		A = sc.nextInt();
		System.out.println("Введите степень числа А,показательстепени от 0 до 4");
		B = sc.nextInt();

		pow = (int) Math.pow(A, B);
		if (pow == N5) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		/*
		 * 9)График функции (y = ax^2 + bx + c) проходит через точку с
		 * координатами(m,n).
		 */

		int m1;
		int n1;
		int a11;
		int b22;
		int c33;
		int y;
		System.out.println("Введите a");
		a11 = sc.nextInt();
		System.out.println("Введите b");
		b22 = sc.nextInt();
		System.out.println("Введите c");
		c33 = sc.nextInt();
		System.out.println("Введите координату точки m");
		m1 = sc.nextInt();
		System.out.println("Введите координату точки n");
		n1 = sc.nextInt();

		y = (int) (a11 * Math.pow(m1, 2) + b22 * m1 + c33);
		if (y == n1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}
}
