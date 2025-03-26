package NivelIntermediario.Heranca;

public class Main {
    public static void main(String[] args) {
        // Objeto 1
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da Folha";
        naruto.idade = 17;
        naruto.ativarModoSabio();

        // Objeto 2
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 18;
        sasuke.ativarSharingan();

        // Objeto 3
        Haruno sakura = new Haruno();
        sakura.nome = "Sakura Haruno";
        sakura.aldeia = "Aldeia da Folha";
        sakura.idade = 18;
        sakura.ativarCura();

        // Objeto 4
        Hyuga hinata = new Hyuga();
        hinata.nome = "Hinata Hyuga";
        hinata.aldeia = "Aldeia da Folha";
        hinata.idade = 18;
        hinata.ativarByakugan();

        // Objeto 5
        Boruto boruto = new Boruto();
        boruto.nome = "Boruto Hyuga Uzumaki";
        boruto.aldeia = "Aldeia da Folha";
        boruto.idade = 9;
        boruto.ativarModoSabio();
        boruto.ativarKarma();
        boruto.ativarJougan();

    }
}
