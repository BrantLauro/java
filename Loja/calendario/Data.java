package calendario;

public class Data {
    private Dia d;
    private Mes m;
    private Ano a;

    public Data(int dia, int mes, int ano) {
        d = new Dia();
        d.setDia(dia);
        m = new Mes();
        m.setMes(mes);
        a = new Ano();
        a.setAno(ano);
    }

    public int compara(Data data) {
        if(data.getAno() < a.getAno()) return 1;
        else if(data.getAno() > a.getAno()) return -1;
        else {
            if(data.getMes() < m.getMes()) return 1;
            else if(data.getMes() > m.getMes()) return -1;
            else{
                if(data.getDia() < d.getDia()) return 1;
                else if(data.getDia() > d.getDia()) return -1;
                else return 0;
            }
        }
    }

    public String extenso() {
        return d.getDia() + " de " + m.extenso() + " de " + a.getAno();
    }

    public int getDia() {
        return d.getDia();
    }

    public int getMes() {
        return m.getMes();
    }

    public int getAno() {
        return a.getAno();
    }
}

