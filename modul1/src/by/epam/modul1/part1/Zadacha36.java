package by.epam.modul1.part1;

import java.util.Scanner;

/*Для данных областей составить линейную программу, которая печатает true, если
* точка с координатами (x,y) принадлежит закрашенной области , и false в
* противном случае.*/

public class Zadacha36 {

	public static void main(String[] args) {
		double x;
		double y;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите координаты точки x");
		x = sc.nextDouble();
		System.out.println("Введите координаты точки  y");
		y = sc.nextDouble();

		if (y + x <= 2 && y >= 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		if ((y >= 0 && y <= 2 && x >= -1 && x <= 1) || (y <= 0 && y >= 1.5 && x >= -2 && x <= 2)) {
			System.out.println("true");
		} else {
			System.out.println("False");
		}

		if ((x * x + y * y <= 4 && x >= 0 && y >= 0) || (x * x + y * y <= 6.25 && x >= 0 && y <= 0)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
