package secao06;

import java.util.Scanner;

public class Exec02 {

	public static void main(String[] args) {

		int coordX, coordY;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a coordenada X: ");
		coordX = scan.nextInt();
		
		System.out.print("Digite a coordenada Y: ");
		coordY = scan.nextInt();
		
		while (coordX != 0 && coordY != 0) {
			
			if (coordX > 0 && coordY > 0) {
				System.out.println("Primeiro quadrante");
			} else if (coordX < 0 && coordY > 0) {
				System.out.println("Segundo quadrante");
			} else if (coordX < 0 && coordY < 0) {
				System.out.println("Terceiro quadrante");
			} else {
				System.out.println("Quarto quadrante");
			}
			
			System.out.print("Digite a coordenada X: ");
			coordX = scan.nextInt();
			
			System.out.print("Digite a coordenada Y: ");
			coordY = scan.nextInt();
			
		}
		
		scan.close();

	}

}
