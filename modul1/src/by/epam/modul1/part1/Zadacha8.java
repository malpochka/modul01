package by.epam.modul1.part1;

//Вычислить значение выражения по формуле (sinx+cosy)/(cosx-siny)*tgxy.
public class Zadacha8 {

	public static void main(String[] args) {
		double x;
		double y;
		double q;
		double v;
		double comp;

		x = 2;
		y = 4;

		q = Math.sin(x) + Math.cos(y);
		comp = x * y;
		v = q / (Math.cos(x) - Math.sin(y)) * Math.tan(comp);
		System.out.println(v);

	}
}
