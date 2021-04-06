package by.epam.modul1.part2;

import java.util.Scanner;

/*Написать программу, которая по паролю будет определять уровень доступа сотрудника к секретной информации
 * в базе данных. Доступ к базе данных имеют шесть человек,разбитых на три группы по степени доступа
 * Они имеют следующие пароли:9583,1747-доступны модули баз A,B,C;3331,7922-доступны модули баз B,C;
 * 9455,8997-доступен модуль базы C.*/

public class Zadacha33 {

	public static void main(String[] args) {
		int password;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите пароль");
		password = sc.nextInt();

		if (password == 9583 || password == 1747) {
			System.out.println("Доступны модули баз A,B,C");
		} else if (password == 3331 || password == 7922) {
			System.out.println("Доступны модули баз B,C");
		} else if (password == 9455 || password == 8997) {
			System.out.println("Доступен модуль базы C");
		} else {
			System.out.println("Вы ввели неверный пароль");
		}

	}

}
