package by.epam.modul1.part3;

/*Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера
 * (Таблица ASCII).*/


public class Zadacha26 {

	public static void main(String[] args) {
		int num = 1;
		char ascii = 1;
		int i = 1;

		System.out.println("number " + " | " + " ascii ");
		System.out.println("-----------------");

		while (i <= 256) {
			System.out.println(num + "       |      " + ascii);
			System.out.println("-----------------------");
			i++;
			num++;
			ascii++;

		}

	}

}