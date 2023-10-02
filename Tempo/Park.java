
public class Park {
    private String placa;
    private Tempo horaEntrada;
    private Tempo horaSaida;
    private double valor;
    //private static int quant = 0;
    private static int vagas = 3;

    public Park(String p) {
        horaEntrada = new Tempo();
        placa = p;
        vagas--;
    }

    public void entrada(String p) {
        horaEntrada = new Tempo();
        placa = p;
        vagas--;
    }

    public void saida(int hr, int min) {
        horaSaida = new Tempo(hr, min);
        vagas++;
        calcularValor();
    }

    private void calcularValor() {
        valor = (double) horaSaida.subtrair(horaEntrada) / 15;
        valor = valor * 3;
    }

    public String toString() {
        return "Veículo: " + placa + "\nEntrada: " + horaEntrada.toString() + " || Saída: " + horaSaida.toString() + "\nValor: R$" + Double.toString(valor);
    }

    public static int getVagas() {
        return vagas;
    }
    
    public String getPlaca() {
        return placa;
    }
}