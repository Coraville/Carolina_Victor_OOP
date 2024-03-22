package lista;

public class Transferencia {
	
	public void transferir(Cliente c1, Cliente c2, double quantia) {
        if (c2.checarSaldo() >= quantia) {
            c2.sacar(quantia);
            c1.depositar(quantia);
            System.out.println("Transferência de R$" + quantia + " realizada com sucesso.");
            System.out.println("De " + c2.obterNome() + " para " + c1.obterNome());
        } else {
            System.out.println("Saldo insuficiente para realizar a transferência.");
        

    		}
	}
}
