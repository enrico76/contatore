
package it.enrico.contatore;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Enrico
 */
public class Controller {
    private View vista;
    private Model modello;
    
    public Controller(View vista, Model modello) {
        this.modello = modello;
        this.vista = vista;
    }
    
    public void assegnaGestori() {
        ActionListener gestoreIncremento;
        ActionListener gestoreAzzeramento;
        
        gestoreIncremento = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modello.incrementa();
                vista.setEtichetta(Integer.toString(modello.getX()));
                if (modello.isAzzerabile()) {
                    vista.getBtnAzzera().setEnabled(true);
                    
                }
            }
        };
        
        vista.getBtnIncrementa().addActionListener(gestoreIncremento);
        
        
        gestoreAzzeramento = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modello.azzera();
                vista.setEtichetta("0");
                vista.getBtnAzzera().setEnabled(false);
            }
        };
        
        vista.getBtnAzzera().addActionListener(gestoreAzzeramento);
    }
    
}
