package exec01_retangulo_Program_secao08;

import java.util.Locale;
import java.util.Scanner;

import exec01_retangulo_secao08.Retangulo;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Retangulo rectangle = new Retangulo();
		
		System.out.println("Informe a largura e altura do retangulo: ");
		rectangle.largura = scan.nextDouble();
		rectangle.altura = scan.nextDouble();
		
		double area = rectangle.area();
		double perimetro = rectangle.perimetro();
		double diagonal = rectangle.diagonal();
		
		System.out.printf(" AREA = %.2f%n PERÍMETRO = %.2f%n DIAGONAL = %.2f", area, perimetro, diagonal);
		
		scan.close();

	}

}
