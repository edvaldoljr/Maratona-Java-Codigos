package exercicios;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        /**
         * Escreva uma algoritmo que mostre o resto da divisão de um número.
         * Resto = 0 é par
         * Resto = 1 é impar
         */
        int result;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um numero para ser verificado se é PAR ou IMPAR: ");
        int numero = teclado.nextInt();
        numero %= 2;
        String resultado;

        if (numero == 0) {
            System.out.println("É PAR");
        } else {
            System.out.println("É IMPAR");
        }

        //Podemos usar um operador ternario inves do if else.
    }
}
