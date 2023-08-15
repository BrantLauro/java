import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Data dataAtual = new Data();
        int d, m, a;
        System.out.printf("Informe o dia:\n");
        d = ler.nextInt();
        System.out.printf("Informe o mes (número):\n");
        m = ler.nextInt();
        System.out.printf("Informe o ano:\n");
        a = ler.nextInt();
        dataAtual.setData(d, m, a);
        dataAtual.mostrar();
        ler.close();
    }
}

class Data {
    private int Dia, Mes, Ano;
    Scanner ler = new Scanner(System.in);

    public void setData(int d, int m, int a) {
        if (0 < d && d < 32)
            Dia = d;
        else {
            while (d < 1 || d > 31) {
                System.out.printf("Dia inválido, digite um dia entre 1 e 31:\n");
                d = ler.nextInt();
            }
            Dia = d;
        }
        if (0 < m && m < 13)
            Mes = m;
        else {
            while (m < 1 || m > 12) {
                System.out.printf("Mês inválido, digite um mês entre 1 e 12:\n");
                m = ler.nextInt();
            }
            Mes = m;
        }
        if (a > 0)
            Ano = a;
        else {
            while (a < 1) {
                System.out.printf("Ano inválido, digite um ano maior que 0:\n");
                a = ler.nextInt();
            }
            Ano = a;
        }
        ler.close();
    }

    public void mostrar() {
        System.out.printf("%d/%d/%d", Dia, Mes, Ano);
    }
}
