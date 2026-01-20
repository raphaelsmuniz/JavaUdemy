package secao06;

import java.util.Scanner;

public class Exec01 {

	public static void main(String[] args) {

		int senha;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a senha: ");
		senha = scan.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha inválida...");
			
			System.out.print("Digite a senha novamente: ");
			senha = scan.nextInt();
		}
		
		System.out.println("Acesso permitido...");
		
		scan.close();

	}

}
