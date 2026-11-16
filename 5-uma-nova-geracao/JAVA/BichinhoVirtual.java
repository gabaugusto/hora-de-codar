class BichinhoVirtual {

    String nome;
    int idade = 0;
    int nivelDeFome = 50;
    int nivelFelicidade = 50;

    // Construtor para inicializar o nome do bicho
    public BichinhoVirtual (String nome) {
        this.nome = nome;
    }

    public void alimentar() {
        nivelDeFome -= 10;
        System.out.println(this.nome + " foi alimentado. O nível de fome diminuiu.");
    }

    public void brincar() {
        nivelFelicidade += 10;
        passarTempo(1);
        System.out.println(this.nome + " está brincando e se sentindo mais feliz.");
    }

    public void verificarStatus() {
        System.out.println("Status atual de " + this.nome + ".");
        System.out.println("A idade de é " + this.idade + ".");
        System.out.println("Nível de fome: " + this.nivelDeFome);
        System.out.println("Nível de felicidade: " + this.nivelFelicidade);
    }

    public void passarTempo(int quantidadeDeDias) {
        nivelDeFome += quantidadeDeDias;
        idade += quantidadeDeDias;
        System.out.println("Passou-se " + quantidadeDeDias + " dia e " + this.nome + " está ficando mais velho e mais faminto com o passar do tempo.");
    }
}
