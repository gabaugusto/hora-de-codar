class Cachorro extends Bicho {
    //Herda o construtor da classe Bicho para inicializar o nome do cachorro

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public String emitirSom() {
        return "Au au!";
    }

    @Override
    public void habilidadeEspecial() {
        alterarFelicidade(15);
        alterarFome(5);
        System.out.println(getNome() + " correu para buscar a bolinha!");
    }

    public void fingirDeMorto() {
        alterarFelicidade(10);
        alterarFome(4);
        System.out.println(getNome() + " fingiu de morto e se sentiu mais feliz.");
    }
}

