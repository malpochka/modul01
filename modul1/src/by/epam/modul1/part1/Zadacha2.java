package by.epam.modul1.part1;
import java.util.Scanner;
//Найти значение функции z=2*x+(y-2)*5

public class Zadacha2 {
	public static void main(String[] args) {
		int z;
		Scanner sc = new Scanner(System.in);
	       System.out.println("������� ����� x:");
	       int x = sc.nextInt();
	       System.out.println("�������! �� ����� ����� " + x);
	       System.out.println("������� ����� y:");
	       int y = sc.nextInt();
	       System.out.println("�������! �� ����� ����� " + y);
	       
	       z=2*x+(y-2)*5;
	       System.out.println("��������� z  = "+z);
	       sc.close();
	}

}
