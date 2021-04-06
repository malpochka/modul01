package by.epam.modul1.part1;
/*Дано действительное число R вида nnn.ddd(три цифровых разряда в дробной и целой части).
 * Поменять местами дробную и целую части числа и вывести полученное значение числа.*/

public class Zadacha19 {

	public static void main(String[] args) {
		double a;
		double b;

		a = 123.456;

		b = a * 1000 % 1000 + (int) a / 1000.0;
		System.out.println("Значение числа = " + b);

	}

}
