package POO2.aulas.lambda;

public class ExemploABC {
    public static void main(String[] args) {
        
        InterfaceFuncionalA objA = (a, b) -> { // implementa quando tratar uma coisa expecifica, faz mais sentindo fazer lambda doq criar uma classe de um metodo
            return a * b;
        }; // isso é uma expressão lambda, a JVN cria a classe anonima e faz ela do jeito que passou.
        System.out.println(objA.metodoA(27, 5));
        
        objA = (int a, int b) -> { 
            a += 1;
            b += 1;
            return a * b;
        };
        System.out.println(objA.metodoA(1, 5));
        
        objA = (a, b) -> a - b;
        System.out.println(objA.metodoA(27, 5));
        
        System.out.println("---");
        
        InterfaceFuncionalB objB = (b) -> System.out.println("b = " + b);
        objB.metodoB(7);
        
        System.out.println("---");
        
        InterfaceFuncionalC objC = () -> System.out.println("Welcome to Lambdas");
        objC.metodoC();
        
        ClasseC obj = new ClasseC();
        
        obj.metodo(() -> System.out.println("Hello Lambdas!"));
    }
}
