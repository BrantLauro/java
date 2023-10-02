package ContaAbs;

public class ContaConjunta extends Conta{
    private String titular2;

    public ContaConjunta(int numero, String titular, double saldo, String titular2){
        super(numero, titular, saldo);
        this.titular2 = titular2;
    } 

    public double getDisp() {
        return super.getSaldo();
    }

    public String toString() {
        return super.toString() + "\tTitular 2: " + titular2; 
    }
}
