package MapaMundi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import MapaMundi.JanelaC;
import MapaMundi.JanelaE;


public class JanelaPrincipal extends JFrame implements ActionListener, KeyListener {
    
    private JMenuBar jMenuBarPrincipal;

    private JLabel labelA;
    private JLabel labelB;

    private JMenu jMenu1;
    private JMenu jMenu2;
    private JMenu jMenu3;
    private JMenu jMenu4;
    private JMenu jMenu5;
    
    private JMenuItem jMenuItem1;
    private JMenuItem jMenuItem2;
    private JMenuItem jMenuItem3;
    private JMenuItem jMenuItem4;
    private JMenuItem jMenuItem5;
    private JMenuItem jMenuItem6;
    private JMenuItem jMenuItem7;
    private JMenuItem jMenuItem8;
    private JMenuItem jMenuItem9;

    /*private JButton AmericaAt;
    private JButton EuropaAt;
    private JButton AfricaAt;
    private JButton AsiaAt;
    private JButton OceaniaAt;*/
    
    private boolean atalhoJanelaA;

    public JanelaPrincipal() {
        
        super("Mapa-mundi");
        
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setSize(600, 400);
        setResizable(false);
        
        setLayout(null);


        labelA = new JLabel();
        labelA.setText("Bem Vindo ao Mapa-mundi!");
        labelA.setBounds( 50, 100, 200, 25 );
        add(labelA);

        labelB = new JLabel();
        labelB.setText("Selecione um país para conhecer sua curiosidade");
        labelB.setBounds( 50, 150, 400, 25 );
        add(labelB);
        
        jMenuBarPrincipal = new JMenuBar();
        jMenuBarPrincipal.setBounds(12, 45, 600, 25);
        add(jMenuBarPrincipal);
        
        jMenu1 = new JMenu("America");
        jMenuBarPrincipal.add(jMenu1);
                
        jMenu2 = new JMenu("Europa");
        jMenuBarPrincipal.add(jMenu2);

        jMenu3 = new JMenu("Africa");
        jMenuBarPrincipal.add(jMenu3);

        jMenu4 = new JMenu("Asia");
        jMenuBarPrincipal.add(jMenu4);

        jMenu5 = new JMenu("Oceania");
        jMenuBarPrincipal.add(jMenu5);
        
        jMenuItem1 = new JMenuItem("Estados Unidos");
        jMenuItem1.addActionListener(this);
        jMenu1.add(jMenuItem1);

        jMenuItem2 = new JMenuItem("Chile");
        jMenuItem2.addActionListener(this);
        jMenu1.add(jMenuItem2);

        jMenuItem3 = new JMenuItem("Italia");
        jMenuItem3.addActionListener(this);
        jMenu2.add(jMenuItem3);

        jMenuItem4 = new JMenuItem("Suiça");
        jMenuItem4.addActionListener(this);
        jMenu2.add(jMenuItem4);

        jMenuItem5 = new JMenuItem("Egito");
        jMenuItem5.addActionListener(this);
        jMenu3.add(jMenuItem5);

        jMenuItem6 = new JMenuItem("Argelia");
        jMenuItem6.addActionListener(this);
        jMenu3.add(jMenuItem6);

        jMenuItem7 = new JMenuItem("Japão");
        jMenuItem7.addActionListener(this);
        jMenu4.add(jMenuItem7);

        jMenuItem8 = new JMenuItem("Singapura");
        jMenuItem8.addActionListener(this);
        jMenu4.add(jMenuItem8);

        jMenuItem9 = new JMenuItem("Australia");
        jMenuItem9.addActionListener(this);
        jMenu5.add(jMenuItem9);
        
        addKeyListener(this);
        
        setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println("Evento capturado: " + ae.getActionCommand());
        
        if( ae.getActionCommand().equals("Chile") ) {
            System.out.println("Abrindo JanelaC...");
            JanelaC janela = new JanelaC();
            janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        } else if( ae.getActionCommand().equals("Estados Unidos") ){
            JanelaE janela = new JanelaE();
            janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        } else if( ae.getActionCommand().equals("Italia") ){
            JanelaI janela = new JanelaI();
            janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        } else if( ae.getActionCommand().equals("Suiça") ){
            JanelaSu janela = new JanelaSu();
            janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        } else if( ae.getActionCommand().equals("Egito") ){
            JanelaEg janela = new JanelaEg();
            janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        } else if( ae.getActionCommand().equals("Argelia") ){
            JanelaAr janela = new JanelaAr();
            janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        } else if( ae.getActionCommand().equals("Japão") ){
            JanelaJ janela = new JanelaJ();
            janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        } else if( ae.getActionCommand().equals("Singapura") ){
            JanelaSi janela = new JanelaSi();
            janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        } else if( ae.getActionCommand().equals("Australia") ){
            JanelaAu janela = new JanelaAu();
            janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }  
    
    public static void main(String[] args) {
        JanelaPrincipal janela = new JanelaPrincipal();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    

    @Override
    public void keyTyped(KeyEvent ke) {}

    @Override // alguns atalhos de janelas
    public void keyPressed(KeyEvent ke) {
        int keyCode = ke.getKeyCode();
        
        System.out.println( keyCode );
        
        if( keyCode == 17 ) {
            atalhoJanelaA = true;
        } else {
        
            if( atalhoJanelaA && 
                    keyCode == 67 ) {

                JanelaC janela = new JanelaC();
                janela.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
            } 

            else if( atalhoJanelaA && 
                    keyCode == 83 ) {

                JanelaSu janela = new JanelaSu();
                janela.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
            }

            else if( atalhoJanelaA && 
                    keyCode == 65 ) {

                JanelaAr janela = new JanelaAr();
                janela.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
            } 
            
            else if( atalhoJanelaA && 
                    keyCode == 74 ) {

                JanelaJ janela = new JanelaJ();
                janela.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
            }
            
            else if( atalhoJanelaA && 
                    keyCode == 73 ) {

                JanelaI janela = new JanelaI();
                janela.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
            }
            
            else if( atalhoJanelaA && 
                    keyCode == 69 ) {

                JanelaE janela = new JanelaE();
                janela.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
            }   else {
                atalhoJanelaA = false;
            }
            
        }
        
    }

    @Override
    public void keyReleased(KeyEvent ke) {}
        
}
