package Interface;

public class ContaCorrente implements Conta {
    int numero;
    String titular;
    double saldo;

    public ContaCorrente(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String toString() {
        return "Número: " + numero + ", Titular: " + titular + ", Saldo: R$" + saldo;
    }

    
}
