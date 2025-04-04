package ex1222;

public class EleminarRep {

    public static String[] eliminarRepetidos(String[] lista) {
        int tamanho = lista.length;
        String[] temporario = new String[tamanho];
        int index = 0;

        for (int i = 0; i < tamanho; i++) {
            boolean jaExiste = false;

            for (int j = 0; j < index; j++) {
                if (lista[i].equals(temporario[j])) {
                    jaExiste = true;
                    break;
                }
            }

            if (!jaExiste) {
                temporario[index++] = lista[i];
            }
        }

        String[] semRepetidos = new String[index];
        System.arraycopy(temporario, 0, semRepetidos, 0, index);

        return semRepetidos;
    }

    public static void main(String[] args) {
        String[] palavras = {"maçã", "banana", "maçã", "laranja", "banana", "laranja", "goiaba"};

        System.out.print("Lista original: ");
        for (String palavra : palavras) {
            System.out.print(palavra + " ");
        }
        System.out.println();

        String[] semRepetidos = eliminarRepetidos(palavras);

        System.out.print("Lista sem repetidos: ");
        for (String palavra : semRepetidos) {
            System.out.print(palavra + " ");
        }
        System.out.println();
    }
}
