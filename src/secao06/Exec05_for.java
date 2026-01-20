package secao06;

import java.util.Scanner;

public class Exec05_for {

	public static void main(String[] args) {

		int valor;
		int produto = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe um número para calcular o fatorial: ");
		valor = scan.nextInt();
		
		if (valor > 1) {
			for (int x = 1 ; x < valor ; x++) {
				if (x == 1) {
					produto = valor * (valor - x);
				} else {
					produto = produto * (valor - x);
				}	
			} 			
			
		} else {
			produto = 1;
		}
		System.out.println(produto);
		
		scan.close();

	}

}
