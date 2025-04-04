public class Main {
    public static void main(String[] args) {
        StringDNA dna1 = new StringDNA("CATGATTAG");
        System.out.println(dna1.toString());  
        System.out.println(dna1.quantosA()); 
        System.out.println(dna1.quantosC()); 
        System.out.println(dna1.quantosG()); 
        System.out.println(dna1.quantosT());  
        System.out.println(dna1.length());  
    }
}
