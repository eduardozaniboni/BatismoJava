package NivelIntermediario.Desafios.Desafio3;

public class Uchiha extends Ninja {
    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial() {
        System.out.println("Essa é minha habilidade especial: " + habilidadeEspecial);
    }

    public void mostrarInformacoes() {
        System.out.println("==== Informações do Ninja ====");
        System.out.println("- Nome: " + nome);
        System.out.println("- Idade: " + idade);
        System.out.println("- Missão: " + missao);
        System.out.println("- Nível de Dificuldade: " + nivelDificuldade);
        System.out.println("- Status da Missão: " + statusMissao);
        System.out.println("- Habilidade Especial Uchiha");
    }
}
