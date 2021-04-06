package by.epam.modul1.part1;

//Вычислить значение выражения по формуле (a/c)*(b/d)-(a*b-c)/(c*d).

public class Zadacha6 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double x;
		double y;
		double z;
		double q;

		a = 2;
		b = 3;
		c = 4;

		x = b + Math.sqrt(Math.pow(b, 2) + 4 * a * c);
		y = 2 * a;
		z = Math.pow(a, 3) * c;
		q = x / y - z + Math.pow(b, -2);

		System.out.println("q =" + q);

	}

}
