
public class Casting {

	public static void main(String[] args) {

		int a, b;
		double resultado, resultado2;
		
		a = 5;
		b = 2;
		
		resultado = a / b; //ao fazer a divisão, o compilador entende que a divisão é sobre números inteiros e com isso o resultado
						  //não vem truncado.
		
		//para fazer a divisão retornar um double através de 2 números inteiros, deve-se acrescentar o double na expressão:
		resultado2 = (double) a / b;
		System.out.println(resultado);
		System.out.println(resultado2);
		
		double c;
		int d;
		
		c = 5.0;
		d = (int) c;
		
		System.out.println(d);

	}

}
