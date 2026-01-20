import java.util.Locale;

public class FuncoesMatematicas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double a, b, c;
		
		//raiz quadrada
		a = Math.sqrt(x);
		b = Math.sqrt(y);
		c = Math.sqrt(25.0);
		System.out.printf("Raiz quadrada de %.1f = %.6f%n", x, a);
		System.out.printf("Raiz quadrada de %.1f = %.1f%n", y, b);
		System.out.printf("Raiz quadrada de 25 é %.1f%n", c);
		
		//potenciação
		a = Math.pow(x, y);
		b = Math.pow(x, 2.0);
		c = Math.pow(5.0, 2.0);
		System.out.printf("%n%.1f elevado a %.1f = %.1f%n", x, y, a);
		System.out.printf("%.1f elevado a 2 = %.1f%n", x, b);
		System.out.printf("5 elevado a 2 = %.1f%n", c);
		
		//número absoluto
		a = Math.abs(y);
		b = Math.abs(z);
		System.out.printf("%nValor absoluto de %.1f é %.1f%n", y, a);
		System.out.printf("Valor absoluto de %.1f é %.1f", z, b);

	}

}
