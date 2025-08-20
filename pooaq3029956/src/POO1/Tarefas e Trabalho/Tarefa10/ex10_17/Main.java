package Tarefa10.ex10_17;

public class Main {
    public static void main(String[] args) {
        // Criando um array de floats com tamanho 5
        ArrayFloat array = new ArrayFloat(5);

        // Configurando valores no array
        array.valor(0, 1.5f);
        array.valor(1, 2.3f);
        array.valor(2, 4.7f);
        array.valor(3, 3.1f);

        // Exibindo os valores do array
        System.out.print("Array: ");
        array.exibirArray();

        // Verificando se os valores existem no array
        System.out.println("Existe o número 2.3? " + array.existe(2.3f));
        System.out.println("Existe o número 5.0? " + array.existe(5.0f));
    }
}
