package exercicio_fixacao_encapsulamento_app;

import java.util.Locale;
import java.util.Scanner;

import exercicio_fixacao_encapsulamento.ContaBancaria;

public class Application {

	public static void main(String[] args) {

		//criado a declaração da variável ContaBancaria contaBancaria;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double valorDeposito = 0.00;
				
		System.out.print("Informe o número da conta: ");
		int numeroConta = scan.nextInt();
		System.out.print("Informe o nome do titular da conta: ");
		//a quebra de linha fica aqui:
		scan.nextLine();
		String nome = scan.nextLine();
		System.out.print("Haverá depósito inicial (y/n)? ");
		char depositoInicial = scan.next().charAt(0); //trocado o tipo da variável para char
		
		ContaBancaria contaBancaria = new ContaBancaria(nome, numeroConta, valorDeposito);
		
		//foi utilizado a função IF na validação do depósito inicial. A forma em que foi feita, observar a correção do exercício.
		switch(depositoInicial) {
		case 'y':
			System.out.print("Informe o valor do depósito inicial: R$ ");
			valorDeposito = scan.nextDouble();
			contaBancaria.getValorDeposito(valorDeposito);
			//foi instanciado o método com 3 parâmetros aqui...
			//contaBancaria = new ContaBancaria(nome, numeroConta, valorDeposito); -> exercitando a sobrecarga.
			System.out.println("Dados da conta:");
			System.out.print(contaBancaria);
			System.out.println();
			break;
		case 'n':
			contaBancaria.getValorDeposito(valorDeposito);
			//foi instanciado o método com 2 parâmetros aqui...
			//contaBancaria = new ContaBancaria(nome, numeroConta); -> exercitando a sobrecarga.
			System.out.println("Dados da conta:");
			System.out.print(contaBancaria);
			System.out.println();
			break;
		default:
			String message = "Valor inválido... Favor repetir o processo de cadastro da conta corrente.";
			System.out.print(message);
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
