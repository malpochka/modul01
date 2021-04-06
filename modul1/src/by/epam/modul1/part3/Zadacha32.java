package by.epam.modul1.part3;

import java.util.Scanner;

/*Проверить введенную пользователем строку на наличие недопустимых символов. В качестве первого символа допустимы только буквы
 * и знак подчеркивания.Остальные символы могут быть буквами, цифрами и знаком подчеркивания.*/

public class Zadacha32 {

	public static void main(String[] args) {

		int i;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите строку");
		String word = sc.nextLine();

		char[] chArray = word.toCharArray();
		for (i = 0; i < chArray.length; i++) {
			while (i == 0) {

				if ((chArray[i] <= 'Я' & chArray[i] >= 'A') | (chArray[i] <= 'я' & chArray[i] >= 'а')
						| (chArray[i] <= 'z' & chArray[i] >= 'a') | (chArray[i] <= 'Z' & chArray[i] >= 'A')
						| (chArray[i] == '_')) {
					System.out.println("Верно");
					break;
				} else {
					System.out.println("Вы ввели недопустимый символ");
					break;
				}
			}
			while (i > 0) {
				if ((chArray[i] <= 'Я' & chArray[i] >= 'A') | (chArray[i] <= 'я' & chArray[i] >= 'а')
						| (chArray[i] <= 'z' & chArray[i] >= 'a') | (chArray[i] <= 'Z' & chArray[i] >= 'A')
						| (chArray[i] == '_') | (chArray[i] >= '0' & chArray[i] <= '9')) {
					System.out.println("Верно");
					break;
				} else {
					System.out.println("Вы ввели недопустимый символ");
					break;
				}
			}
		}
	}

}
