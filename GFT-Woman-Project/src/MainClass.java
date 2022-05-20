import Hospedagem.*;
import NumeroPar.NumeroPar;
import Produto.*;
import Suco.Suco;

public class MainClass {
    public static void main(String[] args) {

        System.out.println(" --------------- Números Pares --------------- ");
        NumeroPar numeroPar = new NumeroPar();
        numeroPar.numeroPar();
        System.out.println(" --------------- Hospedagem --------------- ");
        Hospedagem hospedagemComum = new HospedagemComum();
        Hospedagem hospedagemVip = new HospedagemVip();
        hospedagemComum.PrintValor();
        hospedagemVip.PrintValor(25);
        System.out.println(" --------------- Suco --------------- ");
        Suco suco = new Suco();
        System.out.println(suco.venderSuco());
        System.out.println(" --------------- Produtos --------------- ");
        Eletronico ventilador = new Eletronico("Ventilador", 320.00,3);
        Eletronico computador = new Eletronico("Computador", 3999.00, 2);
        Movel mesa = new Movel("Mesa", 270.00,2);
        Produto caderno = new Produto("Caderno",10.50,10);
        Movel cadeira = new Movel("Cadeira", 234.25,2);
        Produto caneta = new Produto("Caneta",0.70,15);
        Caixa caixa = new Caixa();
        caixa.getProdutos().add(computador);
        caixa.getProdutos().add(mesa);
        caixa.getProdutos().add(caderno);
        caixa.getProdutos().add(cadeira);
        caixa.getProdutos().add(caneta);
        caixa.calcularTotal();
    }
}
