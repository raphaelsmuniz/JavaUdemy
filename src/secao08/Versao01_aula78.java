package secao08;

import java.util.Locale;
import java.util.Scanner;

public class Versao01_aula78 {

	//a declaração de PI é um membro estático, onde ao colocar a palavra "final",
	//indica que é uma constante e que o valor não muda.
	public static final double PI = 3.14149;
	
	//o padrão do nome de constante, é todo em maiúsculo ou caixa alta.
	//caso seja uma palavra composta, deve separar com underline.
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o raio: ");
		double raio = scan.nextDouble();
		
		double c = circunferencia(raio);
		double v = volume(raio);
		
		System.out.printf("Circunferência: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor de PI: %.2f%n", PI);
		
		scan.close();

	}

	public static double circunferencia(double raio) {
		return 2.0 * PI * raio;
	}
	
	public static double volume(double raio) {
		return 4.0 * PI * raio * raio * raio / 3.0;
	}
}
