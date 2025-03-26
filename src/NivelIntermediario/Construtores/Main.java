package NivelIntermediario.Construtores;

public class Main {
    public static void main(String[] args) {

        Hokages hashirama = new Hokages();
        hashirama.nome = "Hashirama Senju";

        Hokages tobirama = new Hokages("Tobirama Senju");
        System.out.println(tobirama.nome);

        Hokages hiruzen = new Hokages(40);
        System.out.println(hiruzen.idade);

        Hokages minato = new Hokages("Minato Namikaze", 32, false);
        System.out.println(minato.nome);
        System.out.println(minato.idade);
        System.out.println(minato.vivoOuNao);

        Hokages tsunade = new Hokages("Tsunade", 49, false);
    }
}
