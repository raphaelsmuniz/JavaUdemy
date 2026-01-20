package secao05_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exec08 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		double renda, imposto;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe a sua renda: ");
		renda = scan.nextDouble();
		
		if (renda == 0.00 || renda < 2000.00) {
			System.out.println("Isento de imposto de renda!");
		} else if (renda > 2000.01 || renda < 3000.00) {
			imposto = renda * 0.08;
			System.out.printf("O valor do imposto de renda para a renda de R$ %.2f é R$ %.2f", renda, imposto);
		} else if (renda > 3000.01 || renda < 4500.00) {
			imposto = renda * 0.18;
			System.out.printf("O valor do imposto de renda para a renda de R$ %.2f é R$ %.2f", renda, imposto);
		} else {
			imposto = renda * 0.28;
			System.out.printf("O valor do imposto de renda para a renda de R$ %.2f é R$ %.2f", renda, imposto);
		}
				
		scan.close();

	}

}
