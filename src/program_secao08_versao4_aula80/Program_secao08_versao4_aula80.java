package program_secao08_versao4_aula80;

import java.util.Locale;
import java.util.Scanner;

import util_secao08_versao4_aula80.CurrencyConverter;

public class Program_secao08_versao4_aula80 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Qual a cotação do dólar: ");
		CurrencyConverter.cotacaoDolar = scan.nextDouble();
		
		System.out.print("Quantos dólares deseja comprar: $ ");
		double compraDolar = scan.nextDouble();
		
		double cotCompra = CurrencyConverter.compraDolar(compraDolar);
		
		System.out.printf("O gasto em Reais para a compra de $ %.2f dólares foi R$ %.2f", compraDolar, cotCompra);
		
		scan.close();

	}

}
