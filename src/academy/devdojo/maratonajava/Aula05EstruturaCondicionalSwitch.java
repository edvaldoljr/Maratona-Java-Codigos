package academy.devdojo.maratonajava;

import java.util.Scanner;

public class Aula05EstruturaCondicionalSwitch {

    //Imprima os dias da semana 1 como domingo
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um dia da semana em números");
        int dia = scanner.nextInt();

        switch (dia) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("Terça");
            case 4 -> System.out.println("Quarta");
            case 5 -> System.out.println("Quinta");
            case 6 -> System.out.println("Sexta");
            case 7 -> System.out.println("Sábado");
            default -> System.out.println("Opção invalida");
        }
    }
}
