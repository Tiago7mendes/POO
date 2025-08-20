package aulas.classe.basico;

public class Pessoa {
    
    // atributos 
    public double altura;
    public char sexo;
    public double pesoIdeal;
    
    // construtor padrão (se não exixtir o JVM cria), aloca memoria para os atributos
    /*public Pessoa() {
    }*/
    
    // construtor persolizado, com inicialização de atributos por passagem de paremetros
    public Pessoa (double a, char s){
        altura = a;
        sexo = s;
        calcularPesoIdeal();
    }
    
    // métodos (operações)    
    public void calcularPesoIdeal(){
            if ((sexo == 'F') || (sexo == 'f')){
                
                pesoIdeal = (62.1 * altura) - 44.7;
                
            }
            else{
                if ((sexo == 'M') || (sexo == 'm')){
                    
                    pesoIdeal = (72.7 * altura) - 58.0;
                    
                }
            }
    }
       
}