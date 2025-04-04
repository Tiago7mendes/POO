package ex9_17;

class Retangulo implements ObjetoGeometrico {
    private Ponto2D primeiroCanto, segundoCanto;

    public Retangulo(Ponto2D pc, Ponto2D sc) {
        primeiroCanto = pc;
        segundoCanto = sc;
    }

    public Ponto2D centro() {
        double coordX = (primeiroCanto.getX() + segundoCanto.getX()) / 2.0;
        double coordY = (primeiroCanto.getY() + segundoCanto.getY()) / 2.0;
        return new Ponto2D(coordX, coordY);
    }

    public double calculaArea() {
        double ladoX = Math.abs(primeiroCanto.getX() - segundoCanto.getX());
        double ladoY = Math.abs(primeiroCanto.getY() - segundoCanto.getY());
        return ladoX * ladoY;
    }

    public double calculaPerimetro() {
        double ladoX = Math.abs(primeiroCanto.getX() - segundoCanto.getX());
        double ladoY = Math.abs(primeiroCanto.getY() - segundoCanto.getY());
        return 2 * (ladoX + ladoY);
    }

    // O método toString foi removido de propósito
    // a classe ObjetoGeometrico implemta o metodo toString(), no entanto a classe Retangulo que implementa ObjetoGeometrico nao
    // Contudo nao apresenta erro porque a classe Retangulo utiliza o metodo toString() da classe Object
}
