package ex3;

public class Cliente {
    private String nome;
    private String email;

    public Cliente(String n, String e){
        nome = n;
        email = e;
    }
    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public void exibirInfo(){

        System.out.println("O " + nome + " foi cadastrado e seu email é " + email);

    }
}
