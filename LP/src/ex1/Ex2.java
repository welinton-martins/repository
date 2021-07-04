package ex1;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("1: ");
		int n1 = in.nextInt();
		System.out.print("2: ");
		int n2 = in.nextInt();
		System.out.print("3: ");
		int n3 = in.nextInt();

		int med = (n1 + n2 + n3) / 3;

		in.close();

		System.out.println("Media: " + med);

	}
}
