import java.util.Scanner;

// ============================================================================
// HERANÇA: Carro herda (recebe) características da classe Veiculo
// Herança é quando uma classe "filha" recebe atributos e métodos da classe "pai"
// ============================================================================

class Carro extends Veiculo {
    // Atributo específico de Carro
    private int numeroDePortas;

    // Construtor do Carro
    public Carro(String marca, String modelo, int ano, int numeroDePortas) {
        super(marca, modelo, ano); // Chama o construtor da classe pai (Veiculo)
        this.numeroDePortas = numeroDePortas;
    }

    // ABSTRAÇÃO: Implementação do método abstrato da classe pai
    @Override
    public void mover() {
        System.out.println("O carro está dirigindo pela estrada! 🚗");
    }

    // POLIMORFISMO: Sobrescrevendo o método da classe pai
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes(); // Chama o método da classe pai
        System.out.println("Número de portas: " + numeroDePortas);
        System.out.println("Tipo: Carro");
    }

    // Método específico de Carro
    public void buzinar() {
        System.out.println("Biiiiip biiiiip! 🚗");
    }
}

