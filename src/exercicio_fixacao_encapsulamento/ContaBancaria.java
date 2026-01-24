package exercicio_fixacao_encapsulamento;

public class ContaBancaria {

	private String nome;
	private int numeroConta;
	//não precisaria declarar o depositoInicial
	//String depositoInicial;
	private double valorDeposito;
	
	//a taxa foi colocada o número direto no método e não foi criado a variável.
	private double taxaSaque = 5.00;
	
	public ContaBancaria() {
		
	}
	
	public ContaBancaria(String nome, int numeroConta, double valorDeposito) {
		this.nome = nome;
		this.numeroConta = numeroConta;
		// não precisa: this.depositoInicial = depositoInicial;
		// a forma com que eu fiz: this.valorDeposito = valorDeposito;
		// na correção, foi passado o método addDeposit com o parâmetro valorDeposito.
		addDeposit(valorDeposito);
	}

	public ContaBancaria(String nome, int numeroConta) {
		this.nome = nome;
		this.numeroConta = numeroConta;
		// não precisa: this.depositoInicial = depositoInicial;
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

	/*public String getDepositoInicial() {
		return depositoInicial;
	} não precisa deste método...*/

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
