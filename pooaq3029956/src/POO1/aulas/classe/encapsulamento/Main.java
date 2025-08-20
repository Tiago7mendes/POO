package aulas.classe.encapsulamento;

public class Main {
    public static void main(String[] args) {
        
        Pessoa tiago = new Pessoa(1.80, 'm');
        
        
        
        // variavel local do tipo primitivo
        double aux1 = tiago.getAltura();
        char aux2 = tiago.getSexo();
        double aux3 = tiago.getPesoIdeal();
        
        System.out.println( "Altura " + aux1 );
        System.out.println( "Sexo " + aux2);
        System.out.println( "Peso Ideal " + aux3 );
        
        // altura é um atributo privado, não é possivel acessar o mesmo diretamente
        tiago.setAltura( aux1 * 1.05 );
        
        System.out.println( "Altura " + tiago.getAltura() );
        System.out.println( "Peso Ideal " + tiago.getPesoIdeal() );
    }
}
