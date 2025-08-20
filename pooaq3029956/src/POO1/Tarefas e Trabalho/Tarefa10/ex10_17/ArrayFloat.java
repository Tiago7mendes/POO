package Tarefa10.ex10_17;

public class ArrayFloat {
    private float[] array;

    public ArrayFloat(int tamanho){
        array = new float[tamanho];
    }

    public boolean existe(float num){
        for(int i = 0; i < array.length; i++){
            if(array[i] == num){
                System.out.println("Numero encontrado com sucesso!");
                return true;
            }
        }
        System.out.println("Numero nao encontrado!");
        return false;
    }

    public void valor(int indice, float valor) {
        if (indice >= 0 && indice < array.length) {
            array[indice] = valor;
        } else {
            System.out.println("Índice fora dos limites do array.");
        }
    }
    

    public void exibirArray() {
        for (float elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
