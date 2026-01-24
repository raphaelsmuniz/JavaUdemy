package exercicio_fixacao_encapsulamento;

public class ContaBancaria2 {

	private int numeroConta;
	String nomeTitConta;
	private double valorConta;
	private double taxaConta = 5.00;
	
	public ContaBancaria2(int numeroConta, String nomeTitConta, double valorConta) {
		this.numeroConta = numeroConta;
		this.nomeTitConta = nomeTitConta;
		this.valorConta = valorConta;
	}
	
	public ContaBancaria2(int numeroConta, String nomeTitConta) {
		this.numeroConta = numeroConta;
		this.nomeTitConta = nomeTitConta;
	}
	
	public double getValorConta(double valorConta) {
		return this.valorConta = valorConta;
	}

	public void setValorConta(double valorConta) {
		this.valorConta = valorConta;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNomeTitConta() {
		return nomeTitConta;
	}

	public void addDepositoConta(double valorConta) {
		this.valorConta += valorConta;
	}
	
	public void saqueConta(double valorConta) {
		this.valorConta -= valorConta + taxaConta;
	}

	public String toString() {
		return "Número da conta: " + numeroConta 
				+ ", Nome do titular: " + nomeTitConta 
				+ ", Valor da conta: " + String.format("%.2f%n", getValorConta(valorConta));
	}
	
	
	
}
