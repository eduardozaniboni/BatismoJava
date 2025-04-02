package NivelIntermediario.FinalMethods;

public class Main {
    public static void main(String[] args) {
        // Objeto Uchiha
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 18);
        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeBatalhaNinja();
        sasuke.tacarKunai();
        System.out.println(sasuke.altura);

        // Objeto Uchiha 2
        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da Folha", 27);
        itachi.habilidadeEspecial();
        itachi.estrategiaDeBatalhaNinja();
    }
}
