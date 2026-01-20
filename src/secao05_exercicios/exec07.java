package secao05_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exec07 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		double coordX, coordY;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o número do eixo X: ");
		coordX = scan.nextDouble();
		
		System.out.print("Informe o número do eixo Y: ");
		coordY = scan.nextDouble();
		
		if (coordX > 0.00 && coordY > 0.00) {
			System.out.println("Plano Q1");
		} else if ((coordX == 0.00 && coordY < 0.00) || (coordX == 0.00 && coordY > 0.00)) {
			System.out.println("Eixo Y");
		} else if ((coordY == 0.00 && coordX < 0.00) || (coordY == 0.00 && coordX > 0.00)) {
			System.out.println("Eixo X");
		} 
		else if (coordX < 0.00 && coordY > 0.00) {
			System.out.println("Plano Q2");
		} 
		else if (coordX < 0.00 && coordY < 0.00 ) {
			System.out.println("Plano Q3");
		} 
		else if (coordX > 0.00 && coordY < 0.00) {
			System.out.println("Plano Q4");
		}
		else {
			System.out.println("Origem...");
		}
		
		scan.close();

	}

}
