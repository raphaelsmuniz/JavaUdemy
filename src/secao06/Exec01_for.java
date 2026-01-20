package secao06;

import java.util.Scanner;

public class Exec01_for {

	public static void main(String[] args) {

		int valor;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		valor = scan.nextInt();
		
		if (valor >= 1 && valor <= 1000) {
			for (int i = 1 ; i <= valor ; i++) {
				if (i % 2 != 0) {
					System.out.println("valor ímpar: " + i);
				}
			}
		} else {
			System.out.println("Número fora do intervalo...");
		}
		
		scan.close();

	}

}
