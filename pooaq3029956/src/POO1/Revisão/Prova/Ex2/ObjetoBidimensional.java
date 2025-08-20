package Revisão.Prova.Ex2;

import Revisão.Prova.Ex2.GeometriaBidimensional;

public abstract class ObjetoBidimensional implements GeometriaBidimensional {
    
    private Ponto2D pontoA, pontoB;

    public ObjetoBidimensional(Ponto2D pontoA, Ponto2D pontoB) {
        setPontoA(pontoA);
        setPontoB(pontoB);
    }

    public Ponto2D getPontoA() {
        return pontoA;
    }

    public void setPontoA(Ponto2D pontoA) {
        if(pontoA != null){
            this.pontoA = pontoA;   
        }
    }

    public Ponto2D getPontoB() {
        return pontoB;
    }

    public void setPontoB(Ponto2D pontoB) {
        if(pontoB != null){
            this.pontoB = pontoB;   
        }
    }

    @Override
    public Ponto2D getCentro() {
        return pontoA.getPontoMedio(pontoB);
    }
    
    
    
}
