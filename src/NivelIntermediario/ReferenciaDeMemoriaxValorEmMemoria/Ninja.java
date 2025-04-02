package NivelIntermediario.ReferenciaDeMemoriaxValorEmMemoria;

public class Ninja {
    String nome;
    String aldeia;
    int idade;

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public Ninja() {
    }

    @Override
    public String toString() {
        return "Meu nome é: " + nome + ". Eu sou da " + aldeia + " e tenho " + idade + " anos.";
    }
}
