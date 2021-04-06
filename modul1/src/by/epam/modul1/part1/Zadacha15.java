package by.epam.modul1.part1;
/*Даны два числа.Найти среднее арифметическое кубов этих чисел и среднее геометрическое
*модулей этих чисел.*/

public class Zadacha15 {

	public static void main(String[] args) {
		double a;
		double b;
		double aver;
		double geom;

		a = 25;
		b = 98;

		aver = Math.pow(a, 3) + Math.pow(b, 3) / 2;
		geom = Math.sqrt(Math.abs(a) + Math.abs(b));

		System.out.println("Среднее арифметическое чисел a и b =  " + aver);
		System.out.println("Среднее геометрическое модулей чисел a и b = " + geom);

	}

}
