package academy.devdojo.maratonajava;

public class EstruturaCondicionalIfElse {
    public static void main(String[] args) {
        int idade = 18;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcólica");
        } else {
            System.out.println("negado");
        }
    }
}
