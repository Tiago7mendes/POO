package POO2.Prova;

public class Main {
    public static void main(String[] args) {
        
        LivroFisico l1;
        l1 = new LivroFisico("L1", "Java Como Programar", "DEITEL & DEITEL", 8, 2008);
        
        Revista r1;        
        r1 = new Revista("L2", "TVCG", "IEEE", 1, 2024);
        
        l1.getAutores();
        
        Chave c1 = new Chave("A1234");
        
        Emprestavel[] biblioteca = new Emprestavel[5];
        
        biblioteca[0] = l1;
        biblioteca[1] = r1;
        biblioteca[2] = c1;
        
        biblioteca[0].emprestar();
                
        for (int i = 0; i < biblioteca.length; i++){
            if(biblioteca[i] != null && biblioteca[i].podeEmprestar()){
                System.out.println(biblioteca[i].getNomeObjeto());
            }
        }
    }

}
