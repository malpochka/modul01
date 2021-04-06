package by.epam.modul1.part3;

/*С помощью оператора while напишите программу определения суммы всех нечетных чисел
 * в диапазоне от 1 до 99 включительно.*/

public class Zadacha5 {

	public static void main(String[] args) {
		int i;
		int sum;
		i = 1;
		sum = 0;

		while (i <= 99) {
			sum = sum + i;
			i = i + 2;
			System.out.println(sum);
		}

	}

}v
