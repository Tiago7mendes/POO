package MapaMundi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JanelaI extends JFrame implements ActionListener{

    private JLabel label;
    private JTextArea texto;

    private JRadioButton op1;
    private JRadioButton op2;

    private ButtonGroup grupoIdiomas;

    public JanelaI(){
        setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
        
        setSize(900, 400);        
        setResizable(false);
        
        setLayout(null);
        
        setLocationRelativeTo(null);

        label = new JLabel();
        label.setText(("Curiosidades sobre oa Italia: "));
        label.setBounds( 50, 20, 900, 40 );
        add(label);

        texto = new JTextArea();
        texto.setText(getCuriosidades("pt"));
        texto.setBounds(20, 60, 850, 150);
        add(texto);

        op1 = new JRadioButton();
        op1.setText("Italiano");
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
        JanelaI janela = new JanelaI();

        janela.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (op2.isSelected()) {
            label.setText("Curiosidades da Italia:");
            texto.setText(getCuriosidades("pt"));
        } else if (op1.isSelected()) {
            label.setText("Curiosità sull'Italia:");
            texto.setText(getCuriosidades("it"));
        }
    }

    private String getCuriosidades(String idioma) {
        if (idioma.equals("pt")) {
            return """
                - A pizza marguerita surgiu como uma representação da bandeira italiana: manjericão (verde), tomate (vermelho) e muçarela (branco).
                - Ferrari é o sobrenome mais comum na Itália, que significa ferro ou ferreiro.
                - O termômetro foi inventado na Itália em 1592 pelo Galileu Galilei.
                - Os italianos trabalham em média 20 horas por semana – uma das menores médias da Europa. 
                - Um terço dos italianos nunca usou a internet.
                - O lobo é o animal nacional da Itália e tem um papel importante na lenda sobre a fundação de Roma.
                - A primeira mulher do mundo a receber um diploma acadêmico e também a primeira a se tornar doutora com um PhD foi italiana. 
                - A Itália é responsável por apresentar o sorvete ao mundo – além do café e da torta de furtas!
            """;
        } else if (idioma.equals("it")) {
            return """
                - La pizza margherita è nata come rappresentazione della bandiera italiana: basilico (verde), pomodoro (rosso) e mozzarella (bianca).
                - Ferrari è il cognome più diffuso in Italia, che significa ferro o fabbro.
                - Il termometro fu inventato in Italia nel 1592 da Galileo Galilei.
                - Gli italiani lavorano in media 20 ore settimanali, una delle medie più basse d'Europa. 
                - Un terzo degli italiani non ha mai usato internet.
                - Il lupo è l'animale nazionale d'Italia e gioca un ruolo importante nella leggenda sulla fondazione di Roma.
                - È stata italiana la prima donna al mondo a conseguire un titolo accademico e anche la prima a diventare medico con un dottorato di ricerca. 
                - L'Italia è responsabile dell'introduzione del gelato nel mondo, oltre al caffè e alla torta rubata!
            """;
        }
        return "";
    }
}