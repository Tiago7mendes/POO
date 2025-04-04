package ex2_27;

public class main_ex2_27 {
    public static void main(String[] args) {
        Ponto2D pont1 = new Ponto2D(2, 4);
        Ponto2D pont2 = new Ponto2D(1, 5);

        Retangulo ret = new Retangulo(pont1, pont2);

        ret.imprimirRetangulo();
    }
    
}
