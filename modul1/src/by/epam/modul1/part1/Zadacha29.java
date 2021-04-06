package by.epam.modul1.part1;

import java.util.Scanner;

/*Cоставить программу для вычисления пути, пройденного лодкой, если ее скорость
 *  в стоячей воде v км в час, скорость течения реки vr км в час, время движения по озеру
 *t1 часов, а против течния реки t2  часов.*/

public class Zadacha29 {

	public static void main(String[] args) {
		double v;
		double vr;
		double t1;
		double t2;
		double S;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите скорость лодки в стоячей воде км/ч v");
		v = sc.nextDouble();
		System.out.println("Введите скорость течения реки км/ч  vr");
		vr = sc.nextDouble();
		System.out.println("Введите время движения по озеру часов t1");
		t1 = sc.nextDouble();
		System.out.println("Введите время движения по озеру против течения часов t2");
		t2 = sc.nextDouble();

		S = t1 * v + t2 * (v - vr);
		System.out.println("Путь пройденный лодкой равен " + S + " км");

	}

}
