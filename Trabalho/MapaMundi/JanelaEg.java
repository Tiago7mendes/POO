package MapaMundi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaEg extends JFrame implements ActionListener {
    private JCheckBox checkRioNilo;
    private JCheckBox checkPiramides;
    private JCheckBox checkMuseuEgipcio;
    private JCheckBox checkTemploLuxor;
    private JCheckBox checkSafariDeserto;
    private JLabel labelTotal;
    private int total;

    public JanelaEg() {
        setTitle("Passeios no Egito");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);

        checkRioNilo = new JCheckBox("Passeio no Rio Nilo (R$ 500)");
        checkRioNilo.setBounds(20, 20, 300, 25);
        checkRioNilo.addActionListener(this);
        add(checkRioNilo);

        checkPiramides = new JCheckBox("Visita às Pirâmides (R$ 800)");
        checkPiramides.setBounds(20, 50, 300, 25);
        checkPiramides.addActionListener(this);
        add(checkPiramides);

        checkMuseuEgipcio = new JCheckBox("Museu Egípcio do Cairo (R$ 300)");
        checkMuseuEgipcio.setBounds(20, 80, 300, 25);
        checkMuseuEgipcio.addActionListener(this);
        add(checkMuseuEgipcio);

        checkTemploLuxor = new JCheckBox("Templo de Luxor (R$ 400)");
        checkTemploLuxor.setBounds(20, 110, 300, 25);
        checkTemploLuxor.addActionListener(this);
        add(checkTemploLuxor);

        checkSafariDeserto = new JCheckBox("Safari no Deserto (R$ 600)");
        checkSafariDeserto.setBounds(20, 140, 300, 25);
        checkSafariDeserto.addActionListener(this);
        add(checkSafariDeserto);

        labelTotal = new JLabel("Total: R$ 0");
        labelTotal.setBounds(20, 200, 300, 25);
        add(labelTotal);

        setVisible(true);
    }

    public static void main(String[] args) {
        new JanelaEg();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JCheckBox source = (JCheckBox) e.getSource();

        if (source.isSelected()) {
            if (source == checkRioNilo) total += 500;
            else if (source == checkPiramides) total += 800;
            else if (source == checkMuseuEgipcio) total += 300;
            else if (source == checkTemploLuxor) total += 400;
            else if (source == checkSafariDeserto) total += 600;
        } else {
            if (source == checkRioNilo) total -= 500;
            else if (source == checkPiramides) total -= 800;
            else if (source == checkMuseuEgipcio) total -= 300;
            else if (source == checkTemploLuxor) total -= 400;
            else if (source == checkSafariDeserto) total -= 600;
        }

        labelTotal.setText("Total: R$ " + total);
    }
}
