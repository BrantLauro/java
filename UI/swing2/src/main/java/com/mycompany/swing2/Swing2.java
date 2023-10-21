package com.mycompany.swing2;

import com.formdev.flatlaf.*;
import javax.swing.*;

public class Swing2 {

    public static void main(String[] args) {       
        try {
            UIManager.setLookAndFeel( new FlatDarkLaf() );
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }

      new MainFrame().setVisible(true);
    }
}
