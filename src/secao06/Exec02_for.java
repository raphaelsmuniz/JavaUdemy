package secao06;

import java.util.Scanner;

public class Exec02_for {

	public static void main(String[] args) {

		int valor;
		int valor2 = 0;
		int dentro = 0;
		int fora = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de vezes: ");
		valor = scan.nextInt();
		
		for (int i = 0 ; i < valor ; i++) {
			if (valor2 >= 10 && valor2 <= 20) {
				dentro += 1;
			} else {
				fora += 1;
			}
			System.out.print("Informe um número: ");
			valor2 = scan.nextInt();
		}
		
		System.out.printf("%n%d IN%n%d OUT", dentro, fora);
		
		scan.close();

	}

}
