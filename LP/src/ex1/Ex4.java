package ex1;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Salario do Funcionario: ");
		Float salario = in.nextFloat();
		System.out.printf("Sofreu um aumento de 25%%: R$%.2f", (salario * 0.25) + salario);
		in.close();
	}
}
