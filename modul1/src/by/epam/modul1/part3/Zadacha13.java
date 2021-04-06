package by.epam.modul1.part3;

//Составить таблицу значений функции y=5-x^2/2;на отрезке [-5;5] c шагом 0,5

public class Zadacha13 {

	public static void main(String[] args) {
		double x;
		double y;
		x = -5;
		System.out.println("  x " + " | " + "  y");
		while (x <= 5) {
			y = 5 - x * x / 2;
			System.out.println(x + " | " + y);
			x = x + 0.5;
		}

	}

}
