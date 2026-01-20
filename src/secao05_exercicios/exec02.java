package secao05_exercicios;

import java.util.Scanner;

public class exec02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int numero = scan.nextInt();
		
		int resultado = numero % 2;
		if (resultado == 0) {
			System.out.println("O número é PAR!");
		} else {
			System.out.println("O número é IMPAR!");
		}
				
		scan.close();

	}

}
