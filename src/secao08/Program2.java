package secao08;

import java.util.Locale;
import java.util.Scanner;

import entities_secao08.Triangulo;

public class Program2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Entre com as medidas do triângulo X: ");
		x.a = scan.nextDouble();
		x.b = scan.nextDouble();
		x.c = scan.nextDouble();
		
		System.out.println("Entre com as medidas do triângulo Y: ");
		y.a = scan.nextDouble();
		y.b = scan.nextDouble();
		y.c = scan.nextDouble();
		
		double areaX = x.area();
		
		double areaY = y.area();
		
		System.out.printf("A área do triangulo X é: %.4f%n", areaX);
		System.out.printf("A área do triangulo Y é: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("A área do triangulo X é maior.");
		} else {
			System.out.println("A área do triangulo Y é maior.");
		}
		
		scan.close();

	}

}
