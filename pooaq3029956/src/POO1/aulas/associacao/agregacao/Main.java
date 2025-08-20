package aulas.associacao.agregacao;

public class Main {
    public static void main(String[] args) {
        
        Empresa google = new Empresa("Google Inc");
        google.mostrarInfo();
        
        Profissional tiago = new Profissional("Tiago");
        Profissional victor = new Profissional("Victor");
        
        tiago.mostrarInfo();
        victor.mostrarInfo();
        
        tiago.setEmpresa(google);
        tiago.mostrarInfo();
    }
}
