package secao08;

import java.util.Locale;
import java.util.Scanner;

import util_secao08_versao3_aula78.Calculator;

public class Versao3_program_aula78 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
				
		System.out.print("Informe o raio: ");
		double raio = scan.nextDouble();
		
		//métodos estáticos: colocando a classe.chamada do que precisar
		double c = Calculator.circunferencia(raio);
		double v = Calculator.volume(raio);
		
		System.out.printf("Circunferência: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor de PI: %.2f%n", Calculator.PI);
		
		scan.close();

	}

	//aqui não é mais necessário instanciar o objeto para depois chamar na circunferencia e no volume.
	//apagar o objeto e colocar a classe Calculator
	
}
