package NivelIntermediario.Polimorfismo;

public class Uchiha extends Ninja {

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + ". Sou um Uchiha. Minha habilidade especial é de fogo.");
    }

}
