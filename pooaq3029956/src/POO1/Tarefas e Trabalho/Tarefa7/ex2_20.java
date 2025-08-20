public class ex2_20 {
    
    public String titulo;
    public int paginas;
    public String introducao;

    public ex2_20() {
        titulo = "Entendendo Algoritmos";
        paginas = 264;
        introducao = "Um algoritmo é um conjunto de ...";  
    }
    
    public void setTotalPag(int p) {
        paginas = p;
    }
    
    public void setIntro(String i) {
        introducao = i;
    } 

    public void setTitulo(String t) {
        titulo = t;
    } 
}