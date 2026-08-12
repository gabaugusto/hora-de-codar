import java.util.Scanner;

class Main {

  public static void reserva_quartos() {
    System.out.println("HOTEL {NOME DO HOTEL} - RESERVA DE QUARTOS");
    main(null);
  }

  public static void cadastro_hospedes() {
    System.out.println("HOTEL {NOME DO HOTEL} - CADASTRO DE HÓSPEDES");
    main(null);
  }

  public static void abastecer_carros() {
    System.out.println("HOTEL {NOME DO HOTEL} - ABASTECER");
    main(null);
  }

  public static void erro() {
    System.out.println("Por favor, informe um número entre 1 e 4");
    main(null);
  }

  public static void sair() {
    System.out.println("Você deseja sair? S/N");

    Scanner sair = new Scanner(System.in);
    
    String escolha = sair.nextLine();
    if (escolha.equals("S")) {
      System.exit(0);
    } else if (escolha.equals("N")) {
      main(null);
    } else {
      System.out.println("Desculpe, mas não compreendi.");
      sair();
    }
    
  }
  
  public static void main(String[] args) {
    
    System.out.println("Selecione uma opção \n1.) Reserva de Quartos \n2.) Cadastro de Hóspedes \n3.) Abastecimento de Carros \n4.) Sair");

    Scanner in = new Scanner( System.in );

    int escolha  = in.nextInt();
    
  	if (escolha == 1) {
		reserva_quartos();
	} else if (escolha == 2) {
		cadastro_hospedes();
	} else if (escolha == 3) {
		abastecer_carros();
	} else if (escolha == 4) {
		sair();
	} else {
		erro();
	}
    
  }
}