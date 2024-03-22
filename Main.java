package lista;

public class Main {

    public static void main(String[] args) {
        
        Cliente c = new Cliente("Victor", 60000.0, 20000.0);
        
        System.out.println("Nome do cliente: " + c.obterNome());
        System.out.println("Saldo + Limite do cliente: R$ " + c.checarSaldo());
        
        c.sacar(15000.0);
        c.depositar(25000.0);
        
        System.out.println("Saldo + Limite após operações: R$ " + c.checarSaldo());
        
        Transferencia transferencia = new Transferencia();
        
        Cliente c1 = new Cliente("João", 1000.0, 500.0);
        Cliente c2 = new Cliente("Maria", 1500.0, 300.0);
        
        System.out.println("Saldo + Limite de " + c1.obterNome() + ": R$" + c1.checarSaldo());
        System.out.println("Saldo + Limite de " + c2.obterNome() + ": R$" + c2.checarSaldo());

        transferencia.transferir(c1, c2, 700.0);
        System.out.println("Saldo + Limite de " + c1.obterNome() + " após transferência: R$" + c1.checarSaldo());
        System.out.println("Saldo + Limite de " + c2.obterNome() + " após transferência: R$" + c2.checarSaldo());
        
  
        Telefone telefone1 = new Telefone("11", "99999-9999");

        Cliente cliente1 = new Cliente("João", "123.456.789-00", telefone1);

        cliente1.mostrarDados();

        cliente1.adicionarTelefone("13", "88888-8888");
    
        cliente1.mostrarDados();
    }
}

