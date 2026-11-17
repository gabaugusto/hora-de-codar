import java.util.Scanner;

// ============================================================================
// HERANÇA: Avião também herda de Veiculo
// ============================================================================

class Aviao extends Veiculo {
    // Atributo específico de Avião
    private double altitudeMaxima; // em metros
    private boolean estaVoando;

    // Construtor do Avião
    public Aviao(String marca, String modelo, int ano, double altitudeMaxima) {
        super(marca, modelo, ano);
        this.altitudeMaxima = altitudeMaxima;
        this.estaVoando = false;
    }

    // ABSTRAÇÃO: Implementação do método abstrato
    @Override
    public void mover() {
        if (estaVoando) {
            System.out.println("O avião está voando pelo céu! ✈️");
        } else {
            System.out.println("O avião está taxiando na pista.");
        }
    }

    // POLIMORFISMO: Versão personalizada do método
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Altitude máxima: " + altitudeMaxima + " metros");
        System.out.println("Está voando: " + (estaVoando ? "Sim" : "Não"));
        System.out.println("Tipo: Avião");
    }

    // Métodos específicos de Avião
    public void decolar() {
        estaVoando = true;
        System.out.println("Decolando... O avião está subindo! 🛫");
    }

    public void pousar() {
        estaVoando = false;
        setVelocidadeAtual(0);
        System.out.println("Pousando... O avião está descendo! 🛬");
    }
}