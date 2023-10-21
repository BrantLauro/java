import java.util.Scanner;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Calendar calendario = Calendar.getInstance();
        String nome;
        int ano, idade;
        System.out.printf("Digite seu nome: ");
        nome = entrada.nextLine();
        System.out.printf("Digite seu ano de nascimento: ");
        ano = entrada.nextInt();
        idade = calendario.get(Calendar.YEAR) - ano;
        System.out.println("Olá, " + nome + " você tem " + idade + " anos!");
        entrada.close();
    }
}
