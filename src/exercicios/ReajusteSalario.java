package exercicios;

import java.util.Scanner;

public class ReajusteSalario {
    public static void main(String[] args) {

        //Escreva um algoritmo que leia uma variavel <salario> e mostre o valor do salario com reajuste de 10%

        Scanner teclado = new Scanner(System.in);
        double salario;
        double reajuste;
        System.out.print("Digite o salário: ");
        salario = teclado.nextDouble();
        reajuste = salario + (salario * 0.1);
        System.out.println(" O salario é R$: " + salario + " Reais e com reajuste de 10% fica em R$: " + reajuste + " Reais");
    }
}

