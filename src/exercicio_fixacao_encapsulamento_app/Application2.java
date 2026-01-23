package exercicio_fixacao_encapsulamento_app;

import java.util.Locale;
import java.util.Scanner;

import exercicio_fixacao_encapsulamento.ContaBancaria2;

public class Application2 {

	public static void main(String[] args) {

		double valorConta = 0.00;
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o número da conta: ");
		int numConta = scan.nextInt();
		scan.nextLine();
		
		System.out.print("Informe o nome do titular: ");
		String nome = scan.nextLine();
		
		System.out.print("Haverá depósito inicial (y/n)? ");
		String depInicial = scan.nextLine();
		
		ContaBancaria2 conta = new ContaBancaria2(numConta, nome, valorConta);
		
		switch (depInicial) {
		case "y": {
			System.out.print("Informe o valor do depósito inicial: R$ ");
			valorConta = scan.nextDouble();
			//conta.getValorConta(); 
			
			System.out.println();
			System.out.print("Dados da conta:");
			System.out.print(conta);
			break;
		}
		case "n": {
			System.out.println();
			System.out.print("Dados da conta:");
			System.out.print(conta);
			break;
		}
		default:
			System.out.println("Valor incorreto... Favor repetir o processo de cadastro da conta.");
			break;
		}
		
		System.out.print("Informe o valor para depósito: R$ ");
		
		
		scan.close();

	}

}
