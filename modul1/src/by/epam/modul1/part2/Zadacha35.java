package by.epam.modul1.part2;

import java.util.Scanner;

//Вычислить число и месяц в невисокосном году по номеру дня.
public class Zadacha35 {

	public static void main(String[] args) {
		int day;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите номер дня");
		day = sc.nextInt();

		if (0 < day & day <= 31) {
			System.out.println(day + " Января");
		} else if (day > 31 & day <= 59) {
			day = day - 31;
			System.out.println(day + " Февраля");
		} else if (day > 59 & day <= 90) {
			day = day - 59;
			System.out.println(day + " Марта");
		} else if (day > 90 & day <= 120) {
			day = day - 90;
			System.out.println(day + " Апреля");
		} else if (day > 120 & day <= 151) {
			day = day - 120;
			System.out.println(day + " Мая");
		} else if (day > 151 & day <= 181) {
			day = day - 151;
			System.out.println(day + " Июня");
		} else if (day > 181 & day <= 212) {
			day = day - 181;
			System.out.println(day + " Июля");
		} else if (day > 212 & day <= 243) {
			day = day - 212;
			System.out.println(day + " Августа");
		} else if (day > 243 & day <= 273) {
			day = day - 243;
			System.out.println(day + " Сентября");
		} else if (day > 273 & day <= 304) {
			day = day - 273;
			System.out.println(day + " Октября");
		} else if (day > 304 & day <= 334) {
			day = day - 304;
			System.out.println(day + " Ноября");
		} else if (day > 334 & day <= 365) {
			day = day - 334;
			System.out.println(day + " Декабря");
		} else {
			System.out.println("Вы ввели недопустимое значение ");
		}
	}

}