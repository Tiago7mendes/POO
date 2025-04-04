package ex1210;

public class Main {
    public static void main(String[] args) {
        ConjuntoDePalavras conjunto = new ConjuntoDePalavras();
        conjunto.adicionar("maverick ");
        conjunto.adicionar("c14");

        System.out.println("Conjunto atual: " + conjunto); 

        conjunto.remove("c14");
        System.out.println("Após remover 'c14': " + conjunto);

        boolean removido = conjunto.remove("carro");
        System.out.println("Tentativa de remover 'carro': " + removido); 
    }
}
