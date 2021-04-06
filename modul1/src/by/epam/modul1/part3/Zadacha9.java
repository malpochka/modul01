package by.epam.modul1.part3;

//Найти сумму квадратов первых ста чисел.

public class Zadacha9 {

	public static void main(String[] args) {
		int sum;
		int i;
		i = 1;
		sum = 0;

		while (i <= 100) {
			sum = (int) (sum + Math.pow(i, 2));
			System.out.println("Сумма кватратов равна " + sum);
			i++;
		}

	}

}
