
public class Park {
    String placa;
    Tempo horaEntrada;
    Tempo horaSaida;
    double valor;

    public Park(String p) {
        horaEntrada = new Tempo();
        placa = p;
    }

    public void saida(int hr, int min) {
        horaSaida = new Tempo(hr, min);
        calcularValor();
    }

    public void calcularValor() {
        valor = (double) horaSaida.subtrair(horaEntrada) / 15;
        valor = valor * 3;
    }

    public String toString() {
        return "O carro com a placa " + placa + " que entrou as " + horaEntrada.toString() + " e saiu as " + horaSaida.toString() + " deverá pagar R$" + Double.toString(valor);
    }
}