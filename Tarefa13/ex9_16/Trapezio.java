package ex9_16;

public class Trapezio implements ObjetoGeometrico {
    private Ponto2D baseMenorInicio, baseMenorFim;
    private Ponto2D baseMaiorInicio, baseMaiorFim;

    public Trapezio(Ponto2D baseMenorInicio, Ponto2D baseMenorFim, Ponto2D baseMaiorInicio, Ponto2D baseMaiorFim) {
        setBaseMaiorFim(baseMaiorFim);
        setBaseMaiorInicio(baseMaiorInicio);
        setBaseMenorFim(baseMenorFim);
        setBaseMenorInicio(baseMenorInicio);
    }

    public Ponto2D getBaseMenorInicio() {
        return baseMenorInicio;
    }

    public void setBaseMenorInicio(Ponto2D baseMenorInicio) {
        this.baseMenorInicio = baseMenorInicio;
    }

    public Ponto2D getBaseMenorFim() {
        return baseMenorFim;
    }

    public void setBaseMenorFim(Ponto2D baseMenorFim) {
        this.baseMenorFim = baseMenorFim;
    }

    public Ponto2D getBaseMaiorInicio() {
        return baseMaiorInicio;
    }

    public void setBaseMaiorInicio(Ponto2D baseMaiorInicio) {
        this.baseMaiorInicio = baseMaiorInicio;
    }

    public Ponto2D getBaseMaiorFim() {
        return baseMaiorFim;
    }

    public void setBaseMaiorFim(Ponto2D baseMaiorFim) {
        this.baseMaiorFim = baseMaiorFim;
    }

    @Override
    public Ponto2D centro() {
        double centroX = (baseMenorInicio.getX() + baseMenorFim.getX() +
                          baseMaiorInicio.getX() + baseMaiorFim.getX()) / 4.0;
        double centroY = (baseMenorInicio.getY() + baseMenorFim.getY() +
                          baseMaiorInicio.getY() + baseMaiorFim.getY()) / 4.0;
        return new Ponto2D(centroX, centroY);
    }

    @Override
    public double calculaArea() {
        double baseMaior = Math.abs(baseMaiorFim.getX() - baseMaiorInicio.getX());
        double baseMenor = Math.abs(baseMenorFim.getX() - baseMenorInicio.getX());
        double altura = Math.abs(baseMaiorInicio.getY() - baseMenorInicio.getY());
        return ((baseMaior + baseMenor) * altura) / 2.0;
    }

    @Override
    public double calculaPerimetro() {
        double lado1 = baseMenorInicio.distancia(baseMaiorInicio);
        double lado2 = baseMenorFim.distancia(baseMaiorFim);
        double baseMaior = baseMaiorInicio.distancia(baseMaiorFim);
        double baseMenor = baseMenorInicio.distancia(baseMenorFim);
        return lado1 + lado2 + baseMaior + baseMenor;
    }

    @Override
    public String toString() {
        return "Trapézio com base menor entre " + baseMenorInicio + " e " + baseMenorFim +
               ", base maior entre " + baseMaiorInicio + " e " + baseMaiorFim;
    }
}
