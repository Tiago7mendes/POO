package aulas.classe.basico;

public class Main {
        public static void main(String[] args) {
                // usuário é uma variável de referencia a um objeto do tipo Pessoa (classe)
                // criação  (new) do objeto do tipo Pessoa
                // criação de uma instancia da classe Pessoa
                Pessoa usuario =  new Pessoa(1.80, 'f');
                
                Pessoa cliente = new Pessoa(1.90, 'm');
                
                // acesso direto aos atributos do objeto presente em usuario
                System.out.println( usuario.altura );
                System.out.println( usuario.sexo );
                
                // pesoIdeal é uma variável de instância
                System.out.println( usuario.pesoIdeal );
                
                usuario.altura = 1.81;
                usuario.sexo = 'M';
                
                cliente.altura = 1.91;
                cliente.sexo = 'f';
                
                // executa o método calcularPesoIdeal do objeto presente em usuario
                usuario.calcularPesoIdeal();
                System.out.println( usuario.pesoIdeal );
                
                cliente.calcularPesoIdeal();
                System.out.println( cliente.pesoIdeal );
                
                // erro lógico, na maioria das vezes os atributos das classes, logo as variáveis de instância,
                // deverão ser encapsuladas (ocultas) para manter a integridade e segurança do objeto.
                cliente.pesoIdeal = -1.0;
                System.out.println( cliente.pesoIdeal );

    }
}
