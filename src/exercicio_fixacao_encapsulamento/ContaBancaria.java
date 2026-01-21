package exercicio_fixacao_encapsulamento;

public class ContaBancaria {

	private String nome;
	private int numeroConta;
	String depositoInicial;
	private double valorDeposito;
	private double taxaSaque = 5.00;
	
	public ContaBancaria() {
		
	}
	
	public ContaBancaria(String nome, int numeroConta, String depositoInicial, double valorDeposito) {
		this.nome = nome;
		this.numeroConta = numeroConta;
		this.depositoInicial = depositoInicial;
		this.valorDeposito = valorDeposito;
	}

	public ContaBancaria(String nome, int numeroConta, String depositoInicial) {
		this.nome = nome;
		this.numeroConta = numeroConta;
		this.depositoInicial = depositoInicial;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getDepositoInicial() {
		return depositoInicial;
	}

	public double getValorDeposito(double valorDeposito) {
		return this.valorDeposito = valorDeposito;
	}
	
	public void addDeposit(double valorDeposito) {
		this.valorDeposito += valorDeposito;
	}
	
	public void withdrawDeposit(double valorDeposito) {
		this.valorDeposito -= valorDeposito + taxaSaque;
	}

	public String toString() {
		return "Correntista: " + nome 
				+ ", Número da Conta: " + numeroConta 
				+ ", Valor da conta: R$ " 
				+ String.format("%.2f", getValorDeposito(valorDeposito));
	}
	
	
	
}
