package NivelIntermediario.SobrecargaDeConstrutores;

public abstract class Ninja implements EstrategiaDeBatalha {
    // TODO: Incluir novos 2 atributos: numeroDeMissoesConcluidas, Rank
    // TODO: Rank: GENIN, CHuUNIN, JOUNIN, HOKAGE

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    // TODO: Sobrecarga do construtor chamando os novos atributos
    // Sobrecarga de métodos, você não precisa redeclarar o construtor, somente os novos atributos
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    /* Metodos geral! Todos os ninjas vao ter */
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + ". Sou um Ninja. Minha habilidade especial é normal.");
    }

    // Sobreescrevendo o metodo da interface
    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Essa é minha estratégia de batalha");
    }
}
