import java.util.Scanner;

// ============================================================================
// HERANÇA: Barco também herda de Veiculo
// ============================================================================

class Barco extends Veiculo {
    // Atributo específico de Barco
    private double comprimento; // em metros

    // Construtor do Barco
    public Barco(String marca, String modelo, int ano, double comprimento) {
        super(marca, modelo, ano);
        this.comprimento = comprimento;
    }

    // ABSTRAÇÃO: Implementação do método abstrato
    @Override
    public void mover() {
        System.out.println("O barco está navegando pelo mar! ⛵");
    }

    // POLIMORFISMO: Versão personalizada do método
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Comprimento: " + comprimento + " metros");
        System.out.println("Tipo: Barco");
    }

    // Método específico de Barco
    public void ancorar() {
        setVelocidadeAtual(0);
        System.out.println("Âncora lançada! Barco ancorado. ⚓");
    }
}