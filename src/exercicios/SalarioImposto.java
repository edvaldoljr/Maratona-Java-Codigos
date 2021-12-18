package exercicios;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

/**
 * Construa um algoritmo que leia um salário, e mostar quanto tenho que pagar na Holanda em 2020
 * de imposto com base no meu salário anual
 * € 0        € 34.712   9.70%
 * € 34,712   € 68,587   37.35%
 * € 68,508              49.58%
 */
public class SalarioImposto {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o salario por favor: ");
        double salarioAnual = scan.nextDouble();
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.58 / 100;
        double valorImposto = 0;

        if (salarioAnual <= 34712) {
            salarioAnual *= primeiraFaixa;
        }else if (salarioAnual >= 34712 && salarioAnual <= 68587) {
            valorImposto = (salarioAnual * segundaFaixa);
        }else {
            valorImposto = (salarioAnual * terceiraFaixa);
        }
        System.out.printf("Valor do IMPOSTO: %.2f",valorImposto);
    }
}
