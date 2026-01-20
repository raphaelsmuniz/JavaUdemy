package secao06;

import java.util.Scanner;

public class Exec06_for {

	public static void main(String[] args) {

		int valor, divisor;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		valor = scan.nextInt();
		
		for (int x = valor ; x <= valor && x > 0 ; x--) {
			if (valor % x == 0) {
				divisor = valor / x;
				System.out.println(divisor);
			}
			
		}
		
		scan.close();

	}

}
