package by.epam.modul1.part3;

//Найти все четерехзначные числа, сумма цифр каждого из которых равна 15.
public class Zadacha34 {

	public static void main(String[] args) {
		int n;
		int n1;
		int n2;
		int n3;
		int n4;
		int sum;

		for (n = 1000; n <= 9999; n++) {
			n1 = n % 100 % 10;
			n2 = n % 100 / 10;
			n3 = n % 1000 / 100;
			n4 = n / 1000;
			sum = n1 + n2 + n3 + n4;
			if (sum == 15) {
				System.out.println(n);
			}
		}

	}

}
