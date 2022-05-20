package Hospedagem;

public abstract class Hospedagem {
    double valor = 100.00;

    public void PrintValor(){
        System.out.println("Valor da Hospedagem:" + this.valor);
    }

    public abstract void PrintValor(int adicional);
}
