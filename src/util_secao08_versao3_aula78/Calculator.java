package util_secao08_versao3_aula78;

public class Calculator {

public static final double PI = 3.14149;
	
	public static double circunferencia(double raio) {
		return 2.0 * PI * raio;
	}
	
	public static double volume(double raio) {
		return 4.0 * PI * raio * raio * raio / 3.0;
	}
	//as operações podem ser calculadas independente de objetos, por isso foi adicionado a palavra "static".
}
