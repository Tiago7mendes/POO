package ex8_19;

public class LivroBiblioteca extends Livro{
    private boolean emprestado;

    public LivroBiblioteca(int pag, String autor, boolean emprestado){
        super(pag, autor);
        setEmprestado(emprestado);
    }

    public boolean isEmprestado(){
        return emprestado;
    }

    public void setEmprestado(boolean emprestado){
        this.emprestado = emprestado;
    }

    public void pegarEmprestado(){
        if (emprestado == false) {
            System.out.println("Livro emprestado com sucesso");
            emprestado = true;
        }
        else{
            System.out.println("Este livro esta sendo usado!");
        }
    }

    public void devolver() {
        if (emprestado == true) {
            System.out.println("Livro devolvido com sucesso");
            emprestado = false;
        } else {
            System.out.println("Este livro já está disponível!");
        }
    }
}
