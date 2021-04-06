package by.epam.modul1.part1;

//Вычислить значение выражения по формуле (a/c)*(b/d)-(a*b-c)/(c*d).
public class Zadacha7 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double d;
		double q;

		a = 2;
		b = 3;
		c = 4;
		d = 6;

		q = (a / c) * (b / d) - (a * b - c) / (c * d);
		System.out.println(q);

	}
}
