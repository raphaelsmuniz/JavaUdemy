package secao08;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		double xA, xB, xC, yA, yB, yC;
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com as medidas do triângulo X: ");
		xA = scan.nextDouble();
		xB = scan.nextDouble();
		xC = scan.nextDouble();
		
		System.out.println("Entre com as medidas do triângulo Y: ");
		yA = scan.nextDouble();
		yB = scan.nextDouble();
		yC = scan.nextDouble();
		
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
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
