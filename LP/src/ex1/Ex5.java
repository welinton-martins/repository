package ex1;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Salario do Funcionario: R$");
		float salario = in.nextFloat();
		System.out.print("Percentual do aumento: ");
		int percentual = in.nextInt();
		System.out.printf("Novo salario com aumento de %d%%: R$%.2f", percentual,
				(salario * (percentual * 0.01)) + salario);
		in.close();
	}

}
