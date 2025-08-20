package aulas.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JanelaA extends JFrame implements ActionListener{
    
    private JLabel labelID;
    private JTextField campoID;
    
    private JButton excluir;
    private JButton salvar;
    
    public JanelaA(){
        setTitle("JanelaA");
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        setSize(500,250);
        setResizable(false);
        
        setLayout(null);
        setLocationRelativeTo(null);
        
        labelID = new JLabel();
        labelID.setText("ID: ");
        labelID.setBounds(50, 50, 50, 25);
        add(labelID);
        
        campoID = new JTextField();
        campoID.setBounds(75, 50, 250, 25);
        add(campoID);
        
        excluir = new JButton();
        excluir.setText("Excluir");
        excluir.setBounds(300, 175, 80, 25);
        excluir.addActionListener( this );
        add(excluir);
        
        salvar = new JButton();
        salvar.setText("Salvar");
        salvar.setBounds(400, 175, 80, 25);
        salvar.addActionListener( this );
        add(salvar);
        
        
        setVisible(true);
    }
    
    
    public static void main(String[] args) {
        JanelaA janela = new JanelaA();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println( ae.getActionCommand() );
        
        if( ae.getActionCommand().equals("Excluir")){
            campoID.setText("");
        }else if(ae.getActionCommand().equals("Salvar")){
            System.out.println(campoID.getText());
            campoID.setText("");
        }
    }
            
}
