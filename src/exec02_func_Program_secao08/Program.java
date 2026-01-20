package exec02_func_Program_secao08;

import java.util.Locale;
import java.util.Scanner;

import exec02_func_secao08.Funcionario;

public class Program {

	public static void main(String[] args) {

	Locale.setDefault(Locale.US);
	Scanner scan = new Scanner(System.in);
	
	Funcionario funcionario = new Funcionario();
		
	System.out.print("Informe o nome: ");
	funcionario.nome = scan.nextLine();
	
	System.out.print("Informe o salário bruto: R$ ");
	funcionario.salarioBruto = scan.nextDouble();
	
	System.out.print("Informe o imposto: R$ ");
	funcionario.imposto = scan.nextDouble();
	
	System.out.printf("%nFuncionário: %s, R$ %.2f%n", funcionario.nome, funcionario.salarioLiquido());
	
	System.out.print("Qual a porcentagem será incrementada no salário? ");
	double porcentagem = scan.nextDouble();
	
	funcionario.aumentoSalario(porcentagem);
	
	System.out.println(funcionario);
	
	scan.close();

	}

}
