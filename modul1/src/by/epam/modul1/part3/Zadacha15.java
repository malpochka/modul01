package by.epam.modul1.part3;

//Вычислить: 1+2+4+8+..+2 в 10 степени
public class Zadacha15 {

	public static void main(String[] args) {
		int i;
		int x;
		int sum;
		x = 1;
		sum = 1;
		for (i = 1; i <= 10; i++) {
			x = x * 2;
			sum = sum + x;

			System.out.println(sum);
		}
	}
}
