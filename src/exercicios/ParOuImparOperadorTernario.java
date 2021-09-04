package exercicios;

import java.util.Scanner;

public class ParOuImparOperadorTernario {
    public static void main(String[] args) {
        /**
         * Escreva uma algoritmo que mostre o resto da divisão de um número utilizando operador ternario.
         * Resto = 0 é par
         * Resto = 1 é impar
         */
        int result;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um numero para ser verificado se é PAR ou IMPAR: ");
        int numero = teclado.nextInt();
        numero %= 2;
        String resultado;
        resultado = numero == 0 ? "É PAR" : "É IMPAR";
        System.out.println(resultado);
    }
}
