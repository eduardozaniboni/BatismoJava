package NivelIntermediario.HerancaMultipla;

public class Uchiha extends Ninja implements SharinganInterface {

    // Esse metodo vem direto da interface!
    @Override
    public void sharingaAtivado() {
        System.out.println(nome + ": Ativou o Sharingan!");
    }
}
