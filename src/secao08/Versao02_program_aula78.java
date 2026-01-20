package secao08;

import java.util.Locale;
import java.util.Scanner;
import util_secao08_versao02_aula78.Calculator;

public class Versao02_program_aula78 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		
		System.out.print("Informe o raio: ");
		double raio = scan.nextDouble();
		
		double c = calc.circunferencia(raio);
		double v = calc.volume(raio);
		
		System.out.printf("Circunferência: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor de PI: %.2f%n", calc.PI);
		
		scan.close();


	}

}
