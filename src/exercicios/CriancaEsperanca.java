package exercicios;

import java.util.Scanner;

public class CriancaEsperanca {
    public static void main(String[] args) {
        int d;
        double valor = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("---------------------------");
        System.out.println("     CRIANÇA ESPERANÇ2A     ");
        System.out.println("---------------------------");
        System.out.println(" Muito obrigado por ajudar ");
        System.out.println(" [1] Para doar R$10 ");
        System.out.println(" [2] Para doar R$25 ");
        System.out.println(" [3] Para doar R$50 ");
        System.out.println(" [4] Para doar outros valores ");
        System.out.println(" [5] Para cancelar ");
        System.out.print("Digite a opcão desejada: ");
        d = teclado.nextInt();
        if (d == 1) {
            valor = 10;
        } else if (d == 2) {
            valor = 25;
        } else if (d == 3) {
            valor = 50;
        } else if (d == 4) {
            System.out.println("Qual o valor da doacao? R$");
            valor = teclado.nextDouble();
        } else {
            valor = 0;
        }
        System.out.println("------------------------");
        System.out.println(" SUA DOACAO FOI DE R$" + valor);
        System.out.println(" MUITO OBRIGADO!");
        System.out.println("------------------------");
    }
}
