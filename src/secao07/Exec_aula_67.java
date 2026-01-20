package secao07;

import java.util.Scanner;

public class Exec_aula_67 {

	public static void main(String[] args) {

		int valor1, valor2, valor3;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor 1: ");
		valor1 = scan.nextInt();
		
		System.out.println("Informe o valor 2: ");
		valor2 = scan.nextInt();
		
		System.out.println("Informe o valor 3: ");
		valor3 = scan.nextInt();
		
	/*	if (valor1 > valor2) {
			if (valor1 > valor3) {
				System.out.println("o valor maior é " + valor1);
			} 
		} else if (valor2 > valor3) {
			System.out.println("o valor maior é " + valor2);
		} else {
			System.out.println("o valor maior é " + valor3);
		}
		*/
		
		int higher = max(valor1, valor2, valor3);
		
		showResult(higher);
		
		scan.close();

	}
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		}
		else if (y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}

}
