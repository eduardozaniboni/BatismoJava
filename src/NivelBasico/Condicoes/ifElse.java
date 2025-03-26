package NivelBasico.Condicoes;

public class ifElse {
    public static void main(String[] args) {

        /*
         * IF e ELSE - Condições
         * ELSE IF
         * Objetivo: Passar o ninja de nível de acordo com o número de missões
         * */

        // Ninja Naruto
        String nome = "Naruro Uzumaki";
        String rank;
        int idade = 10;
        boolean hokage = false;
        short numeroDeMissoes = 20;

        // se (condicao acontecer) {faca isso}
        if (numeroDeMissoes == 10 && idade > 15) {
            System.out.println("Rank: Chunnin");
        } else if (numeroDeMissoes >= 20) {
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Gennim");
        }

    }
}
