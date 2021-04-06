package by.epam.modul1.part1;

import java.util.Scanner;

/*Ввести любой символ и опредилить его порядковый номер, а также указать
 * предидущий и последующий символы*/

public class Zadacha31 {

	public static void main(String[] args) {
		char a;
		char b;
		char c;
		int x;
		int y;
		int z;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите символ");
		a = sc.next().charAt(0);

		x = (int) a;
		y = (int) a + 1;
		z = (int) a - 1;
		b = (char) y;
		c = (char) z;

		System.out.println("Порядковый номер:  " + x);
		System.out.println("Предидущий символ:  " + c);
		System.out.println("Последующий: " + b);
	}

}
