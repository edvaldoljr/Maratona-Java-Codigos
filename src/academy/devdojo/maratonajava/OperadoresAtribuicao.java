package academy.devdojo.maratonajava;

public class OperadoresAtribuicao {
    public static void main(String[] args) {
        // =, ++, --, -=, +=, *=, /=, %=
        int salario = 1000;

        int salario1 = salario + 1000;

        int salario2 = 1000;
        salario2 += 1000;

        int salario3 = 1000;
        salario3 -= 1000;

        int salario4 = 1000;
        salario4 *= 1000;

        int salario5 = 1000;
        salario5 /= 1000;

        int salario6 = 10;
        salario6 %= 5;

        int salario7 = 1000;
        salario7 ++;

        System.out.println("= " + salario);
        System.out.println(" salario + 1000 " + salario1);
        System.out.println("+= " + salario2);
        System.out.println("-= " + salario3);
        System.out.println("*= " + salario4);
        System.out.println("/= " + salario5);
        System.out.println("%= " + salario6);
        System.out.println("==" + salario7);
    }
}
