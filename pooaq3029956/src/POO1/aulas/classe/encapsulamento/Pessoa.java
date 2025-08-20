package aulas.classe.encapsulamento;

public class Pessoa {
    
    // modificador de acesso privado
    private double altura;
    private char sexo;
    private double pesoIdeal;

    public Pessoa(double a, char b) {
        altura = a;
        sexo = b;
        calcularPesoIdeal();
    }
    
    // método (dinâmica) de consulta/acesso ao atributo altura
    public double getAltura() {
        return altura;
    }
    public char getSexo() {
        return sexo;
    }
    public double getPesoIdeal() {
        return pesoIdeal;
    }
    
    // métodos (operações)    
    private void calcularPesoIdeal(){
        
        double resultado = 0;
        
            if ((sexo == 'F') || (sexo == 'f')){
                
                resultado = (62.1 * altura) - 44.7;
                
            }
            else{
                if ((sexo == 'M') || (sexo == 'm')){
                    
                    resultado = (72.7 * altura) - 58.0;
                    
                }
            }
            
            setPesoIdeal(resultado);
    }
    
    // método (dinâmica) de modificação do atributo altura
    public void setAltura(double a) {
        altura = a;
        calcularPesoIdeal();
    }
    
    public void setSexo(char s) {
        sexo = s;
        calcularPesoIdeal();
    }
    
    private void setPesoIdeal(double p) {
        if( p > 0){
            pesoIdeal = p;
        }
    }
}