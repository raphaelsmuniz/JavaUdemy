package ExerciciosEstruturaSequencial;

import java.util.Scanner;

public class exec03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o 1o número: ");
		int a1 = scan.nextInt();
		System.out.println("Digite o 2o número: ");
		int b1 = scan.nextInt();
		System.out.println("Digite o 3o número: ");
		int c1 = scan.nextInt();
		System.out.println("Digite o 4o número: ");
		int d1 = scan.nextInt();
		
		scan.close();
		
		int diferenca1;
		diferenca1 = (a1 * b1 - c1 * d1);
		
		System.out.printf("O resultado da expressão (A * B - C * D) é %d%n", diferenca1);
		
		
	}

}
