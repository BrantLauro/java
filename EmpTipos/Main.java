package EmpTipos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ListaEncadeada<Double> le = new ListaEncadeada<Double>();
        double n;
        for(double i = 0; i < 10; i++) {
            n = Double.parseDouble(ler.nextLine());
            le.inserir(n);
        }
        le.imprimir();
        ler.close();
    }
}
