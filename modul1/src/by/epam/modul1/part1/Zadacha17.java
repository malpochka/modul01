package by.epam.modul1.part1;
/*Дана сторона равностороннего треугольника.Найти площадь этого треугольника, его высоту, 
 * радиус вписанной и описанной окружности.*/

public class Zadacha17 {

	public static void main(String[] args) {
		double a;
		double S;
		double h;
		double r;
		double R;

		a = 12;

		S = Math.sqrt(3) / 4 * Math.pow(a, 2);
		h = a * Math.sqrt(3) / 2;
		r = a * Math.sqrt(3) / 6;
		R = a * Math.sqrt(3) / 3;

		System.out.println("Площадь треугольника = " + S);
		System.out.println("Высота треугольника =  " + h);
		System.out.println("Радиус вписанной окружности =  " + r);
		System.out.println("Радиус описанной окружности =  " + R);

	}

}
