package secao06;

import java.util.Locale;
import java.util.Scanner;

public class Exec04_for {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		int repeteco, valor1, valor2;
		double divisao;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o número de repetições: ");
		repeteco = scan.nextInt();
		
		for (int x = 1 ; x <= repeteco ; x++) {
			System.out.printf("Informe o %do valor: %n", x);
			valor1 = scan.nextInt();
			
			System.out.println("Informe o denominador: ");
			valor2 = scan.nextInt();
			
			if (valor2 != 0) {
				divisao = (double) valor1 / valor2;
				System.out.printf("O valor da divisão entre %d e %d, é %.1f%n", valor1, valor2, divisao);
			} else {
				System.out.println("Divisão impossível...");
			}
		}
		
		scan.close();

	}

}
