package NivelIntermediario.Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Ninja ninja = new Ninja();
        ninja.nome = "Ninja";
        ninja.aldeia = "Aldeia da Folha";
        ninja.idade = 18;
        ninja.habilidadeEspecial();

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da Folha";
        naruto.idade = 17;
        naruto.habilidadeEspecial();

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 18;
        sasuke.habilidadeEspecial();
    }
}
