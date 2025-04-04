package aq3029956p1;

public class Estacionamento {
    private String nome, endereco, telefone;
    private double valor;
    private Veiculo vaga1, vaga2, vaga3, vaga4, vaga5;
    
    public Estacionamento(String n, String e, String t, double vl){
        setNome(n);
        setEndereco(e);
        setTelefone(t);
        setValor(vl);
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public double getValor() {
        return valor;
    }

    private void setNome(String n) {
        if (n != null){
            nome = n;
        }
        else{
            nome = "Anonimo";
        }
    }

    private void setEndereco(String e) {
        if (e != null){
            endereco = e;
        }
        else{
            endereco = "Nada a declarar";
        }
    }

    public void setTelefone(String t) {
        if (t != null){
            telefone = t;
        }
        else{
            telefone = "XXXXXXXXX";
        }
    }

    public void setValor(double v) {
        if( v > 0){
            valor = v;
        }
        else{
            valor = 1;
        }
    }
    
    public void estacionarVeiculo(int numVaga, Veiculo veiculo){
        if(numVaga == 1){
            vaga1 = veiculo;
        }
        else if(numVaga == 2){
            vaga2 = veiculo;
        }
        else if(numVaga == 3){
            vaga3 = veiculo;
        }
        else if(numVaga == 4){
            vaga4 = veiculo;
        }
        else if(numVaga == 5){
            vaga5 = veiculo;
        }
        else{
            System.out.println("Voce digitou o numero de vagas errado !");
        }
    }
    
    public void liberarVeiculo(int numVaga){
        if(numVaga == 1){
            System.out.println("Nota fiscal: ");
            System.out.println(" ");
        
            if(vaga1.isPequeno() == true){
                valor += valor * 0.25;
            }
        
            System.out.println("O motorista " + nome );
            System.out.println("Seu endereço é " + endereco);
            System.out.println("Seu telefone é " + telefone);
            System.out.println("O valor a ser pago sera: " + valor);
                
            vaga1.imprimirDadoVeiculo();
            valor = 0;
    }
        else if(numVaga == 2){
            System.out.println("Nota fiscal: ");
            System.out.println(" ");
        
            if(vaga2.isPequeno() == true){
                valor += valor * 0.25;
            }
        
            System.out.println("O motorista " + nome );
            System.out.println("Seu endereço é " + endereco);
            System.out.println("Seu telefone é " + telefone);
            System.out.println("O valor a ser pago sera: " + valor);
                
            vaga2.imprimirDadoVeiculo();
            valor = 0;
        }
        else if(numVaga == 3){
            System.out.println("Nota fiscal: ");
            System.out.println(" ");
        
            if(vaga3.isPequeno() == true){
                valor += valor * 0.25;
            }
        
            System.out.println("O motorista " + nome );
            System.out.println("Seu endereço é " + endereco);
            System.out.println("Seu telefone é " + telefone);
            System.out.println("O valor a ser pago sera: " + valor);
                
            vaga3.imprimirDadoVeiculo();
            valor = 0;
        }
        else if(numVaga == 4){
            System.out.println("Nota fiscal: ");
            System.out.println(" ");
        
            if(vaga4.isPequeno() == true){
                valor += valor * 0.25;
            }
        
            System.out.println("O motorista " + nome );
            System.out.println("Seu endereço é " + endereco);
            System.out.println("Seu telefone é " + telefone);
            System.out.println("O valor a ser pago sera: " + valor);
                
            vaga4.imprimirDadoVeiculo();
            valor = 0;
        }
        else if(numVaga == 5){
            System.out.println("Nota fiscal: ");
            System.out.println(" ");
        
            if(vaga5.isPequeno() == true){
                valor += valor * 0.25;
            }
        
            System.out.println("O motorista " + nome );
            System.out.println("Seu endereço é " + endereco);
            System.out.println("Seu telefone é " + telefone);
            System.out.println("O valor a ser pago sera: " + valor);
                
            vaga5.imprimirDadoVeiculo();
            valor = 0;
        }
        else{
            System.out.println("Voce digitou o numero da vaga errado");
        }
    }
}
