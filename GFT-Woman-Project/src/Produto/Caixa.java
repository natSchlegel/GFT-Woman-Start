package Produto;

import java.util.ArrayList;
import java.util.List;

public class Caixa {
    List<Produto> produtos = new ArrayList<>();

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void calcularTotal(){
        for(int i = 0; i < produtos.size(); i++){
            System.out.println("Nome do Produto: " + getProdutos().get(i).nome +
                    "\n Valor do Produto: " + String.format("%.2f", getProdutos().get(i).valor) +
                    "\n Quantidade do produto: " + getProdutos().get(i).quantidade +
                    "\n Valor Final: " + String.format("%.2f",getProdutos().get(i).calcularValorFinal()) +
                    "\n------------------------------");
        }
    }
}
