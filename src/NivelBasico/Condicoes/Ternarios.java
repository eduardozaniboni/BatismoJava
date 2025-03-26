package NivelBasico.Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        /*
         * Ternários: São maneiras de reduzir o código (funcionam como o IF ELSE)
         * variavel = (codicao) ? valorSeVerdadeiro : valorSeFalso;
         * */

        short numeroDeMissoes = 1;
        String nivelDoNinja = numeroDeMissoes >= 10 ? "Esse ninja está com mais de 10 missões" : "Esse ninja possuí menos de 10 missões";
        System.out.println(nivelDoNinja);
    }
}
