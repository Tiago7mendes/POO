package Revisão.Prova.Ex1;

public class Main {
    public static void main(String[] args) {
        JogoDaVelha jogo = new JogoDaVelha();
        
        jogo.imprimir();
        jogo.jogar(1, 0, 'X');
        jogo.imprimir();
    }
}
