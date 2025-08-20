package ex2;

public class Aluno {
    private String nome;
    private String matricula;
    private Curso curso;

    public Aluno(String nome) {
        this.nome = nome;
    }
    
    public void matricular(String m, Curso c){
        matricula = m;
        curso = c;
    }
    
    public void exibirDetalhes(){
        System.out.println("Aluno: " + nome);
        System.out.println("Matrícula: " + matricula);
        curso.exibirInfo();
    }
    
    
}
