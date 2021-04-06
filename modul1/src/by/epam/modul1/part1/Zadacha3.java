package by.epam.modul1.part1;
import java.util.Scanner;
//Составить алгоритм нахождения среднего арифметического двух чисел..

public class Zadacha3 {

	public static void main(String[] args) {
		int c;
		Scanner sc = new Scanner (System.in);
		System.out.println("Введите число:");
		int a = sc.nextInt();
		System.out.println("Спасибо! Вы ввели число:"+a);
		System.out.println("Введите число:");
		int b = sc.nextInt();
		System.out.println("Спасибо! Вы ввели число:"+b);
		c= (a+b)/2;
		System.out.println("Результат с"+" = "+c);
		sc.close();
	}

}
