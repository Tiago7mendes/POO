package aulas.polimorfismo.interface_;

// Assalariado herda os medotos concretos e abstratros de empregado, inclusive os assinados na interface Pagavel pois empregado "implements" a interface Pagavel
public class Assalariado extends Empregado {
    // voce é obrigado a chamar o metodo proventoSemanal() pois ele é abstratato e a classe assalariado nao é abstract, se fosse nao precisava
    
    private double salario; // mensal
    
    public Assalariado(String nome, String cpf, double salario){
        super(nome, cpf);
        setSalario(salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario > 0){
            this.salario = salario;
        }
    }
    
    @Override
    public double proventoSemanal(){
        return getSalario() / 4.0;
    }
    
    //metodo abstrato definido na interface Pagavel
    @Override
    public double getValor(){
        return proventoSemanal();
    }
    
}
