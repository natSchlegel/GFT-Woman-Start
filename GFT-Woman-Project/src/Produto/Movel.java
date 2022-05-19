package Produto;

public class Movel extends Produto{

    public Movel(String nome, double valor, int quantidade) {
        super(nome, valor, quantidade);
    }

    @Override
    public double calcularValorFinal(){
        if(quantidade < 10) {
            return (valor * quantidade) * 1.11;
        } else if (quantidade >= 10) {
            return (valor * quantidade) * 1.05;
        }
        return valor * quantidade;
    }
}
