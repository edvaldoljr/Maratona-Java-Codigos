package exercicios;
import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i,n;

        System.out.printf("Informe o número para a tabuada:\n");
        i = teclado.nextInt();

        System.out.printf("\n+--Resultado--+\n");
        for (n=1; n<=10; n++){
            System.out.printf("| %2d * %d = %2d |\n",n, i, (n*i) );
        }
        System.out.printf("+-------------+\n");
    }
}
