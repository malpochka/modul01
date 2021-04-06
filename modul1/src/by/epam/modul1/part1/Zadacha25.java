package by.epam.modul1.part1;
/*Дано значение а. Не используя никаких функций и никаких операций , кроме умножения, 
получить значение а^8 за три операции и a^10 за четыре операции*/

public class Zadacha25 {

	public static void main(String[] args) {
		int a;
		int a1;
		int a2;
		int a8;
		int a10;

		a = 2;

		a1 = a * a;
		a2 = a1 * a1;
		a8 = a2 * a2;
		a10 = a8 * a1;
		System.out.println("Значение а в 8 степени равно  " + a8);
		System.out.println("Значение а в 10 степени равно  " + a10);

	}

}
