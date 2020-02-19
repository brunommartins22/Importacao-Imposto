package br.com.interage.importacao.app;

import br.com.interage.importacao.utils.AppLock;
import br.com.interage.importacao.view.JDlgSplashScreen;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {

    public static void main(String[] args) throws Exception {
        
        if (AppLock.lock()) {

            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            Runnable runnable = new JDlgSplashScreen.ShowAndWait();
            runnable.run();
        } else {
            JOptionPane.showMessageDialog(null, "A aplicação já se encontra em execução!", "InterDownload-NFe", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
    }

}
