package exec02_func_secao08;

public class Funcionario {

	public String nome;
	public double salarioBruto;
	public double imposto;
	public double porcentagem;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	public void aumentoSalario(double porcentagem) {
		this.porcentagem = ((salarioBruto * porcentagem) /100) + salarioBruto - imposto; 
	}
	public String toString() {
		return "Dados atualizados: " + nome
				+ ", R$ "
				+ String.format("%.2f", porcentagem);
	}
}
