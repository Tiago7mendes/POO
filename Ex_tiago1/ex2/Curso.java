package ex2;

public class Curso {

    private String nome;
    private PlanoAula planoaula;
    private Departamento departamento;
    private Professor professor;

    public Curso(String nome, String t, int d, Departamento departamento, Professor professor) {
        
        this.nome = nome;
        planoaula = new PlanoAula(t, d);
        this.departamento = departamento;
        this.professor = professor;
    }
    
    public void exibirInfo(){
        
        System.out.println("Curso: " + nome);
        planoaula.exibirPlano();
        System.out.println("Departamento: " + departamento.getNome());
        System.out.println("Professor: " + professor.getNome());
        
    }
    
}


