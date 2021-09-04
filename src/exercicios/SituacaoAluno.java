package exercicios;

import java.util.Scanner;

public class SituacaoAluno {
    public static void main(String[] args) {
        /**
         * Escreva um algoritmo que leia nota1 e nota2 divida por 2 e mostre a real situação do aluno
         */
        Scanner teclado = new Scanner(System.in);
        float nota1, nota2, media;
        System.out.println("-----------------------");
        System.out.println(" ESCOLA DEV DOJO ");
        System.out.println("-----------------------");
        System.out.print("Primeira Nota: ");
        nota1 = teclado.nextFloat();
        System.out.print("Segunda Nota: ");
        nota2 = teclado.nextFloat();
        media = (nota1 + nota2)/2;
        System.out.println("-----------------------");
        System.out.printf("MEDIA: %.1f", media );
        if (media >= 9  && media < 10){
            System.out.println(" APROVEITAMENTO: A ");
        } else if (media >= 8 && media < 9 ){
            System.out.println(" APROVEITAMENTO: B ");
        }else if (media >= 7 && media < 8){
            System.out.println(" APROVEITAMENTO: C ");
        }else if (media >= 6 && media < 7 ){
            System.out.println(" APROVEITAMENTO: D ");
        }else if (media >= 5 && media < 6 ){
            System.out.println(" APROVEITAMENTO: E ");
        }else {
            System.out.println(" APROVEITAMENTO: F ");
        }
    }
}
