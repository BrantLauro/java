package calendario;

public class Ano {
    private int ano;

    public int getAno() {
        return ano;
    }

    public void setAno(int a) {
        if(a < 1900 || a > 2023) a = 2023;
        ano = a;
    }
}
