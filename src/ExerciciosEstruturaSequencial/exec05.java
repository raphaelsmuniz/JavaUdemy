package ExerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exec05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o código da peça 1: ");
		int codpeca1 = scan.nextInt();
		
		System.out.print("Informe o número de peças 1: ");
		int qtdpeca1 = scan.nextInt();
		
		System.out.print("Informe o valor unitário da peça 1 R$ ");
		double vlpeca1 = scan.nextDouble();
		
		System.out.print("Digite o código da peça 2: ");
		int codpeca2 = scan.nextInt();
		
		System.out.print("Informe o número de peças 2: ");
		int qtdpeca2 = scan.nextInt();
		
		System.out.print("Informe o valor unitário da peça 2 R$ ");
		double vlpeca2 = scan.nextDouble();
		
		double vlpagar1 = (double) qtdpeca1 * vlpeca1;
		double vlpagar2 = (double) qtdpeca2 * vlpeca2;
		double vltotal = vlpagar1 + vlpagar2;
		
		System.out.printf("O valor parcial da peça 1 de código %d é R$ %.2f.%n", codpeca1, vlpagar1);
		System.out.printf("O valor parcial da peça 2 de código %d é R$ %.2f.%n", codpeca2, vlpagar2);
				
		scan.close();
		
		System.out.printf("O valor total das peças 1 e 2 são R$ %.2f.", vltotal);

	}

}
