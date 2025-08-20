package aq3029956p1;

public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    private double imc;
    
    public Pessoa(String n, int id, double p, double a){
        setNome(n);
        setIdade(id);
        setPeso(p);
        setAltura(a);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNome(String n) {
        if (n != null){
           nome = n; 
        }
        else{
            nome = "Anonimo";
        }
    }

    public void setIdade(int i) {
        if(i > 0){
            idade = i;
        }
        else{
            idade = 1;
        }
    }

    public void setPeso(double p) {
        if (p > 0){
           peso = p; 
        }
        else{
            peso = 0.1;
        }
    }

    public void setAltura(double a) {
        if (a > 0){
            altura = a;
        }
        else{
            altura = 1;
        }
    }
    
    private double calcularImc(){
        imc = (peso / (altura * altura));
        return imc;
    }
    
    public void imprimirPessoa(){
        System.out.println("O " + nome + " tem "+ idade + " anos, sua alutra é " + altura + " metros e seu peso é de " + peso + " Kg");
        System.out.println("Portanto seu imc é " + calcularImc());
        System.out.println("==============================");
    }
    
    public void eMaisVelho(int i){
        if(idade > i){
            System.out.println(idade + " > " + i + " " + true);
        }
        else{
            System.out.println(idade + " > " + i + " " + false);
        }
    }
    
    public void imprimirStatus(){
        if(imc >= 30){
            System.out.println(nome + " esta com Obesidade");
        }
        else if(imc >= 25){
            System.out.println(nome + " esta com Sobrepeso");
        }
        else if(imc >= 18.5){
            System.out.println(nome + " esta no Peso Ideal");
        }
        else if (imc > 0){
            System.out.println(nome + " esta Abaixo do Peso");
        }
        else{
            System.out.println(nome + " Você é doido");
        }
    }
}
