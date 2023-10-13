package equacaoCMD;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a, b, c, delta; double x1, x2;

        System.out.printf("Digite o a: ");
        a = Integer.parseInt(ler.nextLine());
        System.out.printf("Digite o b: ");
        b = Integer.parseInt(ler.nextLine());
        System.out.printf("Digite o c: ");
        c = Integer.parseInt(ler.nextLine());
        delta = (int) (Math.pow(b, 2) - (4 * a * c));
        if(delta < 0) System.out.println("Não existem raizes reais");
        else {
            x1 = (-b + Math.pow(delta, 0.5)) / (2*a);
            x2 = (-b - Math.pow(delta, 0.5)) / (2*a);
            System.out.printf("x1 = %.2f e x2 = %.2f", x1, x2);
        }
        ler.close();
    }
}
