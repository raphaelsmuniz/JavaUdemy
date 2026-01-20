import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {

		/*Scanner scan = new Scanner(System.in);
		
		String x;
		char y;
		
		x = scan.next();
		y = scan.next().charAt(1); //função "charAt" vai pegar um caracter da palavra que digitar.
		
		System.out.println("Você digitou: " + x);
		System.out.println("o caracter é: " + y);
		
		scan.close();*/
		String s1, s2, s3;
		int x;
		
		Scanner scan = new Scanner(System.in);
		
		x = scan.nextInt();
		scan.nextLine();
		//nextLine() lê a linha inteira
		s1 = scan.nextLine();
		s2 = scan.nextLine();
		s3 = scan.nextLine();
		
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		scan.close();

	}

}
