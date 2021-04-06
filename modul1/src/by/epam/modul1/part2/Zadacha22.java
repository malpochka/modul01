package by.epam.modul1.part2;

import java.util.Scanner;

/*Перераспределить значение переменных x и y так, чтобы в x оказалось большее из 
 *этих значений, а в у - меньшее*/

public class Zadacha22 {

	public static void main(String[] args) {
		int x;
		int y;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите значение x");
		x = sc.nextInt();
		System.out.println("Введите значение y");
		y = sc.nextInt();

		if (x < y) {
			System.out.println("X равно " + y + " Y равно " + x);
		} else {
			System.out.println("X равно " + x + " Y равно " + y);
		}

	}

}
