package swing;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JFrameMain extends JFrame {
    private JFrame jFrameMain;
    private JLabel jLabelTitle;
    private JLabel jLabelCode;
    private JLabel jLabelName;
    private JTextField jTextFieldCode;
    private JTextField jTextFieldName;
    private JButton jButtonOk;
    private JLabel jLabeltxt;

    public JFrameMain(String title) throws HeadlessException {
        super(title);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(190, 200);
        setLayout(new FlowLayout());

        jFrameMain = new JFrame("Cadastro de Clientes");
        jLabelTitle = new JLabel("Brant's Software Ltda.");
        jLabelCode = new JLabel("Código:");
        jLabelName = new JLabel("Nome:");
        jTextFieldCode = new JTextField(10);
        jTextFieldName = new JTextField(10);
        jButtonOk = new JButton("OK", null);
        jLabeltxt = new JLabel("");

        jButtonOk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String cod = jTextFieldCode.getText();
                String name = jTextFieldName.getText();
                String str = "Olá " + name + " Seu código é: " + cod;
                jLabeltxt.setText(str);
            }
        });

        add(jLabelTitle);
        add(jLabelCode);
        add(jTextFieldCode);
        add(jLabelName);
        add(jTextFieldName);
        add(jButtonOk);
        add(jLabeltxt);
    }
}
