package by.epam.modul1.part2;

import java.util.Scanner;

/* Cоставить программу, реализующую эпизод применения компьютера в книжном магазине.Компьютер, 
 * запрашивает стоимость книг, сумму денег, внесенную покупателем: если сдачи не требуется,печатает
 * на экране "спасибо"; если денег внесено больше, чем необходимо, печатает "возмите сдачу"
 * и указывает сумму сдачи;если денег не достаточно, то печатает сообщение об этом и указывает
 * размер недостоющей суммы*/

public class Zadacha34 {

	public static void main(String[] args) {
		int cost;
		int costbook;
		int cash;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите стоимость книги");
		cost = sc.nextInt();
		System.out.println("Введите сумму внесенных денег");
		costbook = sc.nextInt();

		if (cost == costbook) {
			System.out.println("Спасибо");
		} else if (costbook > cost) {
			cash = costbook - cost;
			System.out.println("Возьмите сдачу: " + cash);
		} else if (cost > costbook) {
			cash = cost - costbook;
			System.out.println("У вас недостаточно средств, необходимо доплатить: " + cash);
		} else {
			System.out.println("Не корректный ввод суммы");
		}

	}

}
