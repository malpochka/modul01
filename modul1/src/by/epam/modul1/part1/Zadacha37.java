package by.epam.modul1.part1;

import java.util.Scanner;

/* Дано действительное число х, не пользуясь никакими другими арифметическими
* операциями, кроме умножения, сложения и вычитания, вычислить за минимальное
* число операций: 2x^4 - 3x^3 + 4x^2 - 5x + 6;*/

public class Zadacha37 {

	public static void main(String[] args) {
		int x;
		int rez;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число  x");
		x = sc.nextInt();
		rez = ((((2 * x - 3) * x + 4) * x - 5) * x + 6);
		System.out.println(rez);
	}

}
