package ExerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exec06 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scan = new Scanner(System.in);

		System.out.print("Informe o número da 1a base: ");
		double baseA = scan.nextDouble();

		System.out.print("Informe o número da 2a base: ");
		double baseB = scan.nextDouble();

		System.out.print("Informe o número da altura: ");
		double altura = scan.nextDouble();

		double areaTR = (baseA * altura) / 2;

		double pi = 3.14159;
		double areaC = pi * Math.pow(altura, 2.0);

		double areaTrap = ((baseA + baseB) * altura) / 2;

		double areaQuad = Math.pow(baseB, 2.0);

		double areaRet = baseA * baseB;

		scan.close();

		System.out.printf("%nA área do triângulo retângulo é: %.3f%n", areaTR);
		System.out.printf("A área do círculo é: %.3f%n", areaC);
		System.out.printf("A área do trapézzio é: %.3f%n", areaTrap);
		System.out.printf("A área do quadrado é: %.3f%n", areaQuad);
		System.out.printf("A área do retângulo é: %.3f%n", areaRet);
	}

}
