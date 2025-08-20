package POO2.aulas.excecoes;

public class Ex6 {
    public static void main(String[] args) throws Exception { // esse é o jeito "errado", menos limpo.
        Data hoje = new Data();
        
        hoje.setDia(2);
        hoje.setMes(-1);
    }
}
