package MapaMundi;

import java.net.URL;
import javax.swing.*;
import java.awt.*;

public class JanelaAr extends JFrame {

    private JLabel label;
    private JLabel labelTexto;
    private JLabel labelImagem3;
    private Image imagem3;

    public JanelaAr() {
        try {            
            URL urlImagem3 = new URL("https://patrialatina.com.br/wp-content/uploads/2024/06/a-3-11.jpg");
            imagem3 = new ImageIcon(urlImagem3).getImage();
        } catch (Exception e) {
            System.out.println("Erro ao carregar imagem da URL: " + e.getMessage());
        }
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(900, 600);        
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);

        label = new JLabel("A Argelia é um país de origem muçulmana.");
        label.setBounds(50, 20, 400, 40);
        add(label);
        
        labelTexto = new JLabel("Uma mesquita encontrada na Argelia:");
        labelTexto.setBounds(50, 65, 300, 25);
        add(labelTexto);

        labelImagem3 = new JLabel(new ImageIcon(imagem3));
        labelImagem3.setBounds(220, 130, 520, 320); 
        add(labelImagem3);

        setVisible(true);
    }

    public static void main(String[] args) {
        new JanelaAr(); 
    }
}
