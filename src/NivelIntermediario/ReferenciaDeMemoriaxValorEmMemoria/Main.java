package NivelIntermediario.ReferenciaDeMemoriaxValorEmMemoria;

public class Main {
    public static void main(String[] args) {
        System.out.println("------- Naruto Uzumaki -------");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 17);
        System.out.println(naruto.toString());

        System.out.println("------- Sasuke Uchiha -------");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 18);
        System.out.println(sasuke.toString());
    }
}
