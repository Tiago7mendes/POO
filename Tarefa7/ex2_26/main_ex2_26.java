package ex2_26;

public class main_ex2_26 {
    public static void main(String[] args) {
        Ponto2D ponto1 = new Ponto2D(1,3);
        Ponto2D ponto2 = new Ponto2D(2, 1);

        Linha2D linha = new Linha2D(ponto1, ponto2);

        linha.calcularLinha();
    }
}
