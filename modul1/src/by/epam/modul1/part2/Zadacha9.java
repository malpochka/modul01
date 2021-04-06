package by.epam.modul1.part2;

import java.util.Scanner;

/*Составить программу, которая по трем введенным сторонам определит, является ли 
*данный треугольник равносторонним*/

public class Zadacha9 {

	public static void main(String[] args) {
		int A;
		int B;
		int C;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите сторону А");
		A = sc.nextInt();
		System.out.println("Введите сторону B");
		B = sc.nextInt();
		System.out.println("Введите сторону C");
		C = sc.nextInt();

		if (A == B && B == C && A == C) {
			System.out.println("Треугольник равносторонний");
		} else {
			System.out.println("У треугольника стороны не равны");
		}
	}

}
