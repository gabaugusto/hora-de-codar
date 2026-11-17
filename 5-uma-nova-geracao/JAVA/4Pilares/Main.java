
import java.util.Scanner;


// ============================================================================
// RESUMO DOS 4 PILARES:
//
// 1. ABSTRAÇÃO: Classe Veiculo abstrata define a "ideia" de um veículo
//    sem implementar todos os detalhes
//
// 2. ENCAPSULAMENTO: Atributos privados protegidos, acessados por métodos
//    públicos (getters/setters)
//
// 3. HERANÇA: Carro, Barco e Aviao herdam de Veiculo, recebendo suas
//    características e comportamentos
//
// 4. POLIMORFISMO: O mesmo método (mover, exibirInformacoes) se comporta
//    de forma diferente em cada classe
// ============================================================================


// ============================================================================
// CLASSE PRINCIPAL: Aqui testamos todos os conceitos
// ============================================================================

public class Main {
    public static void main(String[] args) {
        System.out.println("=== DEMONSTRAÇÃO DOS 4 PILARES DA POO ===\n");

        // Criando objetos (instâncias) de cada classe
        Carro meuCarro = new Carro("Toyota", "Corolla", 2023, 4);
        Barco meuBarco = new Barco("Yamaha", "SR310", 2022, 9.5);
        Aviao meuAviao = new Aviao("Boeing", "737", 2021, 12500);

        // POLIMORFISMO: Podemos tratar todos como Veiculos
        // Mesmo sendo tipos diferentes, todos são veículos!
        Veiculo[] frota = {meuCarro, meuBarco, meuAviao};

        System.out.println(">>> Testando POLIMORFISMO <<<");
        System.out.println("Movendo todos os veículos da frota:\n");

        // O método mover() se comporta diferente para cada veículo!
        for (Veiculo veiculo : frota) {
            veiculo.mover(); // Cada um se move de um jeito
            veiculo.acelerar(50);
        }

        // Testando métodos específicos de cada classe
        System.out.println("\n>>> Testando métodos específicos <<<\n");
        Scanner entrada = new Scanner(System.in);

        meuCarro.buzinar();
        meuCarro.exibirInformacoes();

        System.out.println();
        meuBarco.ancorar();
        meuBarco.exibirInformacoes();

        System.out.println();
        meuAviao.decolar();
        meuAviao.exibirInformacoes();
        meuAviao.pousar();

        // ENCAPSULAMENTO em ação: não podemos acessar os atributos diretamente
        // meuCarro.marca = "Honda"; // ERRO! marca é privado
        // Precisamos usar os métodos públicos (getters/setters)
        System.out.println("\n>>> Testando ENCAPSULAMENTO <<<");
        System.out.println("Marca do carro: " + meuCarro.getMarca());
        System.out.println("(Não conseguimos mudar a marca diretamente, ela está protegida!)");

        entrada.close();
    }
}
