public class Main {
    public static void main(String[] args) {
        Telefone telefone1 = new Telefone("13", "9742-9999");
        Cliente cliente1 = new Cliente("Carol", "123.456.789-00", telefone1);
	    
        cliente1.mostrarDados();
	    
        cliente1.adicionarTelefone("11", "8745-8888");
	    
        cliente1.mostrarDados();
    }
}
