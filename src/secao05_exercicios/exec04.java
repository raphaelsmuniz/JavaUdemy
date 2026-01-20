package secao05_exercicios;

import java.util.Scanner;

public class exec04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int resultado;
		int horamax1 = 24;
		
		System.out.print("Informe a hora inicial: ");
		int horaini = scan.nextInt();
		
		System.out.print("Informe a hora final: ");
		int horafin = scan.nextInt();
				
		if (horaini > 12) {
			resultado = (horamax1 - horaini) + horafin;
			
			if (resultado > horamax1) {
				System.out.println("O jogo durou mais de 24 hora(s).");
			} else {
				System.out.printf("O jogo durou %d hora(s)", resultado);
			}
			
		} else {
			if (horaini == 0 && horafin == 24) {
				resultado = horamax1 - horaini;
				System.out.printf("O jogo durou %d hora(s)", resultado);
			} else {
				resultado = horafin - horaini;
				System.out.printf("O jogo durou %d hora(s)", resultado);
			}
		}
		
		scan.close();

	}

}
