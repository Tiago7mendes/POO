package POO2.aulas.regex;

public class Main {
    public static void main(String[] args) {
        String str;
        String regex;
        
        str = "a";
        regex = "a";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));
        
        str = "a";
        regex = "[a-z]";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));
        
        str = "r";
        regex = "[a-z]";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));
        
        str = "B";
        regex = "[a-z]";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));
        
        str = "B";
        regex = "[a-zA-Z]";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));
        
        str = "Bbf";
        regex = "[a-zA-Z]+";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));
        
        str = "";
        regex = "[a-z]*"; // quer dizer de 0 ate n
        System.out.println(str + " | " + regex + " | " + str.matches(regex));
        
        str = "Bbf";
        regex = "\\w+"; // qualquer caractere
        System.out.println(str + " | " + regex + " | " + str.matches(regex)); 
        
        str = "A4283547826";
        regex = "A\\d+";
        System.out.println(str + " | " + regex + " | " + str.matches(regex)); 
        
        str = "Tiago Setti";
        regex = "[A-Z][a-z]+\\s+[A-Z][a-z]+";
        System.out.println(str + " | " + regex + " | " + str.matches(regex)); 
        
        str = "55552-123";
        regex = "\\d{5}-\\d{3}";
        System.out.println(str + " | " + regex + " | " + str.matches(regex)); 
        
        str = "+1(12)99298-5365";
        regex = "(\\+\\d{1,2})?\\(\\d{2}\\)\\d{4,5}-\\d{4}";
        System.out.println(str + " | " + regex + " | " + str.matches(regex)); 
        
        str = "Tiagdasodjk oadfughsodfuagsd     asouidfhaosiud     aisudhiua  asy";
        str = str.replaceAll("\\s+", " "); //substituir todos os espaços, mas da para fazer com outros regexs
        System.out.println(str);
        
        String[] vetor = str.split("\\s+");
        
        for( String s : vetor){
            System.out.println( s );
        }
        
    }
}
