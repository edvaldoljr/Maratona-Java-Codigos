package exercicios;

public class RelatorioFuncionario {
    /**
     * Crie um algoritmo que possua variaveis para salvar os seguintes dados: Nome,Endereco , sexo,
     * salario, idade e estado civil.
     * Emprima da seguinte forma:
     * O trabalhador <nome> com <idade> e <sexo>, <casado> com o salário de R$ " <salario>
     * encontra-se empregado neste estabelecimento.")
     */
    public static void main(String[] args) {
        String name = "Edvaldo Junior";
        String sexo = "M";
        double salario = 2000D;
        int idade = 27;
        boolean estadoCivil = true;
        System.out.println("O trabalhador " + name + " com idade de " + idade + " sexo " + sexo + " casado:  " + estadoCivil + " com o salário de R$ " +
                salario + " \n encontra-se empregado neste estabelecimento.");
    }
}
