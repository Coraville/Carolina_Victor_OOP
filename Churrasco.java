public class Churrasco {
    private double qtdCarne;
    
    public void verificarConsumo(Pessoas pessoas) {
        if (pessoas.getIdade() >= 4 && pessoas.getIdade() <= 12 && !pessoas.isVegetariana()) {
            qtdCarne = 1.0;
        } else if (pessoas.getIdade() >= 13 && !pessoas.isVegetariana()) {
            qtdCarne = 2.0; 
        } else {
            qtdCarne = 0.0; 
        }
    }
    
    public double getQtdCarne() {
        return qtdCarne;
    }
}
