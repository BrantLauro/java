package calendario;

public class Dia {
    private int dia;

    public int getDia() {
        return dia;
    }

    public void setDia(int d) {
        if(d < 1 || d > 31) {
            d = 1;
        }
        dia = d;
    }
}
