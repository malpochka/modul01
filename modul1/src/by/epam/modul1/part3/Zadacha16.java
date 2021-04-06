package by.epam.modul1.part3;

//Вычислить:(1+2)*(1+2+3)*(...)*(1+2+..10)
public class Zadacha16 {

	public static void main(String[] args) {
		long x;
		long i;
		long pr;
		x = 1;
		pr = 1;

		for (i = 0; i < 10; i++) {
			x = x + 2 + i;
			pr = pr * x;
			System.out.println(pr);
		}

	}

}
