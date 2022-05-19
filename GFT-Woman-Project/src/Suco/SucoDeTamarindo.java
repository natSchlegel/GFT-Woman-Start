package Suco;

public class SucoDeTamarindo {
    static double preco = 6.50; //preco ficticio para testes
    public static double calcularDesconto(int litros){
        if(litros <= 2){
            return litros * preco * 0.96;
        } else if(litros > 5){
            return litros * preco * 0.94;
        }
        return preco;
    }
}
