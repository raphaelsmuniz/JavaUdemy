package secao10;

import java.util.Locale;
import java.util.Scanner;

public class Vetor4_soma_vetor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int numero4 = scan.nextInt();
		
		double [] vetor4 = new double[numero4];
		
		for (int i = 0; i < vetor4.length ; i++) {
			System.out.print("Digite um número: ");
			vetor4[i] = scan.nextDouble();
		}
		
		double somaNum = 0.0;
		System.out.println("");
		System.out.print("Valores: ");
		for (int i = 0; i < vetor4.length; i++) {
			System.out.printf("%.1f ",vetor4[i]);
			somaNum += vetor4[i];
		}
		
		double mediaNum = somaNum / numero4;
		System.out.printf("%nA soma dos valores é: %.2f%nA média dos valores é: %.2f", somaNum, mediaNum);
		
		scan.close();

	}

}
