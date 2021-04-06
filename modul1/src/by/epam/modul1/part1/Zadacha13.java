package by.epam.modul1.part1;

//Написать программу,которая выводит на экран первые 4 степени числа Пи
public class Zadacha13 {

	public static void main(String[] args) {
		double p;
		double c;
		int x;

		p = 3.14;
		x = 1;
		while (x < 5) {
			c = Math.pow(p, x);
			System.out.println(x + " степень пи =  " + c);
			x = x + 1;
		}
	}
}
