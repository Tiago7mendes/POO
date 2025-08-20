package POO2.aulas.classe.especial.enumerador;

public class FormaGeometricaA {
    
    public enum Cor {VERMELHO, VERDE, AZUL, BRANCO, PRETO, ROSA}; // é tratado como constante
    
    public static final int Amarelo = 1;
    
    private Cor corPreenchimento; // nao tem como dar um new cor, pois ele ja existe e é contanste
    private Cor corBorda; // é abstrato

    public FormaGeometricaA(Cor corPreenchimento, Cor corBorda) {
        setCorBorda(corBorda);
        setCorPreenchimento(corPreenchimento);
        
    }

    public Cor getCorPreenchimento() {
        return corPreenchimento;
    }

    public void setCorPreenchimento(Cor corPreenchimento) {
        this.corPreenchimento = corPreenchimento;
    }

    public Cor getCorBorda() {
        return corBorda;
    }

    public void setCorBorda(Cor corBorda) {
        this.corBorda = corBorda;
    }
    
    
}
