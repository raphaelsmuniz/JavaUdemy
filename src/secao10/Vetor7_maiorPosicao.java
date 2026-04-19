package secao10;

import java.util.Locale;
import java.util.Scanner;

public class Vetor7_maiorPosicao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in); 
		
		System.out.print("Quantos números voçê vai digitar? ");
		int digitado = scan.nextInt();
		
		double [] vetorPos = new double[digitado];
		
		for(int n = 0; n < vetorPos.length; n++) {
			System.out.print("Digite um número: ");
			vetorPos[n] = scan.nextDouble();
		}
		
		double maior = vetorPos[0];
		int numeroPosicao = 0;
		for(int i = 0; i < vetorPos.length; i++) {
			if(vetorPos[i] > maior) {
				maior = vetorPos[i];
				numeroPosicao = i;
			}
		}
		
		System.out.printf("%nMaior valor: %.1f%nPosição do maior valor: %d",maior, numeroPosicao);
		
		scan.close();

	}

}
