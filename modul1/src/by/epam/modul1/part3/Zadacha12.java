package by.epam.modul1.part3;

/*Последовательность An строится так:A1 = 1; An = 6 + A(n - 1), для каждого n > 1.
 *Cоставьте программу нахождения произведения первых десяти членов этой последовательности.*/

public class Zadacha12 {

	public static void main(String[] args) {
		long An;
		long i;
		long pr;

		pr = 1;

		for (i = 1; i <= 10; i++) {
			if (i == 1) {
				An = 1;
				pr = pr * An;
				System.out.println("Произведение равно " + pr);
			} else {
				An = i - 1;
				An = 6 + An;
				pr = pr * An;
				System.out.println("Произведение равно " + pr);
			}

		}

	}

}
