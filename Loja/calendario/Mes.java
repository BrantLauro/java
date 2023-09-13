package calendario;

public class Mes {
    private int mes;

    public int getMes() {
        return mes;
    }

    public void setMes(int m) {
        if(m < 1 || m > 12) m = 1;
        mes = m;
    }

    public String extenso() {
        String[] Meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        return Meses[mes - 1];

    }
}
