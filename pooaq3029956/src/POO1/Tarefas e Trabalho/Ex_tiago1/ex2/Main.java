package ex2;

public class Main {
    public static void main(String[] args) {
        
        Professor tiago = new Professor("Tiago Setti");
        Aluno cauan = new Aluno("Cauan Mendes");
        Departamento engenharia = new Departamento("Engenharia");
        
        Curso mecanica = new Curso("Mecânica", "Calculo II", 12, engenharia, tiago);
        
        cauan.matricular("AQ3031713", mecanica);
        
        cauan.exibirDetalhes();
    }
}
