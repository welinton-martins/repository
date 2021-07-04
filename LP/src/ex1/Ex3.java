package ex1;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Nota e peso 1: ");
		int n1 = in.nextInt(), p1 = in.nextInt();
		System.out.print("Nota e peso 2: ");
		int n2 = in.nextInt(), p2 = in.nextInt();
		System.out.print("Nota e peso 3: ");
		int n3 = in.nextInt(), p3 = in.nextInt();

		int media = ((n1 * p1) + (n2 * p2) + (n3 * p3)) / (p1 + p2 + p3);

		System.out.println("Media: " + media);

		in.close();
	}
}
