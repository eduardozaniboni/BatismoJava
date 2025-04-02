package NivelIntermediario.SobrecargaDeMetodos;

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
        System.out.println("Essa é minha ESTRATEGIA de batalha");
    }

    // Inteligencia de combate
    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Essa é minha INTELIGENCIA de combate");
    }

    // Sobrecarga de metodo - Inteligencia de combate
    @Override
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println("Seu QI é: " + qi + " e você é um gênio");
        } else if (qi >= 130) {
            System.out.println("Seu QI é: " + qi + " e você é um ninja promissor");
        } else {
            System.out.println("Seu QI é: " + qi + " e você precisa treinar mais...");

        }
    }

    // Metodo sem @Override
    public void metodoProvisorio() {
        System.out.println("método provisório");
    }
}
