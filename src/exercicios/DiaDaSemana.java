package exercicios;

import java.util.Scanner;

public class DiaDaSemana {

    public static void main(String[] args) {

        //Utilizando switch
        //Dados os valores de 1 a 7, imprima se é dia util ou finalde semana
        //Considerando 1 como dominfo
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero da semana");
        byte num = scanner.nextByte();

        switch (num) {
            case 1,7 -> System.out.println("Final de semana");
            case 2,3,4,5,6 -> System.out.println("Dia útil");
            default -> System.out.println("Opção inválida");
        }
    }
}

