package by.epam.modul1.part3;

/*В трехзначном числе зачеркнули старшую цифру. Когда полученное число умножили на 7, то получили
 * исходное число.Найти это число.
 */

public class Zadacha39 {

	public static void main(String[] args) {
		int i;

		for (i = 100; i < 1000; i++) {
			if (7 * (i % 100) == i) {
				System.out.println(i);
			}
		}

	}

}
