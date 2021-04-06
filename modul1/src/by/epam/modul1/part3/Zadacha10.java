package by.epam.modul1.part3;

//Составить программу нахождения произведения квадратов первых двухсот чисел.
public class Zadacha10 {

	public static void main(String[] args) {
		double pr;
		double i;
		i = 1;
		pr = 1;
		while (i <= 200) {
			pr = pr * Math.pow(i, 2);
			System.out.println("Произведение квадратов равна " + pr);
			i++;
		}

	}

}
