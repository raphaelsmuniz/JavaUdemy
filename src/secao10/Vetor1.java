package secao10;

import java.util.Locale;
import java.util.Scanner;

public class Vetor1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		double [] vetor = new double[n];
		
		for (int i=0 ; i < n ; i++) {
			vetor[i] = scan.nextDouble();
		}
		
		double soma = 0.0;
		
		for (int i=0 ; i < n ; i++) {
			soma += vetor[i];
		}
		
		double media = soma / n;
		
		System.out.printf("a média é: %.2f%n", media);
		
		scan.close();

	}

}
