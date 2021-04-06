package by.epam.modul1.part1;
//Дана длина ребра куба.Найти площадь грани, площадь полной поверхности и объем этого куба.

public class Zadacha16 {

	public static void main(String[] args) {
		int a;
		int S;
		int Sp;
		int V;

		a = 23;

		S = (int) Math.pow(a, 2);
		Sp = (int) (6 * Math.pow(a, 2));
		V = (int) Math.pow(a, 3);

		System.out.println("Площадь грани =  " + S);
		System.out.println("Площадь полной поверхности =" + Sp);
		System.out.println("Объем куба =  " + V);

	}

}
