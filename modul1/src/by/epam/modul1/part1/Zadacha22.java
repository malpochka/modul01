package by.epam.modul1.part1;

/*Найти площадь равнобедренной трапеции с основаниями a и b и углом A при большем 
основании a.*/
public class Zadacha22 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double A;
		double S;

		a = 32;
		b = 25;
		A = 45;

		c = (a - b) / (2 * Math.cos(Math.toRadians(A)));
		S = (b + c * Math.cos((Math.toRadians(A)))) * c * Math.sin((Math.toRadians(A)));
		System.out.println("Площадь равнобедренной трапеции = " + S);
	}

}
