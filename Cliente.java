public class Cliente {
	
	private String nome;
	private double saldo, limite;
	
	public Cliente(String nome, double saldo, double limite) {
		
		this.nome = nome;
		this.saldo = saldo;
		this.limite = limite;
	}
	
	public void sacar(double valor) {
		
		if(saldo + limite >= valor) {
			saldo -= valor;
			System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
		}
		else {
			System.out.println("Saldo insulficiente!");
		}
		
	}
	
	public void depositar(double valor) {
		
		saldo += valor;
		System.out.println("Deposito no valor de R$ " + valor + " efetuado com sucesso.");
		
	}
	
	public double checarSaldo(){
		
		return saldo + limite;
		
	}
	
	public String obterNome() {
		
		return nome;
		
	}

}
