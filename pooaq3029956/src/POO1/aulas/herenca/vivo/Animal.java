package aulas.herenca.vivo;

public class Animal extends SerVivo {
    
    public Animal() {
        super(true);
    }
    
    @Override
    protected String definicao() {
        return "É um animal.";
    }
}
