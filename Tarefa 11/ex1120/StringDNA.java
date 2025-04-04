public class StringDNA {
    private String dna; 

    public StringDNA(String input) {
        dna = ""; 
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'A' || c == 'C' || c == 'G' || c == 'T') {
                dna += c;
            }
        }
    }

    public String toString() {
        return dna;
    }

    public char charAt(int index) {
        if (index >= 0 && index < dna.length()) {
            return dna.charAt(index);
        } else {
            char erro = 'E';
            return erro;
        }
    }

    public int quantosA() {
        return countChar('A');
    }

    public int quantosC() {
        return countChar('C');
    }

    public int quantosG() {
        return countChar('G');
    }

    public int quantosT() {
        return countChar('T');
    }

    public int length() {
        return dna.length();
    }

    private int countChar(char c) {
        int count = 0;
        for (int i = 0; i < dna.length(); i++) {
            if (dna.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
