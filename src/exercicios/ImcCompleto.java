package exercicios;

import java.util.Scanner;

public class ImcCompleto {
    public static void main(String[] args) {

        // imc = massa / Math.pow(altura, 2);
        // Para calcular uma potência, você deve usar o método pow da classe Math do pacote
        // lang, ou seja, para calcular xy, você escreve Math.pow(x, y)

        double massa, altura, imc;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Vamos Verificar seu IMC \n");
        System.out.print("Massa (kg): ");
        massa = teclado.nextDouble();
        System.out.print("Altura (m): ");
        altura = teclado.nextDouble();
        imc = massa / Math.pow(altura, 2);
        System.out.printf("IMC %.1f ", imc);
        if (imc < 17) {
            System.out.println("Muito abaixo do Peso");
        } else if (imc >= 17 && imc < 18.5) {
            System.out.println("Abaixo so Peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso ideal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Obesidade");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Obesidade Severa");
        } else {
            System.out.println("Obesidade Morbida");
        }
    }
}
