package NivelIntermediario.FinalMethods;

public class Uzumaki extends Ninja {

    public Uzumaki() {
        super();
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + ". Sou um Uzumaki. Minha habilidade especial é de ar.");
    }

}
