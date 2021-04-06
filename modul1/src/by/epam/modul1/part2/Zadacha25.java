package by.epam.modul1.part2;

import java.util.Scanner;

/*Написать программу - модель анализа пожарного датчика в помещении, которая выводит
 *сообщение "пожароопасная ситуация", если температура в комнате превысила 60 градусов.*/

public class Zadacha25 {

	public static void main(String[] args) {
		int t;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите температуру датчика");
		t = sc.nextInt();

		if (t > 60) {
			System.out.println("Пожароопасная ситуация");
		}

	}

}
