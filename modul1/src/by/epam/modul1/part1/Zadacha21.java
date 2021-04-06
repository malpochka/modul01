package by.epam.modul1.part1;

import java.util.Scanner;
/*Найти площадь кольца, внутренний радиус которого r, а внешний R (R>r). */

public class Zadacha21 {

	public static void main(String[] args) {
		double r;
		double R;
		double S;
		double p;

		p = 3.14;

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите внутренний радиус r,где R>r");
		r = sc.nextDouble();
		System.out.println("Введите внешний радиус R,где R>r");
		R = sc.nextDouble();
		sc.close();
		if (R > r) {
			S = p * (Math.pow(R, 2) - Math.pow(r, 2));
			System.out.println("Площадь равна  " + S);
		} else {
			System.out.println("Вы ввели недопустимые данные");
		}

	}

}
