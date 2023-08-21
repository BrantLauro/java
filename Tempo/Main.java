import java.util.Scanner;

public class Main {
    /*
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
        horaAtual.setHora(h, m);
        System.out.printf("Hora: %s\n", dif);
        System.out.printf("dif: %d", horaAtual.subtrair(dif));
        ler.close();
    }
    */
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Park pk;
        String p;
        int h, m;

        System.out.println("Digite a placa");
        p = ler.nextLine();
        pk = new Park(p);
        System.out.println("Informe a hora: ");
        h = ler.nextInt();
        System.out.println("Informe o minuto: ");
        m = ler.nextInt();
        pk.saida(h, m);
        System.out.println(pk.toString());
        ler.close();
    }
}
