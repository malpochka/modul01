package by.epam.modul1.part1;

import java.util.Scanner;

//Составить программу перевода радианной меры угла в градусы, минуты и секунды.

public class Zadacha26 {

	public static void main(String[] args) {
		int a;
		int g;
		int m;
		int s;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите значение a в радианах");
		a = sc.nextInt();

		g = (int) Math.toDegrees(a);
		m = (int) (a * 3437.75);
		s = (int) (a * 206264.99);

		System.out.println("Результат перевода из радианов в градусы = " + g);
		System.out.println("Результат перевода из радианов в минуты =  " + m);
		System.out.println("Результат перевода из радианов в секунды = " + s);
	}

}
