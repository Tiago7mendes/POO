package aulas.herenca.vivo;

public class Vegetal extends SerVivo {
    
    private String localizacao;
    
    public Vegetal( String localizacao ) {
        super(false);
        setLocalizacao(localizacao);
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
    @Override 
    protected String definicao() {
        return "É um vegetal. " + super.definicao();
    }
}
