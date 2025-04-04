package ex9_15;

public class Quadrado extends Retangulo {

    
    public Quadrado(Ponto2D cantoInferiorEsquerdo, double lado) {
        super(cantoInferiorEsquerdo, new Ponto2D(cantoInferiorEsquerdo.getX() + lado, cantoInferiorEsquerdo.getY() + lado));
    }

    @Override
    public String toString() {
        double lado = Math.abs(getPrimeiroCanto().getX() - getSegundoCanto().getX());
        return "Quadrado com canto inferior esquerdo em " + getPrimeiroCanto() + 
               " e lado de comprimento " + lado;
    }
}
