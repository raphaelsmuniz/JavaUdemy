package util_secao08_versao4_aula80;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	public static double cotacaoDolar;
	
	public static double compraDolar(double compraDolar) {
		return (cotacaoDolar * compraDolar * IOF) + (cotacaoDolar * compraDolar);
	}

}
