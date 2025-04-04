package ex8_19;

public class LivroLivraria extends Livro{
    private boolean vendido;

    public LivroLivraria(int pag, String autor, boolean vendido){
        super(pag, autor);
        setVendido(vendido);
    }

    public boolean isVendido(){
        return vendido;
    }

    public void setVendido(boolean vendido){
        this.vendido = vendido;
    }

    public void vender(){
        if (vendido == false) {
            System.out.println("Livro vendido com sucesso");
            vendido = true;
        }
        else{
            System.out.println("Este livro ja foi vendido!");
        }
    }
}
