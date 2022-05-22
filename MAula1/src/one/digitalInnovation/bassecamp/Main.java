package one.digitalInnovation.bassecamp;

public class Main {

    public static void main(String[] args) {
        //Calculadora
        System.out.println("Exercício calculadora");
        Calculadora.soma(5, 6);
        Calculadora.subtracao(9, 1.0);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);
        //Aqui estamos chamando os métodos (soma, multiplicação etc...) através da classe Calculadora, isto é,
        //chamamos as classes que está no mesmo pacote não precisando importa la.

        //Mensagem
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem( 5);
        Mensagem.obterMensagem( 1);
    }
}
