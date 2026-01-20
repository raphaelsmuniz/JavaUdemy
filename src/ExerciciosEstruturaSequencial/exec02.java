package ExerciciosEstruturaSequencial;

public class exec02 {

	public static void main(String[] args) {

		//Locale.setDefault(Locale.US);
		double raio1 = 2.0;
		double raio2 = 100.64;
		double raio3 = 150.00;
		
		double area1;
		double area2;
		double area3;
		double pi = 3.14159;
		
		area1 = pi * Math.pow(raio1, 2.0);
		area2 = pi * Math.pow(raio2, 2.0);
		area3 = pi * Math.pow(raio3, 2.0);
		
		System.out.printf("A área do círculo de raio %.1f é %.4f%n", raio1, area1);
		System.out.printf("A área do círculo de raio %.1f é %.4f%n", raio2, area2);
		System.out.printf("A área do círculo de raio %.1f é %.4f", raio3, area3);

	}

}
