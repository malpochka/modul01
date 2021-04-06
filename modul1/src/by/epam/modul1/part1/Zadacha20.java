package by.epam.modul1.part1;

/*Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
 *Вывести данноне значение длительности в часах, минутахи секундах в следующей форме:
 *ННч ММмин SSс */

public class Zadacha20 {

	public static void main(String[] args) {
		int T;
		int hh;
		int mm;
		int ss;

		T = 3656;
		hh = T / 3600;
		mm = (T % 3600) / 60;
		ss = T % 60;
		System.out.println(hh + " ч " + mm + " мин " + ss + " с ");

	}

}
