package Suco;

import java.util.Scanner;

public class Suco {
    Scanner sc = new Scanner(System.in);
    boolean aux = true;
    int litros;
    double preco;
    char sabor;

    public String venderSuco() {
       System.out.println("Quantos litros de suco deseja comprar:");
       litros = sc.nextInt();
       System.out.println("Qual será o sabor? L-limão T-tamarindo");
       sabor = sc.next().toUpperCase().charAt(0);
       switch (sabor) {
           case 'L':
               preco = SucoDeLimao.calcularDesconto(litros);
               break;
           case 'T':
               preco = SucoDeTamarindo.calcularDesconto(litros);
               break;
       }
       return "O preço do suco é: " + String.format("%.2f",preco);
    }
}
