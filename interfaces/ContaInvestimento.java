package interfaces;

public class ContaInvestimento implements Conta {
    String nome;
    double valorInvestido;
    double rendimento;

    public ContaInvestimento(String nome, double valorInvestido) {
        this.nome = nome;
        this.valorInvestido = valorInvestido;
        rendimento = 0;
    }

    public double getSaldo() {
        rendimento++;
        return valorInvestido + rendimento;
    }

    public void setSaldo(double valorInvestido) {
        this.valorInvestido = valorInvestido;
        rendimento = 0;
    }

    public String toString() {
        return "Nome: " + nome + ", Valor Investido: R$" + valorInvestido + ", Rendimento: R$" + rendimento;
    }

    

}
