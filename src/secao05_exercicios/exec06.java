package secao05_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exec06 {

	public static void main(String[] args) {

		double valor;
		
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		valor = scan.nextDouble();
		
		if (valor >= 0.00 && valor <= 25.00) {
			System.out.println("Intervalo [0,25]");
		} else if (valor > 25 && valor <= 50) {
			System.out.println("Intervalo [25,50]");
		} else if (valor > 50.00 && valor <= 75.00) {
			System.out.println("Intervalo [50,75]");
		} else if (valor > 75.00 && valor <=100.00) {
			System.out.println("Intervalo [75,100]");
		} else {
			System.out.println("Fora de intervalo...");
		}
				
		scan.close();

	}

}
