package it.enrico.contatore;

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
    private JFrame finestra; //finestra della UI
    private JLabel etichetta; //per visualizzare il valore del contatore
    private JButton btnIncrementa; // incrementa il contatore
    private JButton btnAzzera; //per azzerare il contatore
    
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
        finestra.getContentPane().add(btnIncrementa, BorderLayout.NORTH);
        
        btnIncrementa = new JButton("Incrementa");
        finestra.getContentPane().add(btnIncrementa, BorderLayout.SOUTH);
        
        finestra.setVisible(true);
        
    }
    
    public JButton getBtnIncrementa() {
        return btnIncrementa;
    }
    /**
     * fornisce il riferimento del bottone per l'azzeramento
     * @return Riferimento del bottone
     */
    public JButton getBtnAzzera() {
        return btnAzzera;
    }
    
    /**
     * scrive nell'etichetta il valore passato
     * @param valore 
     */
    public void setEtichetta(String valore) {
        etichetta.setText(valore);
    }

    
}
