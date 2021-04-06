package by.epam.modul1.part2;

import java.util.Scanner;

//Составить программу которая определит, площадь какого треугольника больше.
public class Zadacha11 {

	public static void main(String[] args) {
		double S;
		double S1;
		double S2;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите площадь первого треугольника");
		S = sc.nextDouble();
		System.out.println("Введите площадь второго треугольника");
		S1 = sc.nextDouble();
		System.out.println("Введите площадь третьего треугольника");
		S2 = sc.nextDouble();

		if (S > S1 && S > S2) {
			System.out.println("Площадь первого треугольника больше");
		} else if (S1 > S && S1 > S2) {
			System.out.println("Площадь второго треугольника больше");
		} else {
			System.out.println("Площадь третьего треугольника больше");
		}

	}

}
