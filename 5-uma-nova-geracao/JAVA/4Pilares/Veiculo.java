import java.util.Scanner;

// ============================================================================
// ABSTRAÇÃO: Classe abstrata que serve como modelo para todos os veículos
// Abstração é quando criamos uma "ideia geral" de algo, sem todos os detalhes
// ============================================================================

abstract class Veiculo {
    // ENCAPSULAMENTO: Atributos privados só podem ser acessados por métodos
    // Encapsulamento é "esconder" os dados e controlar como são acessados
    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;

    // Construtor: método especial que cria um novo veículo
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0; // Todo veículo começa parado
    }

    // ENCAPSULAMENTO: Métodos públicos para acessar dados privados (getters)
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    // ENCAPSULAMENTO: Método para modificar a velocidade de forma controlada
    protected void setVelocidadeAtual(double velocidade) {
        if (velocidade >= 0) { // Proteção: velocidade não pode ser negativa
            this.velocidadeAtual = velocidade;
        }
    }

    // Método comum a todos os veículos
    public void acelerar(double incremento) {
        velocidadeAtual += incremento;
        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
    }

    // ABSTRAÇÃO: Método abstrato - cada veículo se move de um jeito diferente
    // Esse método PRECISA ser implementado pelas classes filhas
    public abstract void mover();

    // POLIMORFISMO: Método que pode ser sobrescrito pelas classes filhas
    // Polimorfismo é quando algo pode ter várias formas diferentes
    public void exibirInformacoes() {
        System.out.println("\n--- Informações do Veículo ---");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade: " + velocidadeAtual + " km/h");
    }
}