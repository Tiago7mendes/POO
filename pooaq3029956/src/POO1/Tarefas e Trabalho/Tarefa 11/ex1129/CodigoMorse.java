package ex1129;

public class CodigoMorse {
    
    private static final char[] caracteres = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '.', ','
    };
    private static final String[] morse = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
            ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-",
            ".--", "-..-", "-.--", "--..", ".-.-.-", "--..--"
    };

    
    public static String codificar(String texto) {
        texto = texto.toLowerCase(); 
        String resultado = ""; 

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            for (int j = 0; j < caracteres.length; j++) {
                if (c == caracteres[j]) {
                    resultado += morse[j] + " "; 
                    break;
                }
            }
        }
        return resultado.trim(); // para tirar o ultimo
    }

    
    public static String decodificar(String codigoMorse) {
        String resultado = ""; 
        String[] codigos = codigoMorse.split(" "); 

        for (String codigo : codigos) {
            boolean encontrado = false;
            for (int j = 0; j < morse.length; j++) {
                if (codigo.equals(morse[j])) {
                    resultado += caracteres[j]; 
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                resultado += "?"; // se nao achar nada
            }
        }
        return resultado;
    }
}
