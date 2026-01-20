package secao06;

import java.util.Scanner;

public class Exec03 {

	public static void main(String[] args) {

		int codProduto;
		
		int combAlcool = 0;
		int combGasolina = 0;
		int combDiesel = 0;
		int soma = 1;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o código do produto de sua preferência: ");
		codProduto = scan.nextInt();
		
		while (codProduto != 4) {
			
			if (codProduto == 1) {
				combAlcool += soma;
			} else if (codProduto == 2) {
				combGasolina += soma;
			} else if (codProduto == 3) {
				combDiesel += soma;
			} else {
				System.out.println("Código inválido, favor digitar novamente...");
			}
			
			System.out.println("Informe o código do produto de sua preferência: ");
			codProduto = scan.nextInt();
			
		}
		
		System.out.println("Muito obrigado!");
		System.out.printf("As quantidades informadas são: %nAlcool: %d%nGasolina: %d%nDiesel: %d", combAlcool, combGasolina, combDiesel);
		
		scan.close();

	}

}
