package aulas.polimorfismo.interface_;

import java.io.Serializable; // ele serve para q a jvm saiba que o objeto pode ser dividido em partes, deixando ter varias classes

public class Boleto implements Pagavel, Serializable{
    
    private String beneficiario;
    private double valorPagar;

    public Boleto(String beneficiario, double valorPagar) {
        setBeneficiario(beneficiario);
        setValorPagar(valorPagar);
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        if(valorPagar >= 0){
            this.valorPagar = valorPagar;
        }
    }
    
    @Override
    public String getDescricao(){
        return getBeneficiario();
    }
    
    @Override
    public double getValor(){
        return getValorPagar();
    }
    
}
