package MapaMundi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JanelaE extends JFrame implements ActionListener{

    private JLabel label;

    private JLabel labelID;
    private JTextField campoID;

    private JLabel labelResultado;
    
    private JButton excluir;
    private JButton salvar;

    public JanelaE(){
        setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
        
        setSize(500, 250);        
        setResizable(false);
        
        setLayout(null);
        
        setLocationRelativeTo(null);

        label = new JLabel();
        label.setText(("Conversão de Reais em Dolar:"));
        label.setBounds( 50, 20, 400, 40 );
        add(label);
        
        labelID = new JLabel();
        labelID.setText("Reais:");
        labelID.setBounds( 50, 65, 100, 25 );
        add(labelID);
        
        campoID = new JTextField();
        campoID.setBounds( 100, 65, 100, 25 );
        add(campoID);
        
        excluir = new JButton();
        excluir.setText("Fechar");
        excluir.setBounds( 225, 175, 120, 25 );
        excluir.addActionListener( this );
        add(excluir);
        
        salvar = new JButton();
        salvar.setText("Converter");
        salvar.setBounds( 350, 175, 120, 25 );
        salvar.addActionListener( this );
        add(salvar);

        labelResultado = new JLabel("Resultado: ");
        labelResultado.setBounds(50, 100, 400, 25);
        add(labelResultado);
      
        setVisible(true);
    }

    public static void main(String[] args) {
        JanelaE janela = new JanelaE();

        janela.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println( ae.getActionCommand() );
        
        if( ae.getActionCommand().equals("Fechar") ) {
            dispose();
        } else if( ae.getActionCommand().equals("Converter") ) {
            System.out.println( campoID.getText() );
            double dolares = Double.parseDouble(campoID.getText()) / 6.2;
            labelResultado.setText(String.format("Resultado: %.2f dolares", dolares));
        }
        
    }
}
