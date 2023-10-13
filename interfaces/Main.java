package interfaces;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Conta contas[] = new Conta[5];
        int op = 0, num;
        double sal, vi;
        String n;
        
        for(int i = 0; i < 5; i++) {
            System.out.printf("LBANK\n[1] Conta Corrente;\n[2] Conta Investimento;\nEscolha: ");
            op = Integer.parseInt(ler.nextLine());
            System.out.printf("Digite o nome: ");
            n = ler.nextLine();
            if(op == 1) {
                System.out.printf("Digite o número: ");
                num = Integer.parseInt(ler.nextLine());
                System.out.printf("Digite o Saldo: ");
                sal = Double.parseDouble(ler.nextLine());
                contas[i] = new ContaCorrente(num, n, sal);
            } else if(op == 2) {
                System.out.printf("Digite o Valor Investido: ");
                vi = Double.parseDouble(ler.nextLine());
                contas[i] = new ContaInvestimento(n, vi);
            }
        }

        for(int i = 0; i < 5; i++) {
            System.out.println(contas[i]);
        }

        ler.close();
    }
}
