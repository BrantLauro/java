import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Tempo horaAtual = new Tempo();
        Tempo dif = new Tempo();
        int h, m, s;
        System.out.printf("Informe a hora:\n");
        h = ler.nextInt();
        System.out.printf("Informe o minuto:\n");
        m = ler.nextInt();
        System.out.printf("Informe o segundo:\n");
        s = ler.nextInt();
        horaAtual.setHora(h, m, s);
        dif.setHora(100, 100, 100);
        System.out.printf("Hora: %s\n", horaAtual);
        System.out.printf("dif: %d", horaAtual.subtrair(dif));
        ler.close();
    }
}
