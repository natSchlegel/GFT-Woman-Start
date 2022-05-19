package Hospedagem;

public class HospedagemVip extends Hospedagem{

    @Override
    public void PrintValor(int adicional) {
        System.out.println("Valor da Hospedagem: " + (super.valor + adicional));
    }
}
