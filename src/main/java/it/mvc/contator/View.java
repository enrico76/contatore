package it.mvc.contator;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Enrico
 */
public class View {
    private JFrame finestra;
    private JLabel etichetta;
    private JButton btnIncrementa;
    private JButton btnAzzera;
    
    public View(String titolo) {
        finestra = new JFrame(titolo);
        finestra.getContentPane().setLayout(new BorderLayout());
        finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        finestra.setSize(250, 250);
        finestra.setLocationRelativeTo(null);
        
        etichetta = new JLabel("0");
        etichetta.setHorizontalAlignment(SwingConstants.CENTER);
        etichetta.setFont(new Font(etichetta.getFont().getName(), Font.BOLD, 48));
        finestra.getContentPane().add(etichetta, BorderLayout.CENTER);
        
        btnAzzera = new JButton("Azzera");
        btnAzzera.setEnabled(false);
        finestra.getContentPane().add(btnAzzera, BorderLayout.NORTH);
        
        btnIncrementa = new JButton("Incrementa");
        finestra.getContentPane().add(btnIncrementa, BorderLayout.SOUTH);
        
        finestra.setVisible(true);
        
        
        
        
        
    }
    
}
