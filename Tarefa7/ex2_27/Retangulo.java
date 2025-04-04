package ex2_27;

public class Retangulo {
    private Ponto2D ponto1;
    private Ponto2D ponto2;

    public Retangulo (Ponto2D ponto1, Ponto2D ponto2) {
        this.ponto1 = ponto1;
        this.ponto2 = ponto2;
    }

   public Ponto2D getPonto1() {
       return ponto1;
   }
   
   public Ponto2D getPonto2() {
       return ponto2;
   }

   public void setPonto1(Ponto2D ponto1) {
       this.ponto1 = ponto1;
   }

   public void setPonto2(Ponto2D ponto2) {
       this.ponto2 = ponto2;
   }

   public void imprimirRetangulo() {
        System.out.printf("( %f , %f) \n", ponto1.getX(), ponto1.getY());
        System.out.printf("( %f , %f) \n", ponto2.getX(), ponto2.getY());
        System.out.printf("( %f , %f) \n", ponto1.getX(), ponto2.getY());
        System.out.printf("( %f , %f) \n", ponto2.getX(), ponto1.getY());
   }
}
