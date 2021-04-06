package by.epam.modul1.part1;

//Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов.
public class Zadacha9 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double s;
		double p;

		a = 4;
		b = 6;

		s = a * b / 2;
		System.out.println("Площадь прямоугольного треугольник =" + s);
		c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		p = a + b + c;
		System.out.println("Периметр прямоугольного треугольника =" + p);

	}
}
