package Conta;

public class ContaCorrente {
    private int numero;
    private String titular;
    private double saldo;
    
    public ContaCorrente(int numero, String titutlar, double saldo) {
        this.numero = numero;
        this.titular = titutlar;
        this.saldo = saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTiltular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String toString() {
        return "Titular: " + titular + " N°: " + numero + " Saldo: R$" + saldo;
    }

}
