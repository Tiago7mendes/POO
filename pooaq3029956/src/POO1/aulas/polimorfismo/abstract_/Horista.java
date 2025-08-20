package aulas.polimorfismo.abstract_;

public class Horista extends Empregado{
    
    private int horasTrabalhada;
    private double valorHora;
    
    public Horista(String nome, String cpf, int horasTrabalhada, double valorHora){
        super(nome, cpf);
        setHorasTrabalhada(horasTrabalhada);
        setValorHora(valorHora);
    }

    public int getHorasTrabalhada() {
        return horasTrabalhada;
    }

    public void setHorasTrabalhada(int horasTrabalhada) {
        if(horasTrabalhada > 0){
            this.horasTrabalhada = horasTrabalhada;
        }
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        if(valorHora > 0){
            this.valorHora = valorHora;
        }
    }
    
    @Override
    public double proventoSemanal(){
        double valor = 0;
        
        if(getHorasTrabalhada() > 40){
            valor = 40 * getValorHora();
            valor += ( getHorasTrabalhada() - 40 ) * ( getValorHora() * 1.50 );
            
        }else{
            valor = getHorasTrabalhada() * getValorHora();
        }
        
        return valor;
    }
}
