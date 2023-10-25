package brantlauro.ex003;

import javax.swing.UIManager;
import com.formdev.flatlaf.themes.FlatMacLightLaf;

public class Ex003 {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel( new FlatMacLightLaf() );
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        new MainFrame().setVisible(true);
    }
}
