package exercicio_fixacao_encapsulamento_app;

import java.util.Locale;
import java.util.Scanner;

import exercicio_fixacao_encapsulamento.ContaBancaria;

public class Application {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double valorDeposito = 0.00;
				
		System.out.print("Informe o número da conta: ");
		int numeroConta = scan.nextInt();
		scan.nextLine();
		System.out.print("Informe o nome do titular da conta: ");
		String nome = scan.nextLine();
		System.out.print("Haverá depósito inicial (y/n)? ");
		String depositoInicial = scan.next();
		
		ContaBancaria contaBancaria = new ContaBancaria(nome, numeroConta, depositoInicial, valorDeposito);
					
		switch(depositoInicial) {
		case "y":
			System.out.print("Informe o valor do depósito inicial: R$ ");
			valorDeposito = scan.nextDouble();
			contaBancaria.getValorDeposito(valorDeposito);
			System.out.println("Dados da conta:");
			System.out.print(contaBancaria);
			System.out.println();
			break;
		case "n":
			contaBancaria.getValorDeposito(valorDeposito);
			System.out.println("Dados da conta:");
			System.out.print(contaBancaria);
			System.out.println();
			break;
		default:
			depositoInicial = "Valor inválido... Favor repetir o processo de cadastro da conta corrente.";
			System.out.print(depositoInicial);
			break;
		}
		
		System.out.println();
		System.out.print("Informe o valor para depósito: R$ ");
		valorDeposito = scan.nextDouble();
		contaBancaria.addDeposit(valorDeposito);
		
		System.out.println("Dados da conta atualizado abaixo:");
		System.out.print(contaBancaria);
		System.out.println();
		
		System.out.println();
		System.out.print("Informe o valor para saque: R$ ");
		valorDeposito = scan.nextDouble();
		contaBancaria.withdrawDeposit(valorDeposito);
		
		System.out.println("Dados da conta atualizado abaixo:");
		System.out.print(contaBancaria);
		
		scan.close();

	}

}
