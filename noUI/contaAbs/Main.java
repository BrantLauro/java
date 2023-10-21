package ContaAbs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Conta Contas[] = new Conta[100];
        int op = 0, num = 0, i = 0;
        String tt1, tt2;
        double sld, lim, valor;
        
        while(true) {
            System.out.println("===== BANCO DO HEVERALDO =====");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Conta Especial\n2 - Conta Conjunta\n3 - Pagar\n4 - Receber\n5 - Listas\n0 - Sair");
            System.out.printf("Opção: ");
            op = Integer.parseInt(entrada.nextLine());

            if(op == 1 || op == 2) {
                System.out.printf("Digite o número da conta: ");
                num = Integer.parseInt(entrada.nextLine());
                System.out.printf("Digite o nome do titular: ");
                tt1 = entrada.nextLine();
                System.out.printf("Digite o saldo: R$");
                sld = Double.parseDouble(entrada.nextLine());
                if(op == 1) {
                    System.out.printf("Digite o limite: R$");
                    lim = Double.parseDouble(entrada.nextLine());
                    Contas[i] = new ContaEspecial(num, tt1, sld, lim);
                } else {
                    System.out.printf("Digite o nome do titular 2: ");
                    tt2 = entrada.nextLine();
                    Contas[i] = new ContaConjunta(num, tt1, sld, tt2);
                }
                i++;
                if(i > 100) i = 0;
            } else if(op == 3 || op == 4) {
                System.out.printf("Digite o id da conta: ");
                num = Integer.parseInt(entrada.nextLine());
                System.out.printf("Digite o número da conta (>0): ");
                valor = Double.parseDouble(entrada.nextLine());
                if(op == 3) valor *= -1;
                Contas[num].alterarSaldo(valor);
            } else if(op == 5) {
                for(int j = 0)
            } else break;
        }
        entrada.close();
    }
}
