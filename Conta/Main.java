package Conta;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ContaCorrente[] contas = new ContaCorrente[5];
        int op = 0, num;
        double sal, lim;
        String n;
        for(int i = 0; i < 5; i++) {
            System.out.printf("LBANK\n[1] Conta Corrente;\n[2] Conta Especial;\nEscolha: ");
            op = Integer.parseInt(ler.nextLine());
            System.out.printf("Digite o nome: ");
            n = ler.nextLine();
            System.out.printf("Digite o número: ");
            num = Integer.parseInt(ler.nextLine());
            System.out.printf("Digite o Saldo: ");
            sal = Double.parseDouble(ler.nextLine());
            if(op == 1)
                contas[i] = new ContaCorrente(num, n, sal);
            else if(op == 2) {
                System.out.printf("Digite o limite: ");
                lim = Double.parseDouble(ler.nextLine());
                contas[i] = new ContaEspecial(num, n, sal, lim);
            }
        }

        for(int i = 0; i < 5; i++) {
            System.out.println(contas[i]);
        }

        /*ContaCorrente c1 = new ContaCorrente(100, "Lauro", 4.5);
        c1.setNumero(100);
        c1.setTiltular("Lauro");
        c1.setSaldo(4.5);
        System.out.println(c1);
        ContaEspecial ce1 = new ContaEspecial(c1.getNumero(), c1.getTitular(), c1.getSaldo(),  20000.50);
        System.out.println(ce1);*/
        ler.close();
    }
}
