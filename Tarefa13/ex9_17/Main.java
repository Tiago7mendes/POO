package ex9_17;

public class Main {
    public static void main(String[] args) {
        Ponto2D p1 = new Ponto2D(0, 0);
        Ponto2D p2 = new Ponto2D(4, 3);
        ObjetoGeometrico retangulo = new Retangulo(p1, p2);

        System.out.println(retangulo);
    }

    // a classe ObjetoGeometrico implemta o metodo toString(), no entanto a classe Retangulo que implementa ObjetoGeometrico nao
    // Contudo nao apresenta erro porque a classe Retangulo utiliza o metodo toString() da classe Object
}
