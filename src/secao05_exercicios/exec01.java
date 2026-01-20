package secao05_exercicios;

import java.util.Scanner;

public class exec01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe um número:");
		int numero = scan.nextInt();
		
		if (numero < 0) {
			System.out.println("O número é negativo!");
		} else {
			System.out.println("O número não é negativo!");
		}
		
		scan.close();

	}

}
