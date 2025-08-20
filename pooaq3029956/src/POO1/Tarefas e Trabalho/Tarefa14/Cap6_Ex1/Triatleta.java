public class Triatleta extends Pessoa implements Nadador, Corredor, Ciclista {
    public Triatleta(String nome){
        super(nome);
    }

    public void aquecer() {
        System.out.println(this.getNome() + " esta aquecido");
    }

    public void nadar() {
        System.out.println(this.getNome() + " esta nadando");
    }

    public void correr() {
        System.out.println(this.getNome() + " esta correndo");
    }

    public void correrDeBicicleta() {
        System.out.println(this.getNome() + " esta correndo de bike");
    }
}
