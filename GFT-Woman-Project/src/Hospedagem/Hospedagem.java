package Hospedagem;

/*
Faça um programa onde tenha uma classe chamada Hospedagem, que
possui um valor em reais e um método printValor(). Crie uma classe
HospedagemVIP, que herda de Hospedagem e possui um valor adicional.
Crie um método que retorne o valor do HospedagemVIP (com o adicional
incluído). Crie um programa para criar as instâncias de Hospedagem e
HospedagemVIP, mostrando a diferença de preços. (vale 2 pontos)

 */

public abstract class Hospedagem {
    double valor = 100.00;

    public void PrintValor(){
        System.out.println("Valor da Hospedagem:" + this.valor);
    }

    public abstract void PrintValor(int adicional);
}
