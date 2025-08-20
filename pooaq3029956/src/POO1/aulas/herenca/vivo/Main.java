package aulas.herenca.vivo;

public class Main {
    public static void main(String[] args) {
        
        SerVivo sv1 = new SerVivo(true);
        SerVivo sv2 = new SerVivo(false);
        
        System.out.println("---");
        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println("---");
        
        Animal jacare = new Animal();
        System.out.println(jacare.isMove() );
        System.out.println( jacare );
        System.out.println("---");
        
        Vegetal iris = new Vegetal("Sao Carlos");
        System.out.println(iris.isMove() );
        System.out.println( iris );
        System.out.println("---");
        
        // variavel de superclasse pode receber um objeto de subclasse 
        SerVivo sv = iris;
        System.out.println(sv.isMove());
        System.out.println(sv.definicao());
        
        // sv e iris são variaveis diferentes, que apontam para o mesmo objeto da memoria
        sv.setMove(true); // a variavel sv só tem acesso direto aos recursos definidos em SerVivo
        System.out.println( iris.isMove() );
        
    }
}
