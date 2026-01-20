package exec03_estudante_Program_secao08;

import java.util.Locale;
import java.util.Scanner;

import exec03_estudante_secao08.Estudante;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Estudante estudante = new Estudante();
		
		System.out.print("Informe seu nome: ");
		estudante.nome = scan.nextLine();
		System.out.print("Informe a 1a nota: ");
		estudante.nota1 = scan.nextDouble();
		System.out.print("Informe a 2a nota: ");
		estudante.nota2 = scan.nextDouble();
		System.out.print("Informe a 3a nota: ");
		estudante.nota3 = scan.nextDouble();
		
		if (estudante.notaFinal() < 60.0) {
			System.out.printf("Nota final = %.2f%n", estudante.notaFinal());
			System.out.println("Reprovado");
			System.out.printf("Faltou %.2f pontos.", estudante.pontosFaltantes());
		} else {
			System.out.printf("Nota final = %.2f%n", estudante.notaFinal());
			System.out.print("Aprovado");
		}
		
		scan.close();

	}

}
