package exercicios;

import java.util.Scanner;

public class PorcentagemDoSalario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o salario do funcionário");
        double salario = teclado.nextInt();
        salario = salario + (salario * 0.1);
        System.out.println(salario);
    }
}
