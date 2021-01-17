
package it.enrico.contatore;

import javax.swing.SwingUtilities;

/**
 *
 * @author Enrico
 */
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Model modello = new Model();
                View vista = new View("Contatore");
                Controller controller = new Controller(vista, modello);
                controller.assegnaGestori();
            }
        });
    }
}
