public class Telefone {
    private String ddd;
    private String numero;
    
    public Telefone(String ddd, String numero) {
        this.ddd = ddd;
        this.numero = numero;
    }
    
    public String obterNumero() {
        return numero;
    }
    
    public String obterDDD() {
        return ddd;
    }
}

public class Cliente {
    private String nome;
    private String cpf;
    private Telefone telefone;
    
    public Cliente(String nome, String cpf, Telefone telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }
    
    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: (" + telefone.obterDDD() + ") " + telefone.obterNumero());
    }
    
    public void adicionarTelefone(String novoDdd, String novoNumero) {
        telefone = new Telefone(novoDdd, novoNumero);
    }
}
