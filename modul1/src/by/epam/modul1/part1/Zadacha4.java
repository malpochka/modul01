package by.epam.modul1.part1;

import java.util.Scanner;

/*Написать код для решения задачи. В n малых бидонах 80л молока.Сколько литров в m больших
*бидонах, если в каждом большом бидоне на 12л больше,чем в малом?*/
public class Zadacha4 {

	public static void main(String[] args) {
		int n;
		int m;
		int k;

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите количество малых бидонов");
		n = sc.nextInt();
		System.out.println("Введите количество больших бидонов");
		m = sc.nextInt();
		k = (80 / n + 12) * m;
		System.out.println(k + " литров молока в " + m + " больших бидонах.");
		sc.close();

	}
}
