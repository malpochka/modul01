package by.epam.modul1.part3;

import java.util.Scanner;

public class Zadacha41 {

	public static void main(String[] args) {
		int n;
		int i;
		int m;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите число");
		n = sc.nextInt();
		for(i=1;i<=n;i++) {
			System.out.println(i);
		}
		while (i> 0) {

			m=i%10;
			i/=10;

		
		System.out.println(m);
	}
	}
}
