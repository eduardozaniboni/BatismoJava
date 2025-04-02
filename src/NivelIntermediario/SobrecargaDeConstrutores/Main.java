package NivelIntermediario.SobrecargaDeConstrutores;

public class Main {
    public static void main(String[] args) {

        // Objeto Uzumaki
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 17, 19, NivelNinja.GENIN);
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        // Objeto Uchiha
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 18, 20, NivelNinja.GENIN);
        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeBatalhaNinja();

        // Objeto Uchiha 2
        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da Folha", 27, 30, NivelNinja.CHUUNIN);
        itachi.habilidadeEspecial();
        itachi.estrategiaDeBatalhaNinja();

        // Objeto Uchiha 3
        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeia da Folha", 45, 900, NivelNinja.JOUNIN);
        madara.habilidadeEspecial();
        madara.estrategiaDeBatalhaNinja();
    }
}
