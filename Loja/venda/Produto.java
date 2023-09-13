package venda;

public class Produto {
    private int codigo;
    private double valor;
    private String descricao;

    public Produto(int codigo, double valor, String descricao) {
        this.codigo = codigo;
        setValor(valor);
        setDescricao(descricao);
    }

    public void setValor(double valor) {
        if(valor <= 0) valor = 1;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
