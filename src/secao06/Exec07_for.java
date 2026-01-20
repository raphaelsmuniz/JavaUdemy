package secao06;

import java.util.Scanner;

public class Exec07_for {

	public static void main(String[] args) {

		int valor, quadrado, cubo;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		valor = scan.nextInt();
		
		for (int x = 1 ; x <= valor ; x++) {
			quadrado = (int) Math.pow(x, 2);
			cubo = (int) Math.pow(x, 3);
			System.out.printf("%d  %d  %d%n", x, quadrado, cubo);
		}
		
		scan.close();

	}

}
