package by.epam.modul1.part1;
//Известна длина окружности.Найти площадь круга, ограниченного этой окружностью.

public class Zadacha18 {

	public static void main(String[] args) {
		double l;
		double S;
		double r;
		double p;

		p = 3.14;
		l = 15.5;

		r = l / 2 * p;
		S = p * Math.pow(r, 2);

		System.out.println("Площадь круга = " + S);

	}

}
