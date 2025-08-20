package aulas.string;

public class Main {
    public static void main(String[] args) {
        
        String str1 = "hello";
        String str0 = str1; // str0 é uma variavel de referencia, são o mesmo objeto na memoria
        String str2 = new String("hello"); // não precisa colocar o new para criar o objeto do tipo String
        String str3 = "Hello";
        
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1 == str2);
        System.out.println(str1 == str0);
        System.out.println(str1.equals( str2));
        System.out.println(str1.equals( str3));
        System.out.println(str1.equalsIgnoreCase(str3));
        
        System.out.println("");
        
        String str4 = "Instituto Federal de São Paulo (IFSP)";
        System.out.println(str4);
        System.out.println(str4.length());
        System.out.println(str4.charAt(13));
        
        System.out.println("");
        
        for (int i = 0; i < str4.length(); i++) {
            System.out.println(str4.charAt(i));
        }
        
        System.out.println("");
        
        String str5 = str4.toLowerCase();
        System.out.println(str5);
        
        System.out.println("");
        
        System.out.println(str4);
        System.out.println( str4.startsWith("Inst"));
        
        String str6 = "     Ti        Ti       Ti iiiiiiiiiii          ";
        
        System.out.println(str6.trim()); // depois volta ao normal, se quiser mudar por completo coloque em outra variavel.
        
        System.out.println("");
        
        double num = 3.14;
        String str7 = String.valueOf(num);
        
        System.out.println(str7); // isso não é um numero, virou uma string
        
         String str8 = "3.00";
         double k = Double.valueOf(str8);
         
         System.out.println(num - k);
    }
}
