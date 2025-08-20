package MapaMundi;

import java.net.URL;
import javax.swing.*;
import java.awt.*;

public class JanelaSu extends JFrame {

    private JLabel label;
    private JLabel labelTexto;
    private JLabel labelImagem1;
    private JLabel labelImagem2;
    private JLabel labelImagem3;
    private Image imagem1; 
    private Image imagem2;
    private Image imagem3;

    public JanelaSu() {
        try {
            URL urlImagem1 = new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSbMN8PRU13FbjJxFnqQqi2wzbGdV1ZPHC0Mg&s");
            imagem1 = new ImageIcon(urlImagem1).getImage(); 
            
            URL urlImagem2 = new URL("https://paradisoturismo.com.br/wp-content/uploads/2021/09/swiss7.jpg");
            imagem2 = new ImageIcon(urlImagem2).getImage();
            
            URL urlImagem3 = new URL("https://cdn.prod.website-files.com/6712e729148886be5f355687/67160d7cb9b344e6305cfc9b_viajar-para-a-suica.jpeg");
            imagem3 = new ImageIcon(urlImagem3).getImage();
        } catch (Exception e) {
            System.out.println("Erro ao carregar imagem da URL: " + e.getMessage());
        }
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(1200, 400);        
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);

        label = new JLabel("A Suiça é famosa por sua paisagem natural");
        label.setBounds(50, 20, 400, 40);
        add(label);
        
        labelTexto = new JLabel("Algumas fotos da Suíça:");
        labelTexto.setBounds(50, 65, 300, 25);
        add(labelTexto);

        labelImagem1 = new JLabel(new ImageIcon(imagem1));
        labelImagem1.setBounds(50, 100, 300, 300); 
        add(labelImagem1);

        labelImagem2 = new JLabel(new ImageIcon(imagem2)); 
        labelImagem2.setBounds(380, 160, 300, 180); 
        add(labelImagem2);

        labelImagem3 = new JLabel(new ImageIcon(imagem3)); 
        labelImagem3.setBounds(710, 160, 400, 180); 
        add(labelImagem3);

        setVisible(true);
    }

    public static void main(String[] args) {
        new JanelaSu(); 
    }
}
