package secao06;

import java.util.Scanner;

public class Exemplo_aula_while {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		
		int y = 0;
		
		while (x != 0) {
			y += x;
			x = scan.nextInt();
		}
		
		System.out.println(y);
		scan.close();

	}

}
