package by.epam.modul1.part3;

//Составить программу нахождения разности кубов первых двухсот чисел.
public class Zadacha11 {

	public static void main(String[] args) {
		int i;
		int r;
		i = 1;
		r = 0;
		while (i <= 200) {
			r = (int) (Math.pow(i, 3) - r);
			System.out.println("Разность равна " + r);
			i++;
		}

	}

}
