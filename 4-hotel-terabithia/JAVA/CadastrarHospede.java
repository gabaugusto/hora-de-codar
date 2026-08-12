/*
   Em Java, Arrays são tipos de dados não-mutáveis, ou seja, o tamanho do array é fixo e não podemos adicionar diretamente um novo elemento. No entanto, existem técnicas para burlar esta restroção. Vamos supor que temos um array chamado exemplo e precisamos adicionar elementos a ele.

  Podemos usar os seguintes métodos para adicionar elementos ao exemplo:
    1) Ao criar um array de tamanho maior que exemplo. 
    2) Usando ArrayList 
    3) Ao deslocar o elemento para ajustar o tamanho de exemplo.
   
  Neste exemplo vamos utilizar ArrayList que são muito parecidos com os   Arrays, mas possuem mutabilidade.
*/

import java.util.Scanner;
import java.util.ArrayList;

class Main {
    /* Aqui criamos duas variaveis globais. Global significa que o elemento pode ser acessado por qualquer método. Para tornar global, utilizamos a palavra static. */
    static ArrayList<String> lista_hospedes = new ArrayList<String>();
    static int init = 0;

 
    public static void cadastrar_hospedes() {
  
      System.out.println("Cadastro de Hóspedes. \nPor favor, informe o nome do Hóspede:");
      
      Scanner nh = new Scanner(System.in);
      String novo_hospede = nh.nextLine();
      lista_hospedes.add(novo_hospede);
      System.out.println(novo_hospede + " cadastrado com sucesso!");
      
      System.out.println("\n" + lista_hospedes.toString());
      
      main(null);
  }

  public static void pesquisar_hospedes() {
      System.out.print("Pesquisa de Hóspedes. \nPor favor, informe o nome do Hóspede: ");
      Scanner nh = new Scanner(System.in);
      String novo_hospede = nh.nextLine();
      
      System.out.println("\n" + lista_hospedes);
      if (lista_hospedes.contains(novo_hospede)) {
        System.out.println("\nEncontramos o(s) hóspede(s):");
        for (String element: lista_hospedes) {
          if (element.contains(novo_hospede)) {
            System.out.println(element);
          }
        }
      } else {
        System.out.println("Não encontramos hóspedes com esse nome");
      }
      main(null);
  }

  public static void erro_pesquisar_hospedes() {
    System.out.println("Por favor, informe um número entre 1 e 3");

    main(null);
  }

  public static void sair() {
    System.out.println("Você deseja sair? S/N");

    Scanner sair = new Scanner(System.in);

    String escolha = sair.nextLine();
    /* Quando utilizar a classe Scanner, compare os elementos utilizando equals. Equal é uma forma de comparação como o operador "==", mas que compara também onde a informação foi armazenada. */
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
    
    if (init == 0) {
      lista_hospedes.add("Fernando Netto");
      lista_hospedes.add("Gabriel Augusto Azevedo");
      lista_hospedes.add("Fernanda Monteiro");
      lista_hospedes.add("Eleanor Neves");
      lista_hospedes.add("Gabriel Paiva");
      lista_hospedes.add("Débora Menezes");
      lista_hospedes.add("Michael B Jordan");
      lista_hospedes.add("Priscila Gabriel");
      lista_hospedes.add("Noelia Vasquez");
      lista_hospedes.add("Carla Octaviano Azevedo");
      init = 1;
    }
    
    System.out.println("\nCadastro de Hóspedes\n\n Selecione uma opção: \n1. Cadastrar \n2. Pesquisar \n3. Sair");

    Scanner in = new Scanner(System.in);
    int escolha = in.nextInt();

    if (escolha == 1) {
      cadastrar_hospedes();
        
    } else if (escolha == 2) {
      pesquisar_hospedes();
        
    } else if (escolha == 3) {
      sair();
      
    } else {
      erro_pesquisar_hospedes();
    }

  }
}