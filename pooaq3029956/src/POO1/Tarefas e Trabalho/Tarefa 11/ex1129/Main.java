package ex1129;

public class Main {
    public static void main(String[] args) {
        String texto = "Farfalhar";
        String codificado = CodigoMorse.codificar(texto);
        System.out.println("Texto codificado: " + codificado);

        String morse = "..-. .- .-. ..-. .- .-.. .... .- .-.";
        String decodificado = CodigoMorse.decodificar(morse);
        System.out.println("Morse decodificado: " + decodificado); 
    }
}
