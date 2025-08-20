package POO2.aulas.arquivos;

import java.io.Serializable;

public class Pessoa implements Serializable{
    
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        setCpf(cpf);
        setNome(nome);
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null){
            this.nome = nome;
        } else {
            throw new RuntimeException("O nome não pode estar vazio");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")){
            this.cpf = cpf;
        } else{
            throw new RuntimeException("O cpf deve estar no formato XXX.XXX.XXX-XX");
        }
    }
    
    public String toString(){
        return getNome() + " (" + getCpf() + ") ";
    }
}
