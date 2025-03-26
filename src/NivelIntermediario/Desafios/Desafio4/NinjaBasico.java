package NivelIntermediario.Desafios.Desafio4;

public class NinjaBasico implements Ninja {
    String nome;
    String aldeia;
    int idade;

    public NinjaBasico() {
    }

    public NinjaBasico(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Meu nome é " + nome + ". Sou da " + aldeia + ". Tenho " + idade + " anos e não tenho habilidade especial");
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Habilidade normal utilizada!");
    }

}
