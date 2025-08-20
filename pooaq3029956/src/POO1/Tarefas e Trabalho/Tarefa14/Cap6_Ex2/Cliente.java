package Cap6_Ex2;

public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        setCpf(cpf);
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf.length() == 11){
            this.cpf = cpf;
        } else {
            System.out.println("CPF invalido");
        }
    }
}
