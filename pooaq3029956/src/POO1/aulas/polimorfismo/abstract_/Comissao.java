package aulas.polimorfismo.abstract_;

public class Comissao extends Empregado{
    private double valorVendas;
    private double porcentagem;

    public Comissao(String nome, String cpf, double valorVendas, double porcentagem) {
        super(nome, cpf);
        setValorVendas(valorVendas);
        setPorcentagem(porcentagem);
    }
    
    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        if(valorVendas > 0){
            this.valorVendas = valorVendas;
        }
    }

    public double getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(double porcentagem) {
        if( (porcentagem >= 0.0) && (porcentagem <= 100.0)){
            this.porcentagem = porcentagem;
        }
    }

    @Override
    public double proventoSemanal() {
        return getValorVendas() * ( getPorcentagem() / 100.0);
    }
}
