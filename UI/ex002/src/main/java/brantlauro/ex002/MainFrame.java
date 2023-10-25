package brantlauro.ex002;

import com.formdev.flatlaf.FlatClientProperties;
import javax.swing.JSpinner.DefaultEditor;
import javax.swing.UIManager;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        UIManager.put( "Component.arrowType", "triangle" );
        UIManager.put( "Component.arc", 10);
        initComponents();
        panel.putClientProperty( FlatClientProperties.STYLE, "arc: 15" );
        ((DefaultEditor) jSpinner.getEditor()).getTextField().setEditable(false);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jSpinner = new javax.swing.JSpinner();
        jLabeltxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel.setBackground(new java.awt.Color(223, 223, 223));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitle.setFont(new java.awt.Font("Rosario", 1, 55)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(41, 41, 41));
        jLabelTitle.setText("Fatorial Calculator");
        panel.add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 22, -1, -1));

        jSpinner.setFont(new java.awt.Font("TT Hoves Pro Trial", 0, 28)); // NOI18N
        jSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        jSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerStateChanged(evt);
            }
        });
        panel.add(jSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 128, 72));

        jLabeltxt.setFont(new java.awt.Font("TT Hoves Pro Trial", 0, 28)); // NOI18N
        jLabeltxt.setText("1");
        jLabeltxt.setToolTipText("");
        panel.add(jLabeltxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));

        jLabel1.setFont(new java.awt.Font("TT Hoves Pro Trial", 0, 28)); // NOI18N
        jLabel1.setText("! =");
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 37, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerStateChanged
        jLabeltxt.setText(Long.toString(fat((int) jSpinner.getValue())));
    }//GEN-LAST:event_jSpinnerStateChanged

    private long fat(int n) {
        if(n == 0) return 1;
        return fat(n-1) * n;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabeltxt;
    private javax.swing.JSpinner jSpinner;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
