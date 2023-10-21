package venda;
import calendario.*;

public class Pedido {
    private Produto itens[];
    private Data dataPedido;
    private int nroPedido;
    private int idCliente;
    private int quant;

    public Pedido(int num, int id, Data data, int quant) {
        dataPedido = new Data(data.getDia(), data.getMes(), data.getAno());
        nroPedido = num;
        idCliente = id;
        itens = new Produto[quant];
        this.quant = quant;
    }
    
    public void addProduto(Produto p) {
        itens[quant - 1] = p;
        quant --;
    }

    public double valorNota() {
        double valor = 0;
        for(int i = 0; i < itens.length; i++) {
            valor += itens[i].getValor();
        }
        return valor;
    }

    public int getNroPedido() {
        return nroPedido;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public Data getDataPedido() {
        return dataPedido;
    }
} 
