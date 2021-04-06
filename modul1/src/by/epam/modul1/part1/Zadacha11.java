package by.epam.modul1.part1;

/*Заданы координаты трех вершин треугольника (x1,y1),(x2,y2),(x3,y3).Найти его периметр
*и площадь.*/
public class Zadacha11 {

	public static void main(String[] args) {
		double x1;
		double x2;
		double x3;
		double y1;
		double y2;
		double y3;
		double s;
		double p;
		double ab;
		double ac;
		double bc;

		x1 = -4;
		y1 = -3;
		x2 = 5;
		y2 = 3;
		x3 = -2;
		y3 = -2;

		ab = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		ac = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
		bc = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));

		p = (ab + ac + bc) / 2;
		s = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
		System.out.println("Периметр треугольника = " + p);
		System.out.println("Площадь треугольника =  " + s);

	}
}
