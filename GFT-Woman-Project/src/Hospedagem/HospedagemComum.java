package Hospedagem;

public class HospedagemComum extends Hospedagem{
    @Override
    public void PrintValor(int adicional) {
        System.out.println("Valor da Hospedagem: " + super.valor);
    }
}
