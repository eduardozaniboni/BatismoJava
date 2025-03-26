package NivelIntermediario.Heranca;

public class Boruto extends Uzumaki implements HyugaUzumaki {

    @Override
    public void ativarKarma() {
        System.out.println("Sou o " + nome + ". O Karma foi ativado! Sou um Hyuga Uzumaki");
    }

    @Override
    public void ativarJougan() {
        System.out.println("Sou o " + nome + ". O Jougan foi ativado! Sou um Hyuga Uzumaki");
    }
}
