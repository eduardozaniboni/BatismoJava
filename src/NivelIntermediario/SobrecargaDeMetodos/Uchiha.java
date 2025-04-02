package NivelIntermediario.SobrecargaDeMetodos;

public class Uchiha extends Ninja {

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + ". Sou um Uchiha. Minha habilidade especial é de fogo. Eu já complete: " + numeroDeMissoesConcluidas);
    }

    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Essa é minha INTELIGENCIA de combate");
    }

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

    // Annotation @Override
    // 1. Conversão: É uma boa prática (padronização do Java) adicionar o @Override
    // 2. Compilação: Previni possíveis erros de digitação entre metodos
    @Override
    public void metodoProvisorio() {
        System.out.println("método provisório uchiha");
    }
}
