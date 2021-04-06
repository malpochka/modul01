package by.epam.modul1.part2;

import java.util.Scanner;

/*На плоскости ХОУ задана своими координатами точка А. Указать где она
*  расположена(на какой оси или в каком координатном угле)*/

public class Zadacha16 {

	public static void main(String[] args) {
		int x;
		int y;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите координаты точки А-x");
		x = sc.nextInt();
		System.out.println("Введите координаты точки А-y");
		y = sc.nextInt();

		if (x == 0 & y == 0) {
			System.out.println("Точка A лежит в начале координат");
		} else if (x == 0 & (y < 0 | y > 0)) {
			System.out.println("Точка A лежит на оси Y");
		} else if (y == 0 & (x < 0 | x > 0)) {
			System.out.println("Точка A лежит на оси X");
		} else if (x > 0 & y > 0) {
			System.out.println("Точка A лежит в первой четверти");
		} else if (x < 0 & y > 0) {
			System.out.println("Точка A лежит во второй четверти");
		} else if (x < 0 & y < 0) {
			System.out.println("Точка A лежит в третье четверти");
		} else {
			System.out.println("Точка A лежит в четвертой четверти");
		}
	}

}
