package POO2.aulas.arquivos;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ex5 {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Joao", "555.555.555-55");
        Pessoa p2 = new Pessoa("Maria", "333.333.333-33");
        System.out.println(p1.toString());
        System.out.println(p2);
        
        try{
            
            FileOutputStream arq = new FileOutputStream("Arquivo3.ser");
            
            ObjectOutputStream stream = new ObjectOutputStream(arq);
            
            stream.writeObject(p1);
            stream.writeObject(p2);
            
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
