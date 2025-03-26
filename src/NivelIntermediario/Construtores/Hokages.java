package NivelIntermediario.Construtores;

public class Hokages {

    String nome;
    int idade;
    boolean vivoOuNao;

    // Construtor sem argumentos - NoArgs Constructor
    public Hokages() {
    }

    // Construtor com argumentos
    public Hokages(String nome) {
        this.nome = nome;
    }

    public Hokages(int idade) {
        this.idade = idade;
    }

    // Construtor com TODOS argumentos - AllArgs Constructor
    /*
    public Hokages(String nome, int idade, boolean vivoOuNao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }
    */

    // Shortcut para Constructor (CTRL + Vírgula)
    public Hokages(String nome, int idade, boolean vivoOuNao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }
}
