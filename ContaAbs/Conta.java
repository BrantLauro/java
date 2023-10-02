package ContaAbs;

public abstract class Conta {
    private int numero;
    private String titular;
    private double saldo;

    public Conta(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public abstract double getDisp();

    public void alterarSaldo(double valor) {
        if(getDisp() + valor >= 0){
            saldo += valor;
            System.out.println("Saldo: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
    
    public double getSaldo() {
        return saldo;
    }

    public String toString() {
        return "N°: " + numero + "\ttitular: " + titular + "\tsaldo: R$" + saldo;
    }

}
