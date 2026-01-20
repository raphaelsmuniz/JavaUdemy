package secao06;

import java.util.Locale;
import java.util.Scanner;

public class Exec03_for {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		int valor, peso;
		double valor1, mediaPonderada;
		double produto = 0.0, subTotal = 0.0;
		int subTotalPeso = 0;
				
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o valor de casos de teste para seguir: ");
		valor = scan.nextInt();
		
		for (int n = 1; n <= valor ; n++) {
			System.out.printf("Informe o %do valor: ", n);
			valor1 = scan.nextDouble();
			
			System.out.printf("Informe o %do peso: ", n);
			peso = scan.nextInt();
			
			produto = (double) valor1 * peso;
			subTotal += produto;
			subTotalPeso += peso;
		}
		mediaPonderada = subTotal / subTotalPeso;
		System.out.printf("A média ponderada dos valores informados é: %.1f", mediaPonderada);
		
		scan.close();

	}

}
