package by.epam.modul1.part2;

import java.util.Scanner;

/*Заданы размеры A,B прямоугольного отверстия и размеры x,y,z кирпича. Определить, пройдет 
 * ли кирпич через отверстие*/

public class Zadacha31 {

	public static void main(String[] args) {
		int A;
		int B;
		int x;
		int y;
		int z;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите размеры отверстия А");
		A = sc.nextInt();
		System.out.println("Введите размеры отверстия B");
		B = sc.nextInt();
		System.out.println("Введите размеры кирпича х");
		x = sc.nextInt();
		System.out.println("Введите размеры кирпича y");
		y = sc.nextInt();
		System.out.println("Введите размеры кирпича z");
		z = sc.nextInt();

		if ((x < A & y < B) | (y < A & x < B) | (z < A & y < B) | (z < B & y < A) | (z < A & x < B) | (z < B & x < A)) {
			System.out.println("Кирпич пройдет через отверстие");
		} else {
			System.out.println("Кирпич не пройдет через отверстие");
		}

	}

}
