package by.epam.modul1.part2;

import java.util.Scanner;

/*Даны целые числа m,n.Если числа не равны, то заменить каждое из них одним и тем же 
 * числом, равным большему из исходных, а если равны ,то заменить числа нулями*/

public class Zadacha17 {

	public static void main(String[] args) {
		int m;
		int n;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число m");
		m = sc.nextInt();
		System.out.println("Введите число n");
		n = sc.nextInt();

		if (m != n) {
			if (m < n) {
				System.out.println("Число m равно " + n + ", число n равно " + n);
			} else if (n < m) {
				System.out.println("Число m равно " + m + ", число n равно " + m);
			}
		} else {
			m = 0;
			n = 0;
			System.out.println("Число m равно " + m + " Число n равно " + n);
		}

	}

}
