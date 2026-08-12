abstract class Bicho {

    // Encapsulamento: estado interno privado, acessado por metodos controlados.
    //Modificadores de Acesso: os atributos sao privados para proteger o estado interno do bicho, e os metodos publicos ou protegidos controlam como esse estado pode ser alterado ou acessado.
    private String nome;
    public int pontosDeVida;
    private int nivelDeFome;
    private int nivelFelicidade;

    // Método Construtor. Inicializa o bicho com um nome e niveis padrao de fome e felicidade.
    public Bicho(String nome) {
        setNome(nome);
        this.nivelDeFome = 50;
        this.nivelFelicidade = 50;
    }

    // final: impede que subclasses sobrescrevam esses metodos, garantindo que a logica de acesso e modificacao do estado interno seja consistente em todas as classes filhas.
    public final String getNome() {
        return nome;
    }

    public final int getNivelDeFome() {
        return nivelDeFome;
    }

    public final int getNivelFelicidade() {
        return nivelFelicidade;
    }

    public final void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do bicho nao pode ser vazio.");
        }
        this.nome = nome.trim();
    }

    public void alimentar() {
        alterarFome(-10);
        System.out.println(nome + " foi alimentado. O nivel de fome diminuiu.");
    }

    public void brincar() {
        alterarFelicidade(10);
        System.out.println(nome + " brincou e ficou mais feliz.");
    }

    public void verificarStatus() {
        System.out.println("Status de " + nome + ":");
        System.out.println("- Nivel de fome: " + nivelDeFome);
        System.out.println("- Nivel de felicidade: " + nivelFelicidade);
    }

    public void passarTempo() {
        alterarFome(5);
        alterarFelicidade(-3);
        System.out.println(nome + " sentiu os efeitos do tempo passando.");
    }

    protected final void alterarFome(int delta) {
        nivelDeFome = limitarEntre0e100(nivelDeFome + delta);
    }

    protected final void alterarFelicidade(int delta) {
        nivelFelicidade = limitarEntre0e100(nivelFelicidade + delta);
    }

    private int limitarEntre0e100(int valor) {
        return Math.max(0, Math.min(100, valor));
    }

    // Abstracao: cada tipo de bicho define seu som e habilidade especial.
    public abstract String emitirSom();

    public abstract void habilidadeEspecial();

    public void interagir() {
        System.out.println(nome + " diz: " + emitirSom());
    }
}
