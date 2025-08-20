package MapaMundi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JanelaC extends JFrame implements ActionListener{

    private JLabel label;
    private JTextArea texto;

    private JRadioButton op1;
    private JRadioButton op2;

    private ButtonGroup grupoIdiomas;

    public JanelaC(){
        setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
        
        setSize(900, 400);        
        setResizable(false);
        
        setLayout(null);
        
        setLocationRelativeTo(null);

        label = new JLabel();
        label.setText(("Curiosidades sobre o Chile: "));
        label.setBounds( 50, 20, 900, 40 );
        add(label);

        texto = new JTextArea();
        texto.setText(getCuriosidades("pt"));
        texto.setBounds(20, 60, 700, 150);
        add(texto);

        op1 = new JRadioButton();
        op1.setText("Espanhol");
        op1.setBounds(50, 300, 115, 25);
        op1.addActionListener( this );
        add(op1);

        op2 = new JRadioButton();
        op2.setText("Portugues");
        op2.setBounds(170, 300, 130, 25);
        op2.addActionListener( this );
        add(op2);

        grupoIdiomas = new ButtonGroup();
        grupoIdiomas.add(op1);
        grupoIdiomas.add(op2);
        
        setVisible(true);
    }

    public static void main(String[] args) {
        JanelaC janela = new JanelaC();

        janela.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (op2.isSelected()) {
            label.setText("Curiosidades do Chile:");
            texto.setText(getCuriosidades("pt"));
        } else if (op1.isSelected()) {
            label.setText("Curiosidades sobre Chile:");
            texto.setText(getCuriosidades("es"));
        }
    }

    private String getCuriosidades(String idioma) {
        if (idioma.equals("pt")) {
            return """
                - O Chile é um dos maiores produtores de cobre do mundo.
                - O Deserto do Atacama é o lugar mais seco do planeta.
                - O país é conhecido por sua variedade de vinhos.
                - O Chile está entre os sete países maiores produtores de vinhos do mundo. 
                - A Cordilheira dos Andes atravessa todo o país.
                - O maior terremoto do mundo aconteceu no Chile. Foi no ano de 1960 na cidade de Valdivia.
                - Sua magnitude foi 9.5 e destruiu toda a cidade. 
                - É proibido caminhar sem camisas pelas ruas e parques e tomar bebidas alcoólicas nas ruas, parques e praias.
            """;
        } else if (idioma.equals("es")) {
            return """
                - Chile es uno de los mayores productores de cobre del mundo.
                - El desierto de Atacama es el lugar más seco del planeta.
                - El país es conocido por su variedad de vinos.
                - Chile se encuentra entre los siete mayores países productores de vino del mundo. 
                - La Cordillera de los Andes atraviesa todo el país.
                - El terremoto más grande del mundo ocurrió en Chile. Fue en el año 1960 en la ciudad de Valdivia.
                - Su magnitud fue de 9,5 y destruyó toda la ciudad. 
                - Está prohibido caminar sin camiseta por las calles y parques y beber bebidas alcohólicas en las calles, parques y playas.
            """;
        }
        return "";
    }
}
