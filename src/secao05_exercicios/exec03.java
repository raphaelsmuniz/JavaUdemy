package secao05_exercicios;

import java.util.Scanner;

public class exec03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o 1o número: ");
		int numero1 = scan.nextInt();
		
		System.out.print("Informe o 2o número: ");
		int numero2 = scan.nextInt();
		
		if (numero1 > numero2) {
			int resultado1 = numero1 % numero2;
			if (resultado1 == 0) {
				System.out.println("São múltiplos...");
			} else {
				System.out.println("Não são múltiplos...");
			}
		} else {
			int resultado2 = numero2 % numero1;
			if (resultado2 == 0) {
				System.out.println("São múltiplos...");
			} else {
				System.out.println("Não são múltiplos...");
			}
		}
		
		
		scan.close();

	}

}
