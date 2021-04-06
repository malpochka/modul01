package by.epam.modul1.part2;

import java.util.Scanner;

//Составить программу которая определит площадь какого круга меньше.
public class Zadacha10 {

	public static void main(String[] args) {
		double S1;
		double S2;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите площадь первого круга S1");
		S1 = sc.nextDouble();
		System.out.println("Введите площадь второго круга S2");
		S2 = sc.nextDouble();

		if (S1 < S2) {
			System.out.println("Площадь первого круга меньше");
		} else if (S2 < S1) {
			System.out.println("Площадь второго круга меньше");
		} else {
			System.out.println("Плащади равны");

		}

	}

}
