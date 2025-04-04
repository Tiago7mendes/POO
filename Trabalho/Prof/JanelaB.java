package Prof;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class JanelaB extends JFrame implements ActionListener, KeyListener {
    
    private JMenuBar jMenuBarPrincipal;
    
    private JMenu jMenu1;
    private JMenu jMenu2;
    
    private JMenuItem jMenuItemJanelaA;
    
    private boolean atalhoJanelaA;

    public JanelaB() {
        
        super("Bla Bla");
        
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setSize(960, 540);
        setResizable(false);
        
        setLayout(null);
        
        jMenuBarPrincipal = new JMenuBar();
        jMenuBarPrincipal.setBounds(0, 0, 960, 25);
        add(jMenuBarPrincipal);
        
        jMenu1 = new JMenu("Menu 1");
        jMenuBarPrincipal.add(jMenu1);
                
        jMenu2 = new JMenu("Menu 2");
        jMenuBarPrincipal.add(jMenu2);
        
        jMenuItemJanelaA = new JMenuItem("Janela A");
        jMenuItemJanelaA.addActionListener(this);
        jMenu1.add(jMenuItemJanelaA);
        
        addKeyListener(this);
        
        setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println(ae.getActionCommand());
        
        if( ae.getActionCommand().equals("Janela A") ) {
            JanelaA janela = new JanelaA();
            janela.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
        }      
    }    

    @Override
    public void keyTyped(KeyEvent ke) {}

    @Override
    public void keyPressed(KeyEvent ke) {
        int keyCode = ke.getKeyCode();
        
        System.out.println( keyCode );
        
        if( keyCode == 17 ) {
            atalhoJanelaA = true;
        } else {
        
            if( atalhoJanelaA && 
                    keyCode == 65 ) {

                JanelaA janela = new JanelaA();
                janela.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
            } else {
                atalhoJanelaA = false;
            }
            
        }
        
    }

    @Override
    public void keyReleased(KeyEvent ke) {}
        
}
