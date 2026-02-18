package secao10;

import java.util.Locale;
import java.util.Scanner;

public class Vetor5_alturas {

	public static void main(String[] args) {

		int idade = 0;
		double altura = 0.0;
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas: ");
		int numero = scan.nextInt();
		
		String [] vetorNome = new String[numero];
		int [] vetorIdade = new int[numero];
		double [] vetorAltura = new double[numero];

		
		for (int i = 0; i < numero; i++) {
			System.out.printf("Dados da %da pessoa:%n", i+1);
			System.out.print("Nome: ");
			scan.nextLine();
			vetorNome [i] = scan.nextLine();
			System.out.print("Idade: ");
			vetorIdade [i] = scan.nextInt();
			System.out.print("Altura: ");
			vetorAltura [i] = scan.nextDouble();
		}
		
		for (int i = 0; i < vetorAltura.length; i++) {
			altura += vetorAltura[i];
			if (vetorIdade[i] < 16) {
				idade++;
			}
		}
		
		double alturaMedia = altura / vetorAltura.length;
		System.out.println("");
		System.out.printf("A altura média é: %.2f%n", alturaMedia);
		
		double porcentIdade = (idade / vetorIdade.length);
		System.out.printf("As pessoas com menos de 16 anos são: %.1f%% %n", porcentIdade);
		
		for (int i = 0; i < vetorIdade.length; i++) {
			if (vetorIdade[i] < 16) {
				System.out.println(vetorNome[i]);
			}
		}
		
		scan.close();

	}

}
