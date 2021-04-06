package by.epam.modul1.part3;

import java.util.Scanner;

/*Напишите программу где пользователь вводит любое целое положительное число.
 * А программа суммирует все числа от 1 до введенного пользователем числа.*/

public class Zadacha6 {

	public static void main(String[] args) {
		int n;
		int sum;
		int i;
		i = 1;
		sum = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите целое положительное число");
		n = sc.nextInt();

		while (i < n) {
			sum = sum + i;
			System.out.println(sum);
			i++;
		}

	}

}
