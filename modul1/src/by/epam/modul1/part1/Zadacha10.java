package by.epam.modul1.part1;

//Вычислить расстояние м/у двумя точками, с данными координатами (x1,y1) и (x2,y2).
public class Zadacha10 {

	public static void main(String[] args) {
		double x1;
		double x2;
		double y1;
		double y2;
		double d;

		x1 = -5;
		x2 = 15;
		y1 = -4;
		y2 = 13;

		d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

		System.out.println(Math.abs(d));
	}

}
