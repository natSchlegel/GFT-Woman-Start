package NumeroPar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumeroPar{
    Scanner sc = new Scanner(System.in);
    int pares = 0;
    Integer numero;

    public void numeroPar() {


        try {
            System.out.println("Insira um número:");
            numero = sc.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println("Por favor insira um número");
            sc.nextLine();
            System.out.println("Insira um número:");
            numero = sc.nextInt();
        }
        if (numero >= 1000 && numero <= 9999) {
            String numeroString = Integer.toString(numero);
            for (int i = 0; i < numeroString.length(); i++) {
                int digito = Character.getNumericValue(numeroString.charAt(i));
                if (digito % 2 == 0) {
                    pares++;
                }
            }
            System.out.println("O número possui " + pares + " par(es).");
        } else {
            System.out.println("O número precisa ter quatro dígitos");
            numeroPar();
        }
    }
}
