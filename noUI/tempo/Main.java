import java.util.Scanner;


public class Main {   
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Park pk[] = new Park[Park.getVagas()];
    String p;
    boolean flag = true;
    int h, m, i = 0, j = 0, op, idx = 0, totalVagas = Park.getVagas();
    while(true) {
      System.out.println("\n============== ESTACIONAMENTO ==============");
      System.out.println("Escolha uma opção:");
      System.out.println("1 - Registrar carro");
      System.out.println("2 - Registrar saída");
      System.out.println("3 - Listar");       
      System.out.println("4 - Sair");
      System.out.printf("Escolha: ");
      op = Integer.parseInt(ler.nextLine());
      //op = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opção:\n1 - Registrar carro\n2 -  RegistrarSaída\n3 - Listar\n4 - Sair"));
      if(op == 1) {
        System.out.println();
        if(Park.getVagas() > 0) {
          System.out.printf("Digite a placa: ");
          p = ler.nextLine();
          //p = JOptionPane.showInputDialog(null, "Digite a Placa");
          for(i = 0; i < totalVagas; i++) {
            if(pk[i] == null) {
              pk[i] = new Park(p);
              idx = i;
              break;
            }
          }
          System.out.printf("Carro: %s || Estacionamento : %d\n", p, idx);
          //JOptionPane.showMessageDialog(null, "Carro: " + p + " || Estacionamento : " + i);
        } else System.out.println("Não há vagas!!"); //JOptionPane.showMessageDialog(null, "Não há vagas!!");
      } else if(op == 2) {
        System.out.println();
        System.out.printf("Informe o estacionamento: ");
        idx = Integer.parseInt(ler.nextLine());
        if(idx > totalVagas || idx < 0){
          System.out.println("ERRO! Vaga Inexistente.");
          continue;
        } else if(pk[idx] == null){
          System.out.println("ERRO! Não há carros nesta vaga.");
          continue;
        }
        //idx = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o estacionamento"));
        System.out.printf("Informe a hora: ");
        h = Integer.parseInt(ler.nextLine());
        //h = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a hora da saída"));
        System.out.printf("Informe o minuto: ");
        m = Integer.parseInt(ler.nextLine());
        // m = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o minuto da saída"));
        pk[idx].saida(h, m);
        System.out.println();
        System.out.println(pk[idx].toString());
        pk[idx] = null;
        //JOptionPane.showMessageDialog(null, pk[idx]);
      } else if(op == 3) {
        System.out.println();
        flag = true;
        for(j = 0; j < totalVagas; j++) {
          if(pk[j] != null) {
            flag = false;
            System.out.println("Vaga: " + j + " || Carro: " + pk[j].getPlaca());
            //JOptionPane.showMessageDialog(null, "carro: " + j + " " + pk[j].placa);
          }
        }
        if(flag) System.out.println("Não há carros estacionados!");
      } else break;
    }
    ler.close();
  }
}
