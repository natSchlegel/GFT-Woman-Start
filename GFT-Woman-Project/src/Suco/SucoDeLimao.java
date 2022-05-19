package Suco;

import org.w3c.dom.ls.LSOutput;

public class SucoDeLimao {
    static double preco = 4.50; //preco ficticio para testes

    public static double calcularDesconto(int litros){
        if(litros <= 2){
            return litros * preco * 0.97;
        } else if(litros > 5){
            return litros * preco * 0.95;
        }
        return preco;
    }
}
