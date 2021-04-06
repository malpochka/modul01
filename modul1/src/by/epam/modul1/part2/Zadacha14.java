package by.epam.modul1.part2;

import java.util.Scanner;

/*Даны два угла треугольника в градусах.Опредилить, существует ли такой треугольник, 
 *и если да, то будет ли он прямоугольным.*/

public class Zadacha14 {

	public static void main(String[] args) {
		int x;
		int y;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите угол треугольника в градусах");
		x = sc.nextInt();
		System.out.println("Введите угол треугольника в градусах");
		y = sc.nextInt();

		if (x + y >= 180) {
			System.out.println("Такого треугольника не существует");
		} else if (x == 90 || y == 90 || x + y == 90) {
			System.out.println("Треугольник является прямоугольным");
		} else if (x + y <= 180 && x != 90 && y != 90 && x + y != 90) {
			System.out.println("Такой треугольник существует,но он не прямоугольный");
		} else {
			System.out.println("Такого треугольника не существует");
		}

	}

}
