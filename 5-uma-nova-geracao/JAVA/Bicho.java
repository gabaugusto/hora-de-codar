import java.util.Scanner;

class Bicho {
    String nome;
    int nivelDeFome = 50;
    int nivelFelicidade = 50;

    // Construtor para inicializar o nome do bicho
    public Bicho(String nome) {
        this.nome = nome;
    }

    public void alimentar() {
        nivelDeFome -= 10;
        System.out.println(this.nome + " foi alimentado. O nível de fome diminuiu.");
    }

    public void brincar() {
        nivelFelicidade += 10;
        System.out.println(this.nome + " está brincando e se sentindo mais feliz.");
    }

    public void verificarStatus() {
        System.out.println("Status atual de " + this.nome + ":");
        System.out.println("Nível de fome: " + this.nivelDeFome);
        System.out.println("Nível de felicidade: " + this.nivelFelicidade);
    }

    public void passarTempo() {
        nivelDeFome += 5;
        System.out.println(this.nome + " está ficando mais faminto com o passar do tempo.");
    }
}
