package loja;

import calendario.*;
import venda.*;
import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args) {
        int id, num, d, m, a, quant, cod, op, i = 0; double v; String desc;
        Produto prod[] = new Produto[1000000];
        Pedido ped[] = new Pedido[200];
        Data data;
        while(true) {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opção:\n1 - Registrar produto\n2 -  Registrar Pedido\n4 - Sair"));
            if(op == 1) {
                cod = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código:"));
                v = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor:"));
                desc = JOptionPane.showInputDialog(null, "Digite a descição:");
                prod[cod] = new Produto(cod, v, desc);
            } else if(op == 2) {
                num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número do pedido:"));
                id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o id do cliente:"));
                quant = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de produtos:"));
                d = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Dia:"));
                m = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Mes:"));
                a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Ano:"));
                data = new Data(d, m, a);
                ped[i] = new Pedido(num, id, data, quant);
                for(int c = 0; c < quant; c++) {
                    cod = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código:"));
                    ped[i].addProduto(prod[cod]);
                }
                JOptionPane.showMessageDialog(null, "Valor total = " + ped[i].valorNota());
                i++;
                if(i > 200) i = 0;
            }
            else break;
        }
    }
}
