package NivelBasico.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        /*
        * Laços de Repetição: Vão repetir infinitamente ou até atingir o parâmetro desejado
        * Existem dois: WHILE e FOR
        * */

        // While
        // Estrutura: while (condicaoVerdadeira) {Tudo aqui vai acontecer}

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

        while (numeroDeClones < numeroMaximoDeClones) {
            numeroDeClones++;
            System.out.println("O Naruto fez um clone da sombras: " + numeroDeClones + "/40");
        }
        System.out.println("");
        // For
        for (int i = 1; i <= 40; i++) {
            System.out.println("O Naruto fez um clone da sombras: " + i + "/40");
        }

    }
}
