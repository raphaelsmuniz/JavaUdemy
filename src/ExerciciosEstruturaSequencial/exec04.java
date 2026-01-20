package ExerciciosEstruturaSequencial;

public class exec04 {

	public static void main(String[] args) {

		int numeroFun1 = 25;
		int numeroFun2 = 1;
		int numeroFun3 = 6;
		
		int horasFun1 = 100;
		int horasFun2 = 200;
		int horasFun3 = 145;
		
		double vlhoraFun1 = 5.50;
		double vlhoraFun2 = 20.50;
		double vlhoraFun3 = 15.55;
		
		double salFun1;
		double salFun2;
		double salFun3;
		
		salFun1 = (double) horasFun1 * vlhoraFun1;
		salFun2 = (double) horasFun2 * vlhoraFun2;
		salFun3 = (double) horasFun3 * vlhoraFun3;
		
		System.out.printf("O colaborador %d fez %d horas e o valor de sua hora trabalhada é R$ %.2f. Com isso o seu salário deste mês é R$ %.2f.%n", numeroFun1, horasFun1, vlhoraFun1, salFun1);
		System.out.printf("O colaborador %d fez %d horas e o valor de sua hora trabalhada é R$ %.2f. Com isso o seu salário deste mês é R$ %.2f.%n", numeroFun2, horasFun2, vlhoraFun2, salFun2);
		System.out.printf("O colaborador %d fez %d horas e o valor de sua hora trabalhada é R$ %.2f. Com isso o seu salário deste mês é R$ %.2f.%n", numeroFun3, horasFun3, vlhoraFun3, salFun3);

	}

}
