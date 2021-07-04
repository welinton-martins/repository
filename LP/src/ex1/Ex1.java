package ex1;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("1: ");
		int n1 = in.nextInt();
		System.out.print("2: ");
		int n2 = in.nextInt();
		System.out.print("3: ");
		int n3 = in.nextInt();
		System.out.print("4: ");
		int n4 = in.nextInt();

		in.close();

		System.out.println("Soma: " + (n1 + n2 + n3 + n4));

	}
}
