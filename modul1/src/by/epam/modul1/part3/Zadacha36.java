package by.epam.modul1.part3;

/*Два двузначных числа, записанных одно за другим, образуют четырехзначное число, которое делится на их произведение.
*Найти эти числа.*/

public class Zadacha36 {

	public static void main(String[] args) {
		int m;
		int n;
		int pr;

		for (m = 10; m < 100; m++) {
			for (n = 10; n < 100; n++) {
				pr = m * n;
				if (((m * 100 + n) % pr == 0)) {
					System.out.println(m + " ; " + n);
				}
			}
		}
	}

}
