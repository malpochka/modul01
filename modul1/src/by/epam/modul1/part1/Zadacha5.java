package by.epam.modul1.part1;

import java.util.Scanner;
//Дан прямоугольник, ширина которого в 2 раза меньше длины.Найти площадь треугольника.

public class Zadacha5 {

	public static void main(String[] args) {
		int a;
		int b;
		int s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите длину прямоугольника:");
		a = sc.nextInt();
		b = a / 2;
		s = a * b;
		System.out.println("Площадь прямоугольника = " + s);
		sc.close();

	}
}
