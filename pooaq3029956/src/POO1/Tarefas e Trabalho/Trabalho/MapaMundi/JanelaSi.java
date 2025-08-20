package MapaMundi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaSi extends JFrame implements ActionListener {
    private JCheckBox checkRioSingapura;
    private JCheckBox checkPasseioNoturno;
    private JCheckBox checkExcursaoBike;
    private JCheckBox checkMeseoGarden;
    private JCheckBox checkGastronomia;
    private JLabel labelTotal;
    private int total;

    public JanelaSi() {
        setTitle("Passeios em Singapura");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);

        checkRioSingapura = new JCheckBox("Cruzeiro no Rio Singapura (R$ 140)");
        checkRioSingapura.setBounds(20, 20, 300, 25);
        checkRioSingapura.addActionListener(this);
        add(checkRioSingapura);

        checkPasseioNoturno = new JCheckBox("Excursão para um passeio a noite (R$ 300)");
        checkPasseioNoturno.setBounds(20, 50, 300, 25);
        checkPasseioNoturno.addActionListener(this);
        add(checkPasseioNoturno);

        checkExcursaoBike = new JCheckBox("Excursão historica em Singapura (R$ 400)");
        checkExcursaoBike.setBounds(20, 80, 300, 25);
        checkExcursaoBike.addActionListener(this);
        add(checkExcursaoBike);

        checkMeseoGarden = new JCheckBox("Museo Gardens By The Bay (R$ 250)");
        checkMeseoGarden.setBounds(20, 110, 300, 25);
        checkMeseoGarden.addActionListener(this);
        add(checkMeseoGarden);

        checkGastronomia = new JCheckBox("Tour gastronômico (R$ 800)");
        checkGastronomia.setBounds(20, 140, 300, 25);
        checkGastronomia.addActionListener(this);
        add(checkGastronomia);

        labelTotal = new JLabel("Total: R$ 0");
        labelTotal.setBounds(20, 200, 300, 25);
        add(labelTotal);

        setVisible(true);
    }

    public static void main(String[] args) {
        new JanelaSi();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JCheckBox source = (JCheckBox) e.getSource();

        if (source.isSelected()) {
            if (source == checkRioSingapura) total += 140;
            else if (source == checkPasseioNoturno) total += 300;
            else if (source == checkExcursaoBike) total += 400;
            else if (source == checkMeseoGarden) total += 250;
            else if (source == checkGastronomia) total += 800;
        } else {
            if (source == checkRioSingapura) total -= 140;
            else if (source == checkPasseioNoturno) total -= 300;
            else if (source == checkExcursaoBike) total -= 400;
            else if (source == checkMeseoGarden) total -= 250;
            else if (source == checkGastronomia) total -= 800;
        }

        labelTotal.setText("Total: R$ " + total);
    }
}
