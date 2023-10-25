package brantlauro.ex003;

import com.formdev.flatlaf.FlatClientProperties;

import java.awt.Insets;
import javax.swing.DefaultListModel;
import javax.swing.UIManager;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        UIManager.put( "Button.arc", 10);
        UIManager.put( "ScrollBar.thumbArc", 10);
        UIManager.put( "ScrollBar.thumbInsets", new Insets( 2, 2, 2, 2 ));
        initComponents();
        initTheme();
    }
    
    public void initTheme() {
         jPanelMain.putClientProperty( FlatClientProperties.STYLE, "arc: 15" );
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBack = new javax.swing.JPanel();
        jPanelButtons = new javax.swing.JPanel();
        jButtonCont = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jPanelMain = new javax.swing.JPanel();
        jSliderFrom = new javax.swing.JSlider();
        jSliderTo = new javax.swing.JSlider();
        jSliderBy = new javax.swing.JSlider();
        jLabelTitle = new javax.swing.JLabel();
        jLabelFrom = new javax.swing.JLabel();
        jLabelFromValue = new javax.swing.JLabel();
        jLabelTo = new javax.swing.JLabel();
        jLabelToValue = new javax.swing.JLabel();
        jLabelBy = new javax.swing.JLabel();
        jLabelByValue = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        jList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Couter");
        setResizable(false);

        jPanelBack.setBackground(new java.awt.Color(239, 239, 239));

        jPanelButtons.setBackground(new java.awt.Color(212, 81, 93));

        jButtonCont.setBackground(new java.awt.Color(239, 239, 239));
        jButtonCont.setFont(new java.awt.Font("Rosario", 1, 18)); // NOI18N
        jButtonCont.setForeground(new java.awt.Color(41, 41, 41));
        jButtonCont.setText("Count");
        jButtonCont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContActionPerformed(evt);
            }
        });

        jButtonExit.setBackground(new java.awt.Color(239, 239, 239));
        jButtonExit.setFont(new java.awt.Font("Rosario", 1, 18)); // NOI18N
        jButtonExit.setForeground(new java.awt.Color(41, 41, 41));
        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelButtonsLayout = new javax.swing.GroupLayout(jPanelButtons);
        jPanelButtons.setLayout(jPanelButtonsLayout);
        jPanelButtonsLayout.setHorizontalGroup(
            jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonsLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonCont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanelButtonsLayout.setVerticalGroup(
            jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonsLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jButtonCont)
                .addGap(18, 18, 18)
                .addComponent(jButtonExit)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        jPanelMain.setBackground(new java.awt.Color(223, 223, 223));

        jSliderFrom.setBackground(new java.awt.Color(239, 239, 239));
        jSliderFrom.setForeground(new java.awt.Color(212, 81, 93));
        jSliderFrom.setMaximum(5);
        jSliderFrom.setValue(0);
        jSliderFrom.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderFromStateChanged(evt);
            }
        });

        jSliderTo.setBackground(new java.awt.Color(239, 239, 239));
        jSliderTo.setForeground(new java.awt.Color(212, 81, 93));
        jSliderTo.setMaximum(50);
        jSliderTo.setMinimum(5);
        jSliderTo.setValue(5);
        jSliderTo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderToStateChanged(evt);
            }
        });

        jSliderBy.setBackground(new java.awt.Color(239, 239, 239));
        jSliderBy.setForeground(new java.awt.Color(212, 81, 93));
        jSliderBy.setMaximum(5);
        jSliderBy.setMinimum(1);
        jSliderBy.setValue(1);
        jSliderBy.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderByStateChanged(evt);
            }
        });

        jLabelTitle.setFont(new java.awt.Font("Rosario", 1, 24)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(41, 41, 41));
        jLabelTitle.setText("Let's Count");

        jLabelFrom.setFont(new java.awt.Font("TT Hoves Pro Trial", 0, 14)); // NOI18N
        jLabelFrom.setForeground(new java.awt.Color(41, 41, 41));
        jLabelFrom.setText("From");

        jLabelFromValue.setFont(new java.awt.Font("TT Hoves Pro Trial", 0, 14)); // NOI18N
        jLabelFromValue.setForeground(new java.awt.Color(41, 41, 41));
        jLabelFromValue.setText("0");

        jLabelTo.setFont(new java.awt.Font("TT Hoves Pro Trial", 0, 14)); // NOI18N
        jLabelTo.setForeground(new java.awt.Color(41, 41, 41));
        jLabelTo.setText("To");

        jLabelToValue.setFont(new java.awt.Font("TT Hoves Pro Trial", 0, 14)); // NOI18N
        jLabelToValue.setForeground(new java.awt.Color(41, 41, 41));
        jLabelToValue.setText("5");

        jLabelBy.setFont(new java.awt.Font("TT Hoves Pro Trial", 0, 14)); // NOI18N
        jLabelBy.setForeground(new java.awt.Color(41, 41, 41));
        jLabelBy.setText("By");

        jLabelByValue.setFont(new java.awt.Font("TT Hoves Pro Trial", 0, 14)); // NOI18N
        jLabelByValue.setForeground(new java.awt.Color(41, 41, 41));
        jLabelByValue.setText("1");

        jScrollPane.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jList.setBackground(new java.awt.Color(239, 239, 239));
        jList.setBorder(null);
        jList.setFont(new java.awt.Font("TT Hoves Pro Trial", 0, 24)); // NOI18N
        jList.setForeground(new java.awt.Color(41, 41, 41));
        jList.setSelectionBackground(new java.awt.Color(223, 223, 223));
        jList.setSelectionForeground(new java.awt.Color(41, 41, 41));
        jScrollPane.setViewportView(jList);

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabelTitle))
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelMainLayout.createSequentialGroup()
                                .addComponent(jLabelFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSliderFrom, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelFromValue, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelMainLayout.createSequentialGroup()
                                .addComponent(jLabelTo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSliderTo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelToValue, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelMainLayout.createSequentialGroup()
                                .addComponent(jLabelBy, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSliderBy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelByValue, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSliderFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFrom)
                    .addComponent(jLabelFromValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSliderTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTo)
                    .addComponent(jLabelToValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSliderBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelByValue)
                    .addComponent(jLabelBy))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelBackLayout = new javax.swing.GroupLayout(jPanelBack);
        jPanelBack.setLayout(jPanelBackLayout);
        jPanelBackLayout.setHorizontalGroup(
            jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackLayout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addComponent(jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelBackLayout.createSequentialGroup()
                    .addComponent(jPanelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 491, Short.MAX_VALUE)))
        );
        jPanelBackLayout.setVerticalGroup(
            jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelButtons, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonContActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContActionPerformed
        DefaultListModel lista = new DefaultListModel();
        for(int i = jSliderFrom.getValue(); i <= jSliderTo.getValue(); i += jSliderBy.getValue()) {
            lista.addElement(i);
        }
        jList.setModel(lista);
    }//GEN-LAST:event_jButtonContActionPerformed

    private void jSliderFromStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderFromStateChanged
        jLabelFromValue.setText("" + jSliderFrom.getValue());
    }//GEN-LAST:event_jSliderFromStateChanged

    private void jSliderToStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderToStateChanged
        jLabelToValue.setText("" + jSliderTo.getValue());
    }//GEN-LAST:event_jSliderToStateChanged

    private void jSliderByStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderByStateChanged
        jLabelByValue.setText("" + jSliderBy.getValue());
    }//GEN-LAST:event_jSliderByStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCont;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JLabel jLabelBy;
    private javax.swing.JLabel jLabelByValue;
    private javax.swing.JLabel jLabelFrom;
    private javax.swing.JLabel jLabelFromValue;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTo;
    private javax.swing.JLabel jLabelToValue;
    private javax.swing.JList<String> jList;
    private javax.swing.JPanel jPanelBack;
    private javax.swing.JPanel jPanelButtons;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JSlider jSliderBy;
    private javax.swing.JSlider jSliderFrom;
    private javax.swing.JSlider jSliderTo;
    // End of variables declaration//GEN-END:variables
}
