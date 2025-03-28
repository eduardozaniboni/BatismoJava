package NivelIntermediario.Polimorfismo;

public abstract class Ninja implements EstrategiaDeBatalha {
    String nome;
    String aldeia;
    int idade;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
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
