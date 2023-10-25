package brantlauro.ex002;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;

public class Ex002 {

    public static void main(String[] args) {       
        try {
            UIManager.setLookAndFeel( new FlatLightLaf() );
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
      new MainFrame().setVisible(true);
    }
}
