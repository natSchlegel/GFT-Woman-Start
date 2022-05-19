package Produto;

public class Eletronico extends Produto{

    public Eletronico(String nome, double valor, int quantidade) {
        super(nome, valor, quantidade);
    }

    @Override
    public double calcularValorFinal(){
        return (valor * quantidade) * 1.15;
    }
}
