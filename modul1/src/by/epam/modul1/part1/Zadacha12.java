package by.epam.modul1.part1;

//Вычислить длину окружности и площадь круга одного и тогоже заданного радиуса R.
public class Zadacha12 {

	public static void main(String[] args) {
		double R;
		double S;
		double L;
		double p;

		R = 25.5;
		p = 3.14;

		S = p * Math.pow(R, 2);
		L = 2 * p * R;
		System.out.println("Площадь круга =  " + S);
		System.out.println("Длина окружности = " + L);

	}
}
