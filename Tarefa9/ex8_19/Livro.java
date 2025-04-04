package ex8_19;

public class Livro {

    private int pag;
    private String autor;

    public Livro(int pag, String autor){
        setPag(pag);
        setAutor(autor);
    }

    public int getPag(){
        return pag;
    }

    public String getAutor(){
        return autor;
    }

    public void setPag(int pag){
        this.pag = pag;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

}