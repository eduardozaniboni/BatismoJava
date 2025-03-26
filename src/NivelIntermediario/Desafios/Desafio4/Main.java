package NivelIntermediario.Desafios.Desafio4;

public class Main {
    public static void main(String[] args) {

        NinjaBasico ninjaBasico = new NinjaBasico("Ninja Básico", "Aldeia da Folha", 18);
        ninjaBasico.mostrarInformacoes();
        ninjaBasico.executarHabilidade();

        System.out.println();

        NinjaAvancado ninjaAvancado = new NinjaAvancado("Ninja Avançado", "Aldeia do Gelo", 18, "Muros Gélidos");
        ninjaAvancado.mostrarInformacoes();
        ninjaAvancado.executarHabilidade();

    }
}
