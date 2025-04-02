package NivelIntermediario.HerancaMultipla;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface, HokageInterface {
    public void boasVindas() {
        System.out.println(nome + ": Eu sou um Hatake");
    }

    // Metodo da interface
    @Override
    public void sharingaAtivado() {
        System.out.println(nome + ": Ativou o Sharingan!");
    }

    @Override
    public void ninjaDeElite() {
        System.out.println(nome + ": Faz parte da Anbu e é um Ninja de Elite");
    }

    @Override
    public void souHorage() {
        System.out.println(nome + ": Sou um Hokage");
    }
}
