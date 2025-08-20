package ex1227;

public class Main {
    public static void main(String[] args) {
        MaquinaDeKaraoke maquina = new MaquinaDeKaraoke();

        maquina.adicionarMusica("Música 1");
        maquina.adicionarMusica("Música 2");
        maquina.adicionarMusica("Música 3");
        maquina.adicionarMusica("Música 4");

        maquina.exibirFila(); 

        maquina.adia("Música 2");
        maquina.exibirFila(); 

        maquina.adianta("Música 3");
        maquina.exibirFila(); 

        maquina.adia("Música 5"); 
        maquina.adianta("Música 5"); 
        maquina.exibirFila(); 
    }
}
