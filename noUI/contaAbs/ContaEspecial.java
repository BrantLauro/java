package ContaAbs;

public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(int numero, String titular, double saldo, double limite){
        super(numero, titular, saldo);
        this.limite = limite;
    } 

    public double getDisp() {
        return super.getSaldo() + limite;
    }

    public void alterarLimite(double limite) {
        this.limite = limite;
    }

    public String toString() {
        return super.toString() + "\tlimite: " + limite; 
    }
}
