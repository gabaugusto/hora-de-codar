import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Projeto: 4 pilares de OOP");
        System.out.println("- Encapsulamento: atributos privados em Bicho");
        System.out.println("- Heranca: Cachorro e Gato herdam de Bicho");
        System.out.println("- Abstracao: metodos abstratos em Bicho");
        System.out.println("- Polimorfismo: mesmo metodo, comportamentos diferentes\n");

        System.out.println("Digite o nome do cachorro:");
        String nomeCachorro = entrada.nextLine();

        System.out.println("Digite o nome do gato:");
        String nomeGato = entrada.nextLine();

        Bicho[] bichos = {
            new Cachorro(nomeCachorro),
            new Gato(nomeGato)
        };

        while (true) {
            Bicho bichoAtual = escolherBicho(entrada, bichos);
            if (bichoAtual == null) {
                System.out.println("Escolha invalida de bicho. Tente novamente.\n");
                continue;
            }

            System.out.println("\nEscolha uma ação:");
            System.out.println("1. Alimentar " + bichoAtual.getNome());
            System.out.println("2. Brincar com " + bichoAtual.getNome());
            System.out.println("3. Verificar status");
            System.out.println("4. Usar habilidade especial");
            System.out.println("5. Demonstrar polimorfismo");
            System.out.println("6. Sair");

            if (!entrada.hasNextInt()) {
                entrada.nextLine();
                System.out.println("Digite um numero valido.\n");
                continue;
            }
            int escolha = entrada.nextInt();
            entrada.nextLine();

            switch (escolha) {
                case 1:
                    bichoAtual.alimentar();
                    break;
                case 2:
                    bichoAtual.brincar();
                    break;
                case 3:
                    bichoAtual.verificarStatus();
                    break;
                case 4:
                    bichoAtual.habilidadeEspecial();
                    break;
                case 5:
                    demonstrarPolimorfismo(bichos);
                    break;
                case 6:
                    System.out.println("Encerrando o projeto didatico. Ate mais!");
                    entrada.close();
                    return;
                default:
                    System.out.println("Escolha inválida. Tente novamente.");
            }

            bichoAtual.passarTempo();
        }
    }


    private static Bicho escolherBicho(Scanner entrada, Bicho[] bichos) {
        System.out.println("\nEscolha o bicho:");
        for (int i = 0; i < bichos.length; i++) {
            System.out.println((i + 1) + ". " + bichos[i].getNome() + " (" + bichos[i].getClass().getSimpleName() + ")");
        }

        if (!entrada.hasNextInt()) {
            entrada.nextLine();
            return null;
        }

        int indice = entrada.nextInt();
        entrada.nextLine();

        if (indice < 1 || indice > bichos.length) {
            return null;
        }
        return bichos[indice - 1];
    }

    private static void demonstrarPolimorfismo(Bicho[] bichos) {
        System.out.println("\nDemonstracao de polimorfismo:");
        for (Bicho bicho : bichos) {
            bicho.interagir();
            bicho.habilidadeEspecial();
        }
    }
}