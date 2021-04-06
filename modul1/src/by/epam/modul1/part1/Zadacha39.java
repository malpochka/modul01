package by.epam.modul1.part1;

import java.util.Scanner;

//Даны два действительных числа x и y. Найти их сумму, разность и произведение.
public class Zadacha39 {

	public static void main(String[] args) {
		int x;
		int y;
		int sum;
		int raz;
		int pro;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число x ");
		x = sc.nextInt();
		System.out.println("Введите число  y ");
		y = sc.nextInt();
		sum = x + y;
		raz = x - y;
		pro = x * y;
		System.out.println("Сумма =  " + sum + " Разность =  " + raz + " Произведение  = " + pro);

	}

}
