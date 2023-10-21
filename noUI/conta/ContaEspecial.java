package Conta;

public class ContaEspecial extends ContaCorrente {
    private double limite;

    public ContaEspecial(int numero, String titular, double saldo, double limite) {
        super(numero, titular, saldo);
        this.limite = limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String toString() {
        return super.toString() + " Limite: R$" + limite;
    }
}
