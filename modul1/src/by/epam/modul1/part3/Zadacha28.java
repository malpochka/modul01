package by.epam.modul1.part3;

import java.util.Scanner;

/*Написать программу в которой вводятся два операнда X и Y и знак операции (+,-,/,*).Вычислить результат Z
 * в зависимости от знака.Предусмотреть реакции на возможный неверный знак операции, а также на ввод Y=0
 * при делении.Организовать возможность многократных вычислений без перезагрузки программы 
 * (т.е. построить цикл).В качестве символа прекращения вычислений принять "0".*/

public class Zadacha28 {

	public static void main(String[] args) {
		int x;
		int y;
		int z;
		char simv;

		while (true) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("Введите цифру");
			x = sc.nextInt();
			System.out.println("Введите цифру");
			y = sc.nextInt();
			System.out.println("Введите знак");
			simv = sc.next().charAt(0);

			if (simv == '0') {
				break;
			}
			if (simv == '+' | simv == '-' | simv == '*' | simv == '/') {
				switch (simv) {
				case '+':
					z = x + y;
					System.out.println("Результат равен " + z);
					break;
				case '-':
					z = x - y;
					System.out.println("Результат равен " + z);
					break;
				case '*':
					z = x * y;
					System.out.println("Результат равен " + z);
					break;
				case '/':
					if (y != 0) {
						z = x / y;
						System.out.println("Результат равен " + z);
					} else {
						System.out.println("Деление на ноль! ");
					}

				}
			} else {
				System.out.println("Вы ввели неверный знак");
			}
		}

	}

}
