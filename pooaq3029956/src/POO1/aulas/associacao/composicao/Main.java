package aulas.associacao.composicao;

public class Main {
    public static void main(String[] args) {
        
        Roda rDE = new Roda();
        
        Carro uno = new Carro();
        
        Carro ferrari = new Carro(); // ferrari é o indentificador que tem 4 objetos dentro dele
        
        uno.trocarRodaDiantEsq();
        
        ferrari.trocarRodaDiantEsq();
        
        System.out.println( uno.getDiantEsq().estaGirando());
        uno.getDiantEsq().setGirando(true);
        System.out.println( uno.getDiantEsq().estaGirando());
        
        /*uno.setDiantEsq(rDE); // usa o set para alterar a variavel uno
        ferrari.setDiantEsq(rDE);*/ // se deixar public o set, nao pode ter uno e ferrari usando ao mesmo tempo, mas se utilizar private da certo
    }
}
