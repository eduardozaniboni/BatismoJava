package NivelIntermediario.Desafios.Desafio4;

public class NinjaAvancado extends NinjaBasico implements Ninja {
    String especialidade;

    public NinjaAvancado() {
    }

    public NinjaAvancado(String nome, String aldeia, int idade, String especialidade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Meu nome é " + nome + ". Sou da " + aldeia + ". Tenho " + idade + " anos e minha habilidade especial é " + especialidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println(especialidade + " utilizada!");
    }

}
