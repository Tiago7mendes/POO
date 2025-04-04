package ex9_19;

public class Main {
    public static void main(String[] args) {
        Lampada lampadaIncandescente = new LampadaIncandescente();

        lampadaIncandescente.acende();
        lampadaIncandescente.mostraEstado();
        lampadaIncandescente.apaga();
        lampadaIncandescente.mostraEstado();

        LampadaDeNatal lampadaDeNatal = new LampadaDeNatal("Azul");

        lampadaDeNatal.acende();
        lampadaDeNatal.mostraEstado(); 

        lampadaDeNatal.apaga();
        lampadaDeNatal.mostraEstado();

        lampadaDeNatal.setCor("Vermelho");
        lampadaDeNatal.acende();
        lampadaDeNatal.mostraEstado(); 
    }
}
