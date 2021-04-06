package by.epam.modul1.part2;
/*Программа-льстец. На экране высвечивается вопрос "Кто ты: мальчик или девочка?
 * Введи М или Д".В зависимости от ответа на экране должен появиться текст "Мне нравятся
 * мальчики" или "Мне нравятся девочки".*/

import java.util.Scanner;

public class Zadacha21 {

	public static void main(String[] args) {
		String m;
		String d;
		String otv;

		m = "М";
		d = "Д";

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Кто ты: мальчик или девочка?");
		otv = sc.nextLine();

		if (otv.equals(m)) {
			System.out.println("Мне нравятся мальчики");
		} else if (otv.equals(d)) {
			System.out.println("Мне нравятся девочки");
		} else {
			System.out.println("Не правильно ввели данные");
		}
	}

}
