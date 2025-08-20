package MapaMundi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaJ extends JFrame implements ActionListener {

    private JCheckBox checkFuji;
    private JCheckBox checkTourToquio;
    private JCheckBox checkOsaka;
    private JCheckBox checkOnsen;
    private JCheckBox checkDisney;
    private JLabel labelTotal;
    private int total;

    private JLabel labelID;
    private JTextField campoID;
    private JLabel labelResultado;
    private JButton excluir;
    private JButton salvar;

    public JanelaJ() {
        setTitle("Janela Japão - Passeios e Conversão");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 400);        
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);

        checkFuji = new JCheckBox("Passeio no Monte Fuji e Lago Kawaguchi (R$ 420)");
        checkFuji.setBounds(20, 20, 300, 25);
        checkFuji.addActionListener(this);
        add(checkFuji);

        checkTourToquio = new JCheckBox("Tour em Tóquio (R$ 500)");
        checkTourToquio.setBounds(20, 50, 300, 25);
        checkTourToquio.addActionListener(this);
        add(checkTourToquio);

        checkOsaka = new JCheckBox("Viagem para Osaka e Nara (R$ 400)");
        checkOsaka.setBounds(20, 80, 300, 25);
        checkOsaka.addActionListener(this);
        add(checkOsaka);

        checkOnsen = new JCheckBox("Vaigem para Oshino Hakkai e Onsen (R$ 300)");
        checkOnsen.setBounds(20, 110, 300, 25);
        checkOnsen.addActionListener(this);
        add(checkOnsen);

        checkDisney = new JCheckBox("Disney Tóquio (R$ 800)");
        checkDisney.setBounds(20, 140, 300, 25);
        checkDisney.addActionListener(this);
        add(checkDisney);

        labelTotal = new JLabel("Total: R$ 0");
        labelTotal.setBounds(20, 200, 300, 25);
        add(labelTotal);

        JLabel labelConversao = new JLabel("Quantos Ienes voce esta levando:");
        labelConversao.setBounds(350, 20, 300, 25);
        add(labelConversao);

        labelID = new JLabel("Ienes:");
        labelID.setBounds(350, 65, 100, 25);
        add(labelID);

        campoID = new JTextField();
        campoID.setBounds(400, 65, 100, 25);
        add(campoID);

        salvar = new JButton("Converter");
        salvar.setBounds(350, 175, 120, 25);
        salvar.addActionListener(this);
        add(salvar);

        excluir = new JButton("Excluir");
        excluir.setBounds(225, 175, 120, 25);
        excluir.addActionListener(this);
        add(excluir);

        labelResultado = new JLabel("Resultado: ");
        labelResultado.setBounds(350, 100, 400, 25);
        add(labelResultado);

        setVisible(true);
    }

    public static void main(String[] args) {
        new JanelaJ();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JCheckBox) {
            JCheckBox source = (JCheckBox) e.getSource();

            if (source.isSelected()) {
                if (source == checkFuji) total += 420;
                else if (source == checkTourToquio) total += 500;
                else if (source == checkOsaka) total += 400;
                else if (source == checkOnsen) total += 300;
                else if (source == checkDisney) total += 800;
            } else {
                if (source == checkFuji) total -= 420;
                else if (source == checkTourToquio) total -= 500;
                else if (source == checkOsaka) total -= 400;
                else if (source == checkOnsen) total -= 300;
                else if (source == checkDisney) total -= 800;
            }

            labelTotal.setText("Total: R$ " + total);
        }

        if (e.getSource() == salvar) {
            try {
                double iene = Double.parseDouble(campoID.getText());
                double real = iene / 26;  
                labelResultado.setText("Resultado: R$ " + String.format("%.2f", real));
            } catch (NumberFormatException ex) {
                labelResultado.setText("Valor inválido");
            }
        }

        if (e.getSource() == excluir) {
            campoID.setText("");
            labelResultado.setText("Resultado: ");
        }
    }
}
