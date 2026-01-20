package secao05_exercicios;

import java.util.Scanner;

public class exec05 {

	public static void main(String[] args) {

		int quantCod1;
		int codigo1;
		
		double cachorroQuente = 4.00;
		double xSalada = 4.50;
		double xBacon = 5.00;
		double torradaSimples = 2.00;
		double refrigerante = 1.50;
		double valorSubTotal1;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o código do lanche ou bebida: ");
		codigo1 = scan.nextInt();
		
		System.out.print("Informe a quantidade do lanche ou bebida: ");
		quantCod1 = scan.nextInt();
		
		if (codigo1 == 1) {
			valorSubTotal1 = cachorroQuente * quantCod1;
		} else if (codigo1 == 2) {
			valorSubTotal1 = xSalada * quantCod1;
		} else if (codigo1 == 3) {
			valorSubTotal1 = xBacon * quantCod1;
		} else if (codigo1 == 4) {
			valorSubTotal1 = torradaSimples * quantCod1;
		} else {
			valorSubTotal1 = refrigerante * quantCod1;
		}
		
		scan.close();
		
		System.out.printf("O valor da conta para os itens solicitados é %.2f", valorSubTotal1);

	}

}
