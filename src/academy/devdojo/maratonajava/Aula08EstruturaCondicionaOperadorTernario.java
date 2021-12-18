package academy.devdojo.maratonajava;

public class Aula08EstruturaCondicionaOperadorTernario {

    public static void main(String[] args) {

        double salario = 6000;

        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        String resultado;

        //Doar se salario maior que 5000

        if (salario > 5000) {
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);


        // Podemos utilizar o operador ternário
        // (condição) ? verdadeiro : falso
        resultado = (salario > 5000) ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);

        //Poderíamos fazer assim mais não é uma boa prática porque fica
        //difícil de entender
        System.out.println((salario > 5000) ? mensagemDoar : mensagemNaoDoar);

        //Ou até desta forma
        resultado = (salario > 5000) ? "Eu vou doar 500 pro DevDojo" : "Ainda não tenho condições, mas vou ter!";
        System.out.println(resultado);
    }
}
